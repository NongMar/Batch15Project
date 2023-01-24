package SyntaxProject01;

public class Task5 {
    public static void main(String[] args) {
        /*
        5)Create a 2D array of integers.
        Develop a program which will calculate the sum of  even and odd numbers for that array.
         */

        int [][] arr={{2, 5, 8, 11, 14},
                {17, 20, 23, 26, 29}
        };

        int evenSum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0){
                    evenSum=evenSum+arr[i][j];
                }
            }
        }

        int oddSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    oddSum=oddSum+arr[i][j];
                }
            }
        }
        System.out.print(evenSum+" "+oddSum+" ");





    }







}
