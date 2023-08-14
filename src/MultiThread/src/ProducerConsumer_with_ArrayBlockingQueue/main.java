package ProducerConsumer_with_ArrayBlockingQueue;

public class main {
    public static void main(String[] args) {


    ProducerConsumer pro = new ProducerConsumer();

    Thread T1 = new Thread(new Runnable() {
        @Override
        public void run() {
            pro.Producer();
        }
    });

    Thread T2 = new Thread(new Runnable() {
        @Override
        public void run() {
            pro.Consumer();
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
