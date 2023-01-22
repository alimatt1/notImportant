package gun7;

import java.util.LinkedList;

public class CollectionsWorking {
    public static void main(String[] args) {
        LinkedList <Integer> myList=new LinkedList<>();

        myList.add(12);
        myList.add(14);
        myList.add(15);
        System.out.println(myList);//[12, 14, 15]

        myList.add(1,32);
        System.out.println(myList);//[12, 32, 14, 15]


    }
}
