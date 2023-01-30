package gun9;

import java.util.HashMap;
import java.util.Map;

public class CumledeHarfSayilariniBulma {
    // verilen bir cumlede kullanilan harfi ve kacar kez kullanildigini yazdirin

    // Ornek : Java candir
    // output :  J=1, a=3, v=1, c=1, n=1, d=1, i=1, r=1



    public static void main(String[] args) {
        String cumle="Java candir";

        // oncelikle bosluk ve noktalama isaretlerini yok edelim

        cumle=cumle.replaceAll("\\W","");// java candir

        String[] cumleArr=cumle.split("");

        Map<String,Integer> kullanimSayilariMap=new HashMap<>();

        for (int i = 0; i < cumleArr.length ; i++) {
            //her bir elementi ele alip mapte key oalrak yoksa value=1 olarak ekleriz
            //mapte key olarak varsa value bir artirilmali

            if (!kullanimSayilariMap.containsKey(cumleArr[i])) {
                kullanimSayilariMap.put(cumleArr[i], 1);
            }
            else{
                int eskiValue = kullanimSayilariMap.get(cumleArr[i]);
                    kullanimSayilariMap.put(cumleArr[i], eskiValue + 1);
            }
                }
        System.out.println(kullanimSayilariMap);
            }
        }