package Create_Threads;

public class RunnableThreadClass implements Runnable {
    private String Name;

    public RunnableThreadClass(String name) {
        Name = name;
    }


    @Override
    public void run() {
        System.out.println(Name+" sınıfının thread'i çağrıldı...");
        for(int i=0;i<10;i++){

            try {
                Thread.sleep(2000);
                System.out.println("Runnable Class: "+i);
            } catch (InterruptedException e) {
                System.out.println("Kesme hatası");
            }}
    }
}
