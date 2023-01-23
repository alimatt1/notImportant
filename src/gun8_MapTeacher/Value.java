package gun8_MapTeacher;

import java.util.Map;

public class Value {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap.put(110,"Cemal-Han-12-M-MD");

        System.out.println(ogrenciMap);//
        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MD]

        // verilen ismin ogrenciMap'de olup olmadigini kontrol edip
        // true veya false donen bir method olusturun

        boolean sonuc= MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");
        System.out.println(sonuc);//true

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "kemal"));//false


    }
}
