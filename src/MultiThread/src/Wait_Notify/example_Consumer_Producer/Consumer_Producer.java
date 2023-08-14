package Wait_Notify.example_Consumer_Producer;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;

public class Consumer_Producer {
    private Queue<Integer> queue=new LinkedList<>();
    private int queue_limit=5;
    Object lock=new Object();
    private Random random=new Random();

    public void Producer(){
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if(queue.size()==queue_limit){
                    try {
                        System.out.println("Kuyruk sırası Doldu bekleniyor... \n");
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value=random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer değer üretti: "+value);
                lock.notify(); // eğer Producerın sırasında değer yoksa ve Consumer onu bekliyorsa feedback yolluyor.

            }



        }




    }

    public void Consumer(){
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if(queue.size()==0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value=queue.poll();
                System.out.println("Consumer bir değer çekti: "+value);
                System.out.println("Kuyruk sırası: "+queue.size()+"\n");
                lock.notify();//eğer Producer kuyruğu doluysa ve değer üretmek için bekliyorsa ve Consumer Producerdan
                //değer çekip kuyrukta yer açtıysa Producer'a feedback yolluyor.
            }




        }
    }
}
