package gun8_MapTeacher;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {

    //bize ogrenciMap doonduren bir method olusturun.
    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap= new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {
        //1-tum valueleri bir collection olarak kaydedelim
        //  [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MD]
         Collection<String> valuesCollection= ogrenciMap.values();

        //2-for-each kullanarak her bir valueyi ele alalim
        //3- -'yi kullaanrak split yapalim [Ali, Can, 11, H, MF]
        //4- split yaptigimiz arrayden isim bilgisini alalim 0.indexi
        //5- eger valueden aldigimiz deger aranan deger isim ile ayni ise
        //  true dondurum,for-eazhi bitirelim.
        // 6- for-each bittiginde true olmadiysa false dondureklim

        for (String eachValue:valuesCollection
             ) {
            String[] valueArr=eachValue.split("-");
            String valuedekiIsim=valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }
        }
        return false;

    }

    public static void soyIsimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {
        //1- mapteki valuleri bir collection olarak kaydedeilim.
        Collection<String> ogrenciValueCollection =ogrenciMap.values();
        //listenin ilk satiri olarak baslikalri
        System.out.println("Isim  Soyisim  Sinif  Sube");

        //2- her valueyi for each ile ele alalim
        //3- valueyi - ile split yapip array elde edelim.
        //4- arrayin 1. indexde ki soy isme bakip ayni ise
        //   isim, soyisim,sinif,sube bulgulerini yazdiralim

        for (String eachValue:ogrenciValueCollection
             ) {
            String [] valueArr=eachValue.split("-");
            String valudekiSoyIsim=valueArr[1];
            if (valudekiSoyIsim.equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[0]+ " "+
                                   valueArr[1]+ " "+
                                   valueArr[2]+ " "+
                                   valueArr[3]+ " ");
            }
        }

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {
        Collection<String> valueCollection=ogrenciMap.values();

        // verilen sinif ve sube ismi ile sinif liseteesini yazdiran method olusturun
        for (String eachValue:valueCollection
             ) {
            String[] valueArr=eachValue.split("-");

            if (valueArr[2].equalsIgnoreCase(sinif)&& valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(valueArr[0]+ " "+
                                   valueArr[1]);
            }
        }


    }
    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {

        // 1- okul numarasini biliyoruz, direk ogrenci value'ye ulasabiliriz

        String ogrenciValue= ogrenciMap.get(okulNo); // Ayse-Can-10-H-MF

        String[] valueArr= ogrenciValue.split("-"); // [Ayse, Can, 10, H, MF]

        // 2- sube ismini guncelleyelim

        valueArr[3]=yeniSubeIsmi; //  [Ayse, Can, 10, M, MF]

        // 3- array'deki guncel bilgileri yeniden value formatinda bir String yapalim

        String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+
                valueArr[3]+"-"+valueArr[4];

        // 4- ogrenci no yani key ile yeni value'yu map'e ekleyelim

        ogrenciMap.put(okulNo,yeniValue);

        return ogrenciMap;
    }


}
