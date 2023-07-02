package ReverseandFibonacci;

public class Fibonacci {
    int a=0, b=1;
    int c;

    public void fibSeries(int n){


        int i = 2;
        System.out.print("The fibonacci series is: ");
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }while(i <= n+1);
    }
}
