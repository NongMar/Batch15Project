package SyntaxProject01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1)Using Scanner create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
         */

        Scanner sc=new Scanner(System.in);

        int[] x=new int[2];
        int sum=0;
        System.out.println("Enter 2 numbers");
        for(int i=0;i<x.length;i++){

            x[i]=sc.nextInt();
        }
        for(int num:x){
            sum=sum+num;
        }
        System.out.println("Sum of elements is: "+sum);



    }
}
