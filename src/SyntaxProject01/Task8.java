package SyntaxProject01;

public class Task8 {
    public static void main(String[] args) {
        /*
        8)Write a Java Program to print the first 10 numbers of Fibonacci series.

        Fib =10 specify the series that will be printed
        num1 and num2 are the two first numbers in the series
        for loop will iterate the Fib number of times adding previous two terms together to generate next numbers and
        updating them for the next iteration
         */

        int Fib=10;
        int num1=0;
        int num2=1;

        for(int i=1;i<=Fib;i++){
            System.out.print(num1 + " ");

            int series=num1+num2;
            num1=num2;
            num2=series;


        }




    }
}
