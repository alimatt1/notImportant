package gun4;

import static com.sun.javafx.util.Utils.sum;

public class Varargs {
    public static void main(String[] args) {

        sum(42,33,1,2,3,4,5,6);

    }

    private static void sum(int a,int... b) {
        
        int toplam=0;

        for (int each: b ) {

            toplam+=each;

        }
        System.out.println(a+toplam);

    }
}
