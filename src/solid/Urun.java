
package solid;

public class Urun {
    
    private String isim;
    private int fiyat;
    
    public Urun(String isim, int fiyat){
        setIsim(isim);
        setFiyat(fiyat);
    
    }    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
