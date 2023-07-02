//package Multithreading;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class ArrayMultiThread {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[100];
//        for (int i=0; i<arr.length; i++){
//            arr[i] = i + 1;
//        }
//
//        ExecutorService ex = Executors.newFixedThreadPool(5);
//
//        int subArraySize = arr.length/5;
//        int start = 0;
//        int end = subArraySize;
//
////        PartialSum psum = new PartialSum();
//
//        int[] subArrays = new int[5];
//        for (int i=0; i<subArraySize; i++){
//            subArrays[i] = new PartialSum(, start, end);
//        }
//
//        ex.submit(new Callable<PartialSum>() {
//            @Override
//            public PartialSum call() throws Exception {
//
////                psum.calculateSum();
////                return null;
//            }
//        });
//    }
//
//    static class PartialSum implements Callable<Integer>{
//
//        int arr[];
//        int start;
//        int end;
//        public PartialSum(int[] arr, int start, int end){
//            this.arr = arr;
//            this.start = start;
//            this.end = end;
//        }
//
//
//        public void calculateSum(){
//            int sum = 0;
//            for (:
//                 ) {
//
//            }
//        }
//
//        @Override
//        public Integer call() throws Exception {
//            return null;
//        }
//    }
//
//
//
//
//
//}
