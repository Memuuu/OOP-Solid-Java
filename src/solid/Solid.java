
package solid;


public class Solid {

    
    public static void main(String[] args) throws Exception {
      
        Urun bilgisayar = new Urun("Bilgisayar", 10000);
        Urun telefon = new Urun("Telefon", 5000);
        
        Musteri sefa = new Musteri("Sefa");
        Satici hakan = new Satici("Hakan");
        Veritabani.getVeritabani().kullaniciEkle(sefa);
        Veritabani.getVeritabani().kullaniciEkle(hakan);

        sefa.g1.girisYap();
        hakan.g2.girisYap();
        
        hakan.urunEkle(bilgisayar);
        hakan.urunEkle(telefon);
        
        sefa.urunGoruntule(bilgisayar);
        hakan.urunGoruntule(telefon);
        
        Veritabani.getVeritabani().urunGoster();
        Veritabani.getVeritabani().kullaniciGoster();
    }
    
}
