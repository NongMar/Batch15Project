package SyntaxProject01;

public class Task6 {
    public static void main(String[] args) {
        /*
        6)Write a program to swap 2 numbers without a temporary variable?
        Explanation:

    First, we have two integer variables x and y.
    1)Then we are adding x and y and storing the value in x.
    2)Now x holds the sum of x and y, and we are subtracting y from x and storing it in y.
    3)Finally, we are again subtracting y from x and storing it in x.
    After the above steps, the values of x and y are swapped.
         */
        int x=7;
        int y=10;
        //step 1
        x= x + y;
        //step2
        y=x-y;
        //step 3
        x=x-y;
        System.out.println("This is x that =7 after the swap with y=10 : "+x);
        System.out.println("This is y that =10 after the swap with x=7 : "+y);
    }
}
