package gun9;

import gun8_MapTeacher.MapMethodDepo;

import java.util.Map;

public class BolumListesiYazdirma {
    public static void main(String[] args) {
        // verilen bolumdeki ogrencilerin
        // No, isim soyisim ve siniflarini yazdiran
        // bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"MF");

    }
}
