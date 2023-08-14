package Wait_Notify.Ex1;

import java.util.Objects;
import java.util.Scanner;

public class methods {
    Object lock=new Object();

    public void T1(){
        synchronized (lock) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);}

            System.out.println("T1'e girildi....");
            try {
                System.out.println("T1 bekliyor.");
                lock.wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T1 geri bildirim aldı...");
        }

    }
    public void T2(){
        Scanner scan=new Scanner(System.in);


        synchronized (lock){
            System.out.println("T2'ye girildi!");
            System.out.println("T1'e geri dönmek için bir tuşa basınız...");
            scan.next().charAt(0);
            lock.notify();
        }
    }
}
