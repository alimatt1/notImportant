package gun3;

public class ConstructorWorkingRunner {
    public static void main(String[] args) {

        ConstructorWorking abc= new ConstructorWorking();




        ConstructorWorking pen = new ConstructorWorking();

        pen.marka = "konami";
        pen.model = "pes2013";

        System.out.println(pen);//

        ConstructorWorking pen3=new ConstructorWorking("soft");

        System.out.println(pen3);//

        ConstructorWorking pen4=new ConstructorWorking("asus","macbookPro",2019);
        pen4.model="air";

        System.out.println(pen4);//



    }
}
