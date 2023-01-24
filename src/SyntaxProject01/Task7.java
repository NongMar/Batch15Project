package SyntaxProject01;



public class Task7 {
    public static void main(String[] args) {
        /*
        7)Write a java program to check whether a given number is prime or not?
         */

         int num=2;
         boolean n=false;

         for(int i=2;i<=num/2;i++) {
             if (num % i == 0) {
                 n = true;
                 break;
             }

         }
         if(!n){
             System.out.println(num+ " is prime");
         }else{
             System.out.println(num+ " is not prime");
         }
         }

}
