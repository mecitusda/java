package ProducerConsumer_with_ArrayBlockingQueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random=new Random();
    BlockingQueue<Integer> kuyruk=new  ArrayBlockingQueue(5);
    public void Producer(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer temp=random.nextInt(100);
                System.out.println("Producer değer ekliyor: "+temp);
                kuyruk.put(temp);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }

    public void Consumer(){
        while(true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Integer temp=kuyruk.take();
                System.out.println("Consumer değer alıyor: "+temp);
                System.out.println("Kuyruk sırası: "+kuyruk.size());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
