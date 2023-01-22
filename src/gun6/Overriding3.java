package gun6;

import gun5.Apple;
import gun5.BMacBook;
import gun5.CMacBookPro;

public class Overriding3 extends Overriding2 {


    @Override
    void method1() {
        System.out.println("3.classdaki override edden method1 calisti.");;
    }

    public static void main(String[] args) {

        Overriding2 laf = new Overriding3();

        laf.method1();//
        laf.method2();//

    }

    String cpu="M2";
    String price="depends on the year :D";
    Boolean gift=false;

    /*System.out.println(mac1.cpu);//M2
        System.out.println(mac1.gift);//false
        System.out.println(mac1.price);//depends on the year :D
        System.out.println(mac1.brand);//Apple
        System.out.println(mac1.colour);//not specified
        System.out.println(mac1.productionPlace);//USA
        System.out.println(mac1.year);//0

        System.out.println(mac2.brand);//Apple
        System.out.println(mac2.colour);//not specified
        System.out.println(mac2.cpu);//IOS
        System.out.println(mac2.year);//0
        System.out.println(mac2.productionPlace);//USA


        System.out.println(mac3.productionPlace);//

     */

}
