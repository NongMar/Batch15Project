package SyntaxProject01;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        2)Using Scanner create an array of countries. When an array is created, retrieve all values
        from it and while retrieving those values print capital for each country. (use 2 different loops).
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 countries");
        String [] country=new String[4];
        String[] capitols={"Paris","London","DC","Tokyo"};

        for(int i=0;i<country.length;i++){
            country[i]=sc.nextLine();

        }
        for(int j=0;j<capitols.length;j++) {

        }
        System.out.println(Arrays.toString(country)+Arrays.toString(capitols));







    }
}
