package gun4;

public class GetterSetter {
    public static void main(String[] args) {


        GetterSetter2 deneme = new GetterSetter2();

        System.out.println(deneme.isAtPilat());//treu


        System.out.println(deneme.getLaf());//kabzimal

        deneme.setLaf("hakikaten");
        deneme.setLaf("neden olmiyor");//
        System.out.println(deneme.setAtPilat());//false

    }
}
