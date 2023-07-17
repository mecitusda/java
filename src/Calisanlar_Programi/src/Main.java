import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String islemler="Çalışanlar programına hoşgeldiniz...\n***********************************";
        System.out.println(islemler);
        while(true){
            System.out.println("İşlemler:\n1. Yazılımcı işlemleri\n2. Yönetici işlemleri\nÇıkış için q'ya basınız!");
            String islem=scan.nextLine();

            if(islem.equals("q")){
                System.out.println("Çalışanlar Programından çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
               Yazilimci mirac=new Yazilimci("mirac","Usda",322, new ArrayList<String>(Arrays.asList("Almanca","Türkçe","İngilizce")));
                String Yazilimci_İslem="Yazilimci İşlemleri:\n1. Format at \n2. Bilgileri göster\nÇıkış için q'ta basınız!";


                while(true){
                    System.out.println(Yazilimci_İslem);
                    String Yislem= scan.nextLine();

                    if(Yislem.equals("q")){
                        System.out.println("Yazılımcı İşlemleri'nden çıkılıyor...");
                        break;
                    }
                    else if(Yislem.equals("1")){
                        System.out.println("İşletim sisteminizi giriniz: ");
                        mirac.formatAt(scan.nextLine());
                    }
                    else if(Yislem.equals("2")){
                        mirac.Bilgileri_Goster();
                    }
                    else{
                        System.out.println("Geçersiz İşlem!Tekrar deneyiniz...\n");
                    }
                }
            }

            else if(islem.equals("2")){
                Yonetici yunus=new Yonetici("Yunus Emre","Usda",1,6);
                String Yonetici_islem="Yönetici İşlemler:";
                System.out.println(Yonetici_islem);
                while(true){
                    System.out.println("İşlem seçiniz: \n1. Zam yap\n2. Bilgileri göster\nÇıkış için q'ya basınız!");
                    Yonetici_islem=scan.nextLine();
                    if(Yonetici_islem.equals("q")){
                        System.out.println("Yönetici İşlemleri'nden çıkılıyor...");
                        break;
                    }
                    else if(Yonetici_islem.equals("1")){
                        System.out.println("Ne kadar zam yapılsın?: ");
                        yunus.Zam_Yap(scan.nextDouble());
                        scan.nextLine();
                    }
                    else if(Yonetici_islem.equals("2")){
                        yunus.Bilgileri_Goster();
                    }
                    else {
                        System.out.println("Geçersiz İşlem!Tekrar deneyiniz...\n");
                    }

                }

            }
            else{
                System.out.println("Geçersiz İşlem!Tekrar deneyiniz...\n");
            }


        }

    }
}