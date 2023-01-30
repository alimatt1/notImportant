package gun8_MapTeacher;

import java.util.Map;

public class SubeListesiOlusturma {
    // verilen sinif ve sube ismi ile sinif liseteesini yazdiran method olusturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.subeListesiYazdirma(ogrenciMap,"10","k");
        //


    }
}
