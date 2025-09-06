package LocalRepo.main.Thread;

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class MyThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t = new Thread(t1);
        
    }
}
