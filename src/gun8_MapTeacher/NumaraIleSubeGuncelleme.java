package gun8_MapTeacher;

import java.util.Map;

public class NumaraIleSubeGuncelleme {
    //numarasiverilen ogrencinin sube ismini verilen sube yapan bir method olusturun

    public static void main(String[] args) {
        //ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap, 110, "L");
        //System.out.println(ogrenciMap);
        //

        Map<Integer, String > ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,104,"M");
        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,101,"L");

        System.out.println(ogrenciMap);
    }
}
