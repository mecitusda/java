package DeadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static DeadLock.hesap.Transfer;

public class DeadLock {
    hesap hp1 =new hesap("Hesap1");
    hesap hp2 =new hesap("Hesap2");

    Random random=new Random();
    Lock lock1=new ReentrantLock();
    Lock lock2=new ReentrantLock();
    public void CheckLocks(Lock lock1,Lock lock2){
        boolean lock1_check=false;
        boolean lock2_check=false;

        while(true){
            lock1_check=lock1.tryLock();
            lock2_check=lock2.tryLock();
            if(lock1_check && lock2_check)
                    return;

            if(lock1_check)
                lock1.unlock();

            if(lock2_check)
                lock2.unlock();
        }
    }

    public void T1(){
       /* lock2.lock();
        lock1.lock();*/ /** T2 ile ters lock sırası girilince birisi lock1'i alıp lock2'yi beklerken
         diğeri lock2'yi alıp lock1'i bekliyor ve deadlock oluşabiliyor.**/
        CheckLocks(lock1,lock2);
        for(int i=0;i<5000;i++){
            Transfer(hp1,hp2,random.nextDouble(100.0));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void T2(){
       /* lock1.lock();
        lock2.lock();*/ /**açıklama üstte.**/
        CheckLocks(lock2,lock1);
        for(int i=0;i<1000;i++){
            Transfer(hp2,hp1,random.nextDouble(100.0));
        }


        lock2.unlock();
        lock1.unlock();
    }
}
