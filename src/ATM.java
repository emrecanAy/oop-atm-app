
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        
        Login login=new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("<---- Katılım Bankamıza Hoşgeldiniz ---->");
        
        System.out.println("*****************************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*****************************************");
        int girisHakki=3;
        
        while (true) {            
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı!");
                break;
            }
            else{
                System.out.println("Hatalı Giriş!");
                girisHakki--;
                System.out.println("Kalan Giriş Hakkı: "+girisHakki);            
            }
            
            if (girisHakki==0) {
                System.out.println("Giriş Hakkınız Bitti!");
                return;
            }
        }
        
        System.out.println("*****************************************");
        String islemler="1.İşlem : Bakiye Görüntüle\n"
                        +"2.İşlem : Para Çekme\n"
                        +"3.İşlem : Para Yatırma\n"
                        +"Çıkış için q'a basın...";
        System.out.println(islemler);
        System.out.println("*****************************************");
        
        while (true) {            
            System.out.print("İşlem seçin: ");
            String islem=scanner.nextLine();
            
            if (islem.equals("q")) {
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiye: " + hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.print("Çekmek istediğiniz miktar: ");
                int miktar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(miktar);
            }
            else if (islem.equals("3")) {
                System.out.print("Yatırmak istediğiniz miktar: ");
                int miktar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(miktar);                
            }
            else{
                System.out.println("Hatalı İşlem Girişi!");
            }
        }
       
    }
}
