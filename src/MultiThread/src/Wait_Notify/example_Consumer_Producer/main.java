package Wait_Notify.example_Consumer_Producer;

public class main {
    public  static void main(String [] args){
        Consumer_Producer referans=new Consumer_Producer();

        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                referans.Producer();
            }
        });

        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                referans.Consumer();
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
}
