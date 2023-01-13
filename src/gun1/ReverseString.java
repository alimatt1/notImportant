package gun1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Print reverse string in java Program

        System.out.println("enter a String to reverse ");
        Scanner scan=new Scanner(System.in);
        String input= scan.next();
        String reverse="";

        for (int i = input.length()-1; i>=0 ; i--) {
            reverse+=input.charAt(i);
        }
        System.out.println(reverse);//
    }
}
