import java.awt.*;
import java.util.Scanner;

public class Main {
   
     static Scanner scan=new Scanner(System.in);

    public static void Menu(){
        System.out.println("************* İdmana Hoşgeldiniz *************");
    }
    public static void idmanMenu(){
        System.out.println("------------- İdman Oluşturun -------------");
    }

    public static void main(String[] args) {



            idmanMenu();
            System.out.print("Push Up Sayısı: ");
            int pushup=scan.nextInt();
            System.out.print("Sit Up Sayısı: ");
            int situp=scan.nextInt();
            System.out.print("Squat Sayısı: ");
            int squat=scan.nextInt();
            System.out.print("Burpee Sayısı: ");
            int burpee=scan.nextInt();
            scan.nextLine();
             idman idman= new idman(pushup,situp,burpee,squat);



             boolean check=true;

             Menu();

             while(true){
                 if(idman.getBurpee()<=0&&idman.getPushup()<=0&&idman.getSitup()<=0&&idman.getSquat()<=0){
                     break;
                 }
                 System.out.print("Yapmak istediğiniz hareketi söyleyin: ");
                 String hareket=scan.nextLine();
                 System.out.print("Kaç tane yaptınız: ");
                 int sayi=scan.nextInt();
                 scan.nextLine();
                 idman.Hareket_yap(hareket,sayi);

             }
             System.out.println("\nTebrikler idmanı başarıyla bitirdiniz...");
    }
}