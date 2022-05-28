
package solid;


public class Sms implements Iletisim{
    
    public void smsGonder(Kullanici kullanici, String mesaj, String ulkeKodu){
        System.out.println("Kullaniciya sms ile" + mesaj + "gönderildi");
    }
    
    public void bilgiGonder(Kullanici kullanici, String mesaj){
        smsGonder(kullanici, mesaj,"+90");
    }
}
