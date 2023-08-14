package DeadLock;

public class main {
    public static void main(String [] args){
        DeadLock dead= new DeadLock();

        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                dead.T1();
            }
        });


        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                dead.T2();
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
        dead.hp1.ToString();
        System.out.println("\n");
        dead.hp2.ToString();
        System.out.println("Toplam Bakiye= "+(dead.hp1.getBakiye()+dead.hp2.getBakiye()));

    }
}
