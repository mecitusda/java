package Create_Threads;
public class ThreadClass extends Thread{
    private String Name;
    public ThreadClass(String Name){
        this.Name=Name;
    }

    @Override
    public void run() {
        System.out.println(Name+" sınıfının thread'i çağrıldı...");
        for(int i=0;i<10;i++){

        try {
            Thread.sleep(2000);
            System.out.println("Thread Class: "+i);
        } catch (InterruptedException e) {
            System.out.println("Kesme hatası");
        }}
    }
}
