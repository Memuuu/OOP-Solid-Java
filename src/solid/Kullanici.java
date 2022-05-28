
package solid;


interface Kullanici {
    
    void urunGoruntule();
       
}

interface SatisYapabilen {
    void urunEkle();
}

class Musteri implements Kullanici {
    private String isim;
    
    Giris g1 = new Giris() {
        
        void girisYap() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    public Musteri(String isim){
        setIsim(isim);          
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
  
    public void urunGoruntule(Urun urun){
        System.out.println(getIsim() + "=" + urun.getIsim() + ":" + urun.getFiyat());
    }

    @Override
    public void urunGoruntule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
}

class Satici implements Kullanici, SatisYapabilen {
    private String isim;
    Giris g2=new Giris() {
       
        void girisYap() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    public Satici(String isim){
        setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void urunGoruntule(Urun urun){
        System.out.println(getIsim() + "=" + urun.getIsim() + ":" + urun.getFiyat());
    }
    public void urunEkle(Urun urun){
        Veritabani.getVeritabani().urunEkle(urun);
        System.out.println("Satici " + urun.getIsim() + "ekledi");
    }

    @Override
    public void urunGoruntule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void urunEkle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
    
}
