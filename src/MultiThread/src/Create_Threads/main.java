package Create_Threads;

public class main {
    public static void main(String [] args){
        ThreadClass callen=new ThreadClass("Callen");
        ThreadClass callen2=new ThreadClass("Callen2");
        callen.start();
        callen2.start();
        System.out.println("Main Thread'i çağrıldı.");

        Thread T3= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Sınıfsız thread çağrıldı...");
                for(int i=0;i<10;i++){

                    try {
                        Thread.sleep(2000);
                        System.out.println("Sınıfsız: "+i+"\n\n");
                    } catch (InterruptedException e) {
                        System.out.println("Kesme hatası");
                    }}
            }
        });
T3.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Renefenassız Thread çağrıldı...");
                for(int i=0;i<10;i++){

                    try {
                        Thread.sleep(2000);
                        System.out.println("Referanssız: "+i);

                    } catch (InterruptedException e) {
                        System.out.println("Kesme hatası");
                    }}
            }
        }).start();


        Thread T1=new Thread(new RunnableThreadClass("T1"));
        Thread T2=new Thread(new RunnableThreadClass("T2"));
        T1.start();
        T2.start();
        System.out.println("Main Threadi Bitti...");
    }
}
