package reEntrantLock_Condition;

public class main {
    public static void main(String []args){
        methods met=new methods();

        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                met.T1();
            }
        });

        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                met.T2();
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
        met.ToString();

    }
}
