package gun4;

public class StringBuilderClass {
    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("dedikodu");

        str.append("nasildir");

        System.out.println(str);//dedikodunasildir

        System.out.println(str.subSequence(6, 9));//dun

        System.out.println(str.insert(8, "mun"));//





    }
}
