package Callable_Future_Interface;

import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class main {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        Random random=new Random();
        ExecutorService executor= Executors.newFixedThreadPool(2);
        long time= System.currentTimeMillis();
            Future<?> future=executor.submit(new Callable<Integer>(){

            @Override
            public Integer call() throws Exception {
                Integer past=random.nextInt(5000)+2000;
              System.out.println("Callable calıştı...");
              if(past>4500){
                  throw new IOException("Süre çok uzadı");

              }
               Thread.sleep(past);
               return past;
            }
        });


        try {
            System.out.println("Uyunan süre belirlendi: "+future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e);
        }
        executor.shutdown();
    }

}
