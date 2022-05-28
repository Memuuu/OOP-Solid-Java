
package solid;


public class Bilgilendirme {
    
    private Sms sms;
    private Mail mail;
    public Bilgilendirme(){
        sms = new  Sms();
        mail = new Mail();
    }
    
    public void bilgilenir(Kullanici kullanici, String mesaj){
        sms.bilgiGonder(kullanici, mesaj);
        mail.bilgiGonder(kullanici, mesaj);
        
        
       // sms.smsGonder(kullanici, mesaj); bağımlı kısım
        mail.mailGonder(kullanici, mesaj);
    }
}



