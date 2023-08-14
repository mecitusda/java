package Thread_Interrupt;

import java.util.LinkedList;
import java.util.List;

public class örnek2 {
    public static void main(String [] args){
        List<Integer> list=new LinkedList<>();

        Thread TR=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread'e girildi!");
                for(int i=0;i<10000000;i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Kesintiye uğradı...");
                        return;
                    }
                    list.add(i);
                }
            System.out.println("Başarılı bir şekilde görev tamamlandı...");
            }
        });

        TR.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        TR.interrupt();

    }
}
