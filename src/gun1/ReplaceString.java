package gun1;

public class ReplaceString {
    //How to replace string with another string in java Program

    public static void main(String[] args) {
        String myWord= "sometimes i want to go the moon";

        System.out.println(myWord.replace('o','e'));//semetimes i want to ge the the meen

        System.out.println(myWord.replace("me","ki"));//sokitikis i want to go the moon

        System.out.println(myWord.replaceFirst("me","za"));//sozatimes i want to go the moon

        System.out.println(myWord.replaceAll("me","lo"));//solotilos i want to go the moon

    }
}
