package Synchronized_Join;

import java.awt.*;

public class main {
    private static int Kullanici_Sayisi=0;
    public static synchronized void kullanici_arttir(){
        Kullanici_Sayisi++;
    }

    public static void Kullanici_arttir() {
        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    kullanici_arttir();
            }
        });

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    kullanici_arttir();
            }
        });
        T1.start();
        T2.start();
        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String []args){
       /* main main=new main();
        main.Kullanici_arttir();*/

        Kullanici_arttir();

        System.out.println("Toplam Kullanıcı Sayısı: "+Kullanici_Sayisi);

    }
}
