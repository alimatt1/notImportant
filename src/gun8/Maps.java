package gun8;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> students=new HashMap<>();

        students.put(100,"Ali-Mat-25-coffee");
        students.put(101,"Idil-Tarikogullari-24-coffee");
        students.put(102,"mehmetcan-kurt-27-tea");
        students.put(103,"bugra-colaker-24-tea");
        students.put(104,"irfan-kus-24-which one is free?");

        System.out.println(students);
        //{100=Ali- Mat- 25- coffee , 101=Idil- Tarikogullari- 24- coffee, 102=mehmetcan- kurt- 27- tea, 103=bugra- colaker- 24- tea, 104=irfan- kus- 24- which one is free?}


        System.out.println(students.keySet());//[100, 101, 102, 103, 104]
        System.out.println(students.values());//[Ali- Mat- 25- coffee , Idil- Tarikogullari- 24- coffee, mehmetcan- kurt- 27- tea, bugra- colaker- 24- tea, irfan- kus- 24- which one is free?]

        System.out.println(students.containsValue("mehmetcan-kurt-27-tea"));//true

        Collection<String> kisiler=students.values();
        List<String> caycilar=new ArrayList<>();
        String[] tea;

        for (String each:kisiler         ) {

            tea=each.split("-");
            if (tea[3].equalsIgnoreCase("tea")){
                caycilar.add(tea[0]);
            }
        }
        System.out.println(caycilar);//[mehmetcan, bugra]

        //101 numarali ogrencinin soyismini mat yapin

        //istenen key’e ait value’yu bir String’e kaydet.
        String istenenSoyIsim=students.get(101);
        System.out.println(istenenSoyIsim);//Idil- Tarikogullari- 24- coffee

        //Value’yu ayirac ile split yapip bir array’e kaydet
        String [] ayirma= istenenSoyIsim.split("-");
        System.out.println(Arrays.toString(ayirma));//[Idil, Tarikogullari, 24, coffee]

        // Array’de istenen update’i yap
        ayirma[1]="mat";
        System.out.println(Arrays.toString(ayirma));//[Idil, mat, 24, coffee]

        //4- Array’deki bilgileri birlestirip value formatina uygun bir String yap
        String kisiYeniSoyIsimli= ayirma[0]+ "-" +
                                  ayirma[1]+ "-" +
                                  ayirma[2]+ "-" +
                                  ayirma[3]+ "-" ;

        //5- Yeni value’yu key ile map’e ekle\
        students.put(101,kisiYeniSoyIsimli);
        System.out.println(students);
        //{100=Ali-Mat-25-coffee, 101=Idil-mat-24-coffee-, 102=mehmetcan-kurt-27-tea, 103=bugra-colaker-24-tea, 104=irfan-kus-24-which one is free?}

















    }
}
