
package solid;

import java.util.List;
import java.util.ArrayList;

public class Veritabani {
    
    private List<Kullanici> kullanicilar;
    private List<Urun> urunler;
    private static Veritabani veritabani = new Veritabani();
    
    public Veritabani (){
        kullanicilar = new ArrayList<>();
        urunler = new ArrayList<>();
    }
    
    public void kullaniciEkle(Kullanici kullanici){
        kullanicilar.add(kullanici);
    }
    public void urunEkle (Urun urun){
        urunler.add(urun);
    }
    public void kullaniciGoster(){
        for(Kullanici kullanici : kullanicilar){
            System.out.println();
        }
    }
    public void urunGoster(){
        for(Urun urun : urunler){
            System.out.println(urun.getIsim());
        }
    }
    
    public static Veritabani getVeritabani(){
        return veritabani;
    }
}
