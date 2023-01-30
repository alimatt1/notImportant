package gun9;

import gun8_MapTeacher.MapMethodDepo;

import java.util.Map;

public class SoyIsimleriBuyukHarfYapma {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap= MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeOlustur(ogrenciMap);//


    }
}
