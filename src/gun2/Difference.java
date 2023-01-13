package gun2;

public class Difference {

    public static void main(String[] args) {
        //Difference between Static and Instance method working in java Program

        display(); //calling without object

        Difference t = new Difference();

        t.show();

    }

        //calling using object }
    private static void display() {
        System.out.println("Programming is amazing.");
    }

    private void show() {
        System.out.println("Java is awesome.");
    }
}
