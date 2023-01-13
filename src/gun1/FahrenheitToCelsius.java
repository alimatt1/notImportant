package gun1;

import java.util.Scanner;

public class FahrenheitToCelsius {
    //How to convert Fahrenheit to Celsius Program in java
    //temperatue = ((temperatue - 32)*5)/9;

    public static void main(String[] args) {
        float theCelcius;
        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter temperatur in Fahrenheit");
        float theFDegree=scan.nextFloat();

        theCelcius=((theFDegree-32)*5)/9;
        System.out.println("The Celcius Temparatur is " + theCelcius);

    }


}
