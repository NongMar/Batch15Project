package SyntaxProject01;

public class Task4 {
    public static void main(String[] args) {
        /*
        4) Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] arr={{2,11,20,26,5},
                {8,14,17,23,29}
        };

        for(int i=0;i<arr.length;i++) {


            for (int j = 0; j <arr[i].length; j++) {
                if ((arr[i][j] % 2) == 0) {
                    System.out.print(arr[i][j]+" ");
                }

            }

        }


    }
}
