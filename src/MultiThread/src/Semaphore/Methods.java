package Semaphore;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Methods {

    Lock lock1=new ReentrantLock();
    Lock lock2=new ReentrantLock();
    private  int  id;
    private  int Counter=0;
    private Semaphore sem=new Semaphore(2);
    private Object lock=new Object();
    private Queue<Integer>queue=new LinkedList<>();
    private int limit=5;
    public Methods(){

    }


    public  void Create_Component(int id){

        try {
            sem.acquire();//kaç tane boş yer var sorguluyor eğer yer varsa yer sayısını azaltıyor ve kodun devamını aktif ediyor.
            Counter++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Component oluşturuldu.id: "+id);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Component Siliniyor");
        sem.release();//Yerlerden birini serbest bırakıyor.

    }







}
