package Solve_with_Locks;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
public static void main(String [] args){
    Count count=new Count();
    long baslangic=System.currentTimeMillis();
    count.Degerleri_ata();
    long bitis=System.currentTimeMillis();
    System.out.println("Toplam geçen süre= "+(bitis-baslangic));
}
}

class Count{
    private ArrayList<Integer> list1=new ArrayList<>();
    private ArrayList<Integer> list2=new ArrayList<>();
    private Object Lock1=new Object();
    private Object Lock2=new Object();

    public synchronized void List1_ekle(){
        /**  Bunu kullanırsak bütün değerleri atayabilir fakat süre uzun olur.**/
/*
        for(int i=0;i<2000;i++){

            try {
                list1.add(i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/
        /* ----------------------------------------------------------------*/
        /** Bu kısmı kullanırsak süre yarıya iniyor fakat bir Thread Diğer Thread'in atama işlemini bitirmeden
         *  aynı indexe değer atıyor.Neticesinde Listlere 2000 değer atanamıyor fakat süre yarıya iniyor.
         * Bu sorunu çözmek için List_ekle metotlarını syncronized yapmamız gerekiyor.
         * Fakat Metotların tek Lock'u olduğu için bir Thread diğer Thread'in işlemlerini bitirip lock'u
         * serbest bırakmasını beklemek zorunda kalıyor .Böylece Toplam süre geri 2 katına çıkıyor.Bunun çözümü bir alt
         * block
         * **/

/*
        for(int i=0;i<1000;i++){

            try {
                list1.add(i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }*/
        /* ----------------------------------------------------------------*/
        /**
         *
         * Bu kısmı kullanırsak metotları syncronized yapmamız gerekmeden çift Lock ile çözmüş oluruz.
         * her metotun bir lock'u olduğu için artık bir Thread o metodu kullandıktan sonra o metodun Lock'unu serbest
         * Bırakmış olur.Böylece diğer Thread beklemeden işlemlerine devam edebilir.
         *
         * **/


        synchronized (Lock1) {
            for (int i = 0; i < 1000; i++) {

                try {
                    list1.add(i);
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }

    public   void List2_ekle(){
        /* ----------------------------------------------------------------*/
        /**  Bunu kullanırsak bütün değerleri atayabilir fakat süre uzun olur.**/

/*
        for(int i=0;i<2000;i++){

            try {
                list2.add(i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        /* ----------------------------------------------------------------*/
        /** Bu kısmı kullanırsak süre yarıya iniyor fakat bir Thread Diğer Thread'in atama işlemini bitirmeden
         *  aynı indexe değer atıyor.Neticesinde Listlere 2000 değer atanamıyor fakat süre yarıya iniyor.
         * Bu sorunu çözmek için List_ekle metotlarını syncronized yapmamız gerekiyor.
         * Fakat Metotların tek Lock'u olduğu için bir Thread diğer Thread'in işlemlerini bitirip lock'u
         * serbest bırakmasını beklemek zorunda kalıyor .Böylece Toplam süre geri 2 katına çıkıyor.Bunun çözümü bir alt
         * block
         * **/
  /*
            for(int i=0;i<1000;i++){

                try {
                    list2.add(i);
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }*/

        /* ----------------------------------------------------------------*/
        /**
         *
         * Bu kısmı kullanırsak metotları syncronized yapmamız gerekmeden çift Lock ile çözmüş oluruz.
         * her metotun bir lock'u olduğu için artık bir Thread o metodu kullandıktan sonra o metodun Lock'unu serbest
         * Bırakmış olur.Böylece diğer Thread beklemeden işlemlerine devam edebilir.
         *
         * **/

        synchronized (Lock2){
            for(int i=0;i<1000;i++){

                try {
                    list2.add(i);
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }

    }

    }

    public  void  Degerleri_ata(){

        /*
        *List ekle metotların 1. bloğunun Değerleri_ata() kısmıdır.
        * list1_ekle();
        * list2_ekle();
        * */
        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                List1_ekle();
                List2_ekle();
            }
        });

        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                List1_ekle();
                List2_ekle();
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

        System.out.println("List1 süresi= "+list1.size()+"        List2 süresi= "+list2.size());
    }
    public void İslemleri_tamamla(){

    }
}