package gun5;

public class CMacBookPro extends BMacBook{
    String cpu="M2";
    String price="depends on the year :D";

    Boolean gift=false;

    public static void main(String[] args) {
        CMacBookPro mac1=new CMacBookPro();

        System.out.println(mac1.cpu);//M2
        System.out.println(mac1.gift);//false
        System.out.println(mac1.price);//depends on the year :D
        System.out.println(mac1.brand);//Apple
        System.out.println(mac1.colour);//not specified
        System.out.println(mac1.productionPlace);//USA
        System.out.println(mac1.year);//0

        BMacBook mac2=new BMacBook();
        System.out.println(mac2.brand);//Apple
        System.out.println(mac2.colour);//not specified
        System.out.println(mac2.cpu);//IOS
        System.out.println(mac2.year);//0
        System.out.println(mac2.productionPlace);//USA

        Apple mac3=new CMacBookPro();
        System.out.println(mac3.productionPlace);//


    }
}
