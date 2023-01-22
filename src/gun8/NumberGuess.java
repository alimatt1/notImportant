package gun8;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Random rnd = new Random();

        int num = rnd.nextInt(50)+1;
        guessingGame(num);
    }

    public static void guessingGame(int no) {
        System.out.println("Guess a number between 1 and 50: ");
        System.out.println(no)
        ;
        int counter=0;
        try {
            do {
                int guessedNum = scn.nextInt();
                if ((guessedNum > 50) || (guessedNum < 0)) {
                    System.out.println("Stay in the Limits hell yeah");
                    throw new OutOfRangeException();
                }

                if (guessedNum > no) {
                    System.out.println("It is high broo");
                    if ((5 > guessedNum - no) &&(0 < guessedNum - no)  || ((no - guessedNum) < 5)&& (no - guessedNum) >0 ) {
                        System.out.println("You are Damn Close");
                    }
                    counter++;
                } else if (guessedNum < no) {
                    System.out.println("Terrain Terrain nose up nose up");
                    if ((5 > guessedNum - no) &&(0 < guessedNum - no)  || ((no - guessedNum) < 5)&& (no - guessedNum) >0 ) {
                        System.out.println("You are Damn Close");
                    }
                    counter++;
                } else if (guessedNum == no) {
                    counter++;
                    System.out.println("BinGOOO You hit the Number " + no + " within " + counter + " attempts.");

                    System.exit(0);
                }

            }while (true) ;

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input ");
            guessingGame(no);
        }catch (OutOfRangeException ex){
            System.out.println(ex.getMessage());
        }
    }
}