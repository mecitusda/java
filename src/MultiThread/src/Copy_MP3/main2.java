package Copy_MP3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku() {

        try {
            FileInputStream in = new FileInputStream("C:\\Users\\mirac\\OneDrive\\Masaüstü\\Udemy kurs\\Java\\MultiThread\\src\\Copy_MP3\\marş.mp3");


            int oku;

            while ((oku = in.read()) != -1){

                icerik.add(oku);

            }


        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    public static  void kopyala(String dosyaismi) {

        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);

            for (int deger : icerik) {

                out.write(deger);

            }


        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    public static void main(String[] args) {
        dosyaOku();
        long baslangic = System.currentTimeMillis();

        kopyala("marş2.mp3");
        kopyala("marş3.mp3");
        kopyala("marş4.mp3");

        long bitis = System.currentTimeMillis();

        System.out.println("3 dosyanın kopyalanması şu kadar sürdü : " + ((bitis - baslangic)/ 1000) + "saniye");

    }
}
