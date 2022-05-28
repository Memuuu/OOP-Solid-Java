
package solid;


public class Mail implements Iletisim{
    
     public void mailGonder(Kullanici kullanici, String mesaj){
         System.out.println("Kullaniciya mail ile" + mesaj + "gönderildi");
     }
     public void bilgiGonder(Kullanici kullanici, String mesaj){
        mailGonder(kullanici, mesaj);
    
     }
}
