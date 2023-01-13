package gun2;

public class Program {

    String brand="ios";

    int Yil= 2015;

    Program(){
        System.out.println("Constructor method called.");


    }

    public Program(String model, int year, String product){
        model="microsoft";
        year= 2019;
        product="windows11";



    }


    public static void main(String[] args) {
        Program object= new Program();//Constructor method called.

    }
}
