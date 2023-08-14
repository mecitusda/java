package Example;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
     static Scanner scan=new Scanner(System.in);
    static Kart[][] kartlar=new Kart[4][4];

    public static void kartlari_diz(){
        kartlar[0][0]=new Kart('E');
        kartlar[0][1]=new Kart('A');
        kartlar[0][2]=new Kart('B');
        kartlar[0][3]=new Kart('F');
        kartlar[1][0]=new Kart('G');
        kartlar[1][1]=new Kart('A');
        kartlar[1][2]=new Kart('D');
        kartlar[1][3]=new Kart('H');
        kartlar[2][0]=new Kart('F');
        kartlar[2][1]=new Kart('C');
        kartlar[2][2]=new Kart('D');
        kartlar[2][3]=new Kart('H');
        kartlar[3][0]=new Kart('E');
        kartlar[3][1]=new Kart('G');
        kartlar[3][2]=new Kart('B');
        kartlar[3][3]=new Kart('C');
    }

    public static void kayittan_Doldur(){


                System.out.println("Kayıtlı oyununuz var.Devam etmek ister misiniz? (evet ya da hayır ): ");
                String cevap=scan.nextLine();
                if(cevap.equals("evet")){
                    kartlar=oyun_Kayit.KayitBul();
                }
                else{
                    kartlari_diz();
                }

    }
    public static void Map(){
        for(int i=0;i<4;i++){
            System.out.println("_________________________");
            for(int j=0;j<4;j++){
                System.out.print("|  ");
                if(kartlar[i][j].isGuess()){
                System.out.print(kartlar[i][j].getPick()+"  ");}
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("|");
        }
    }
    public static void tahmin_Et(){
        System.out.print("Birinci Tahmini giriniz:");
        String i= String.valueOf(scan.next().charAt(0));
        if(i.equals("q")){
            scan.nextLine();
            System.out.print("Oyunu kaydetmek istiyor musunuz? :");
            String kaydet=scan.nextLine();
            if(kaydet.equals("evet")){
                oyun_Kayit.kaydet(kartlar);
                System.out.println("Kaydedildi!");
            }
            System.exit(0);
        }
        String j=String.valueOf(scan.next().charAt(0));
        if(j.equals("q")){
            System.out.println("cıkıldı");
            return;
        }
        kartlar[Integer.parseInt(i)][Integer.parseInt(j)].setGuess(true);
        System.out.println("\n\n\n\n");

        Map();
        System.out.print("İkinci Tahmini giriniz:");
        String k= String.valueOf(scan.next().charAt(0));
        String l=String.valueOf(scan.next().charAt(0));
        if((!i.equals(k)) || (j.equals(l))){
        if(kartlar[Integer.parseInt(i)][Integer.parseInt(j)].check(kartlar[Integer.parseInt(k)][Integer.parseInt(l)])){
            kartlar[Integer.parseInt(k)][Integer.parseInt(l)].setGuess(true);
            System.out.println("\nTebrikler eşleştirmen doğru!");
        }
        else{
            kartlar[Integer.parseInt(i)][Integer.parseInt(j)].setGuess(false);
            System.out.println("\nTahmininiz eşleşmedi!");
        }
        }
        else {
            kartlar[Integer.parseInt(i)][Integer.parseInt(j)].setGuess(false);
    System.out.println("\nHatalı tahmin!");
        }
    }

    public static boolean Game_Over(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               if(kartlar[i][j].isGuess()==false){
                   return false;
               }
            }
        }
        return true;
    }


    public static void main(String []args){
        File dosya=new File("OyunDepo.txt");
        if(dosya.exists()){
        kayittan_Doldur();}
        else{
            kartlari_diz();
        }


        while(true){
            System.out.println("Çıkış yapmak için Q'ya basınız...");
        Map();


       tahmin_Et();
            System.out.println("\n\n\n\n");
        if(Game_Over()){
            break;
        }

        }
        System.out.println("Tebrikler Oyunu bitirdin!");
    }
}
