package SyntaxProject01;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        /*
        10)Write a java program to find the second largest number in the array?
         */
         int[] arr={21,43,22,33,54,73,25,67,3,2,7,43,78,99,65,102,34,67,32,78,99,76,54,5,9,32,6,};


        Arrays.sort(arr);
        int secondLargest=arr[arr.length-2];
        System.out.println("Second largest number is "+ secondLargest);



    }
}
