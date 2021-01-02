
public class Main {
    
    public static void main(String[] args) {
        //OOP ATM Programı
        
        //Login Class'ı Giriş İşlemlerini Kontrol Edecek
        
        //Hesap Class'ı Hesap İşlemlerini Yapacak
        
        //ATM ise atmmizi çalıştıracak
        
        ATM atm = new ATM();
        
        Hesap hesap=new Hesap("emrecan", "123", 2500);
        
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
        
        
        
        
        
        
        
        
    }
    
}
