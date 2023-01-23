package gun8_MapTeacher;

import java.util.Map;

public class SoyIsimIleOgrenciArama {
    //ogrenci mapde aradigimiz soyisimdeki ogrencilerin
    // isim,soyisim,sinif ve sube bilgilerini yazdiran bir method olusturun
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyIsimIleOgrenciListesiYazdirma(ogrenciMap,"Can");//
        //Isim  Soyisim  Sinif  Sube
        //Ali Can 11 H
        //Ayse Can 10 H
        //Sevgi Can 10 K



    }

}
