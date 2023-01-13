package gun1;

import java.util.Scanner;

public class Palindrome {
    //. Check Given No is palindrome or Not in java Program

    public static void main(String[] args) {
        System.out.println("please enter a string for Palindrome ");
        Scanner scan=new Scanner(System.in);
        String input= scan.next();
        String reverse="";

        for (int i =input.length()-1; i >=0; i--) {
            reverse+=input.charAt(i);

        }

        if (input.equals(reverse)){
            System.out.println("this string is a PALINDROME");
        }else
            System.out.println("not POLINDRoME");
    }
}
