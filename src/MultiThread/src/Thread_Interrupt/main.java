package Thread_Interrupt;

import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String [] args){
        List<Integer> list=new LinkedList<>();

        Thread TR=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread'e girildi!");
                System.out.println("Geçen süre: 0");
                for(int i=1;i<=10;i++){
                    System.out.println("            "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("    Süre kesintiye uğradı");
                    }
                }
            }
        });

        TR.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        TR.interrupt();

    }
}
