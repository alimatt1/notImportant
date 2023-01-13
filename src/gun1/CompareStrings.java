package gun1;

import java.util.Scanner;

public class CompareStrings{
    //How to complete 2 string in Java program

    public static void main(String[] args) {


        String first,second;
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter the first string ");
        first= scan.nextLine();

        System.out.println("please enter the second string");
        second=scan.nextLine();

        System.out.println(first.compareTo(second));//

        if (first.compareTo(second)>0){
            System.out.println("First string is greater than second.");
        } else if (first.compareTo(second)<0) {
            System.out.println("First string is smaller than second.");
        }else
            System.out.println("both strings are equal.");

    }
}
