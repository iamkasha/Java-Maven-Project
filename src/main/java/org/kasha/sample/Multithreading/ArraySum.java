package org.kasha.sample.Multithreading;

import java.util.List;
import java.util.concurrent.*;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        ExecutorService executor = Executors.newFixedThreadPool(5);
        int partitionSize = array.length / 5;
        int startIndex = 0;
        int endIndex = partitionSize;

        // Create an array of Callable tasks
        SumCalculatorTask[] tasks = new SumCalculatorTask[5];
        for (int i = 0; i < 5; i++) {
            tasks[i] = new SumCalculatorTask(array, startIndex, endIndex);
            startIndex = endIndex;
            endIndex += partitionSize;
        }

        // Invoke all tasks and collect the Futures
        try {
            Future<Integer>[] futures = executor.invokeAll(List.of(tasks)).toArray(new Future[0]);

            int finalSum = 0;
            for (Future<Integer> future : futures) {
                finalSum += future.get();
            }

            System.out.println("Sum of array elements: " + finalSum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }

    private static class SumCalculatorTask implements Callable<Integer> {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;

        public SumCalculatorTask(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
}
