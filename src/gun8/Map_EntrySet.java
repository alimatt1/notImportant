package gun8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_EntrySet {
    public static void main(String[] args) {

        Map<Integer,String> students=new HashMap<>();

        students.put(100,"Ali-Mat-25-coffee");
        students.put(101,"Idil-Tarikogullari-24-coffee");
        students.put(102,"mehmetcan-kurt-27-tea");
        students.put(103,"bugra-colaker-24-tea");
        students.put(104,"irfan-kus-24-which one is free?");

        Set<Integer> ogrenciNoSeti=students.keySet();

        for (Integer eachKey:ogrenciNoSeti         ) {
            System.out.println(eachKey+ " = " + students.get(eachKey));
            //100 = Ali-Mat-25-coffee
            //101 = Idil-Tarikogullari-24-coffee
            //102 = mehmetcan-kurt-27-tea
            //103 = bugra-colaker-24-tea
            //104 = irfan-kus-24-which one is free?
        }
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=students.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            System.out.println(eachEntry);
        }
        System.out.println("++++++++++++++++++++++++++\n+++++++++++++++++++++");

        Set<Map.Entry<Integer, String>> integerStringEntry= students.entrySet();

        for (Map.Entry<Integer,String> eachEntry: integerStringEntry
             ) {
            String entryValue=eachEntry.getValue();

            String[] valueArr=entryValue.split("-");

            if (valueArr[3].equalsIgnoreCase("tea")){
                System.out.println(eachEntry.getKey() + " "+
                                   valueArr[0] + " " +
                                   valueArr[1] + " " +
                                   valueArr[2] + " " );

            }
        }


    }
}
