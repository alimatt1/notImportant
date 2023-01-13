package gun1;

public class IndexOf {
    //How to use indexOf() in java Program

    public static void main(String[] args) {


        String inputOne="tell me about yourself";

        System.out.println(inputOne.indexOf('l'));//2

        System.out.println(inputOne.indexOf("ab"));//8

        System.out.println(inputOne.indexOf("el",6));//19

        System.out.println(inputOne.indexOf('u',12));//16


    }
}
