package reEntrantLock_Condition;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class methods {
    private int a=0;
    private Scanner scan=new Scanner(System.in);

    private Lock lock=new ReentrantLock();
    private Condition Con=lock.newCondition();
    public void arttir(){
        for(int i=0;i<1000;i++)
            a++;
    }

    public void T1(){
        lock.lock();
        System.out.println("T1'e girildi!");
        System.out.println("T1 uyandırılmayı bekliyor...");
        try {
            Con.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("T1 uyandı ve işlemini bitiriyor...");
        arttir();
        lock.unlock();
    }

    public void T2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.lock();
        System.out.println("T2'ye girildi!");
        arttir();
        System.out.println("T1'i uyandırmak için bir tuşa basın!");
        scan.nextLine();
        Con.signal();
        System.out.println("T1'i uyandırdım.");
        lock.unlock();
    }


    public void ToString(){
        System.out.println("Son değer: "+a);
}

}
