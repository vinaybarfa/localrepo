package LocalRepo.main.Thread;

class Thread1 implements Runnable{
    
    int i = 0;
    @Override
    public void run() {
        while(i<200){
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}
class Thread2 extends Thread{
    
    int i = 0;
    @Override
    public void run() {
        while(i<200){
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}


public class MyThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread t = new Thread(t1);
        t.start();
        t2.start();
    }
}
