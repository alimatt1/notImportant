package gun9;

import gun8_MapTeacher.MapMethodDepo;

import java.util.Map;

public class SinifListesiYazdirma {
    public static void main(String[] args) {

        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");
    }
}
