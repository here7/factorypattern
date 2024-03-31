package singleton;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Thread 1");
        System.out.println(singleton.nameThread);
    }
}
