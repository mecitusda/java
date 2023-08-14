package ExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Counter implements Runnable{
    private String isim;
    private  int count;
    public Counter(String isim,int count){
        this.isim=isim;
        this.count=count;
    }
    @Override
    public void run() {

        try {
            System.out.println(count+". Counter işe başladı...");
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count+". Counter işini bitirdi!");
    }
}



public class main {
    public static void main(String []args){
 ExecutorService executor= Executors.newFixedThreadPool(2);/** bu service'i çağırdığımızda
         shutdown metodu gelene kadar içerisine eklenen Threadleri belirlenen kısıtlamaya göre çalıştırır.**/
 for(int i=0;i<5;i++){
     executor.submit(new Counter(String.valueOf(i),i+1));

    }
        System.out.println("İşler verildi...");

        executor.shutdown();/** executor'da iş biterse executor'u kapatıyoruz ki programın işi bitince kapanabilsin**/
        try {
      executor.awaitTermination(1, TimeUnit.DAYS);/** executor eğer 1 günü aşarsa bitirilmesi otomatik kapat **/
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bütün işler bitti.");



    }
}
