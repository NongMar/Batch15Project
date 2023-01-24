package SyntaxProject01;
import java.util.Arrays;
public class Task9 {
    public static void main(String[] args) {
        /*
        9)Maximum and minimum number in the array?
         */
         int[] arr={55,34,64,23,67,45,78,34,83,27,43,67,};
         Arrays.sort(arr);
         System.out.println("min is "+arr[0]+ " and max is "+ arr[arr.length-1]);




    }
}
