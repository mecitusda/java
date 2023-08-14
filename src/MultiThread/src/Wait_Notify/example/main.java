package Wait_Notify.example;

public class main {
    public static void main(String [] args){

        Wait_Notify.Ex1.methods M=new Wait_Notify.Ex1.methods();

        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                M.T1();
            }
        });

        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                M.T2();
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
