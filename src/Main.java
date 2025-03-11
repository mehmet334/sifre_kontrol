import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//*Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki kurallara
// göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.
//  1-En az 8 karakter içermeli
//  2-Space karakteri içermemeli
//  3-İlk harf büyük harf olmalı,
//  4-Son karakteri ? olmalı *//

        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.print("Şifreyi giriniz: ");
            String sifre = scanner.nextLine();
            if (sifre.length() < 8) {
                System.out.println("❌Lütfen 8 ve üstü karakterde şifre deneyiniz!");
            } else if (sifre.contains(" ")) {
                System.out.println("❌Lütfen boşluk kullanmadan deneyiniz!");
            } else if (!Character.isUpperCase(sifre.charAt(0))) {
                System.out.println("❌Lütfen ilk harfi büyük karakter olarak deneyiniz!");
            } else if (sifre.charAt(sifre.length() - 1) == '?') {
                System.out.println("✅......... Şifre Başarılı........ !");
                break;
            } else {
                System.out.println("❌Lütfen son karakter ? olarak deneyiniz!");
            }
        }
    }
}

