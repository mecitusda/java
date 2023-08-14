package Semaphore;

public class main {
    public static void main(String [] args){
        Methods ref=new Methods();
        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                ref.Create_Component(1);
            }
        });

        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                ref.Create_Component(2);
            }
        });

        Thread T3=new Thread(new Runnable() {
            @Override
            public void run() {
                ref.Create_Component(3);
            }
        });

        Thread T4=new Thread(new Runnable() {
            @Override
            public void run() {
                ref.Create_Component(4);
            }
        });

        Thread T5=new Thread(new Runnable() {
            @Override
            public void run() {
                ref.Create_Component(5);
            }
        });

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();

        try {
            T1.join();
            T2.join();
            T3.join();
            T4.join();
            T5.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
