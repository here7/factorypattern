package singleton;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Thread 2");
        System.out.println(singleton.nameThread);
    }
}
