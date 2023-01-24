package SyntaxProject01;

public class Task11 {
    public static void main(String[] args) {
        /*
        11)Write a program to print out duplicate elements from an Array of Strings?
         */
          int[] arr={2,4,55,4,6,2,34,7,1,7};

          for(int i=0;i<arr.length;i++){

              for(int j=i+1;j<arr.length;j++){
                  if(arr[i]==arr[j]){
                      System.out.println(arr[j]);
                  }
              }

          }



    }
}
