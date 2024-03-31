package singleton;

public class Singleton {

    private static Singleton instance;
    public String nameThread;
    private Singleton(String nameThread) {
        this.nameThread = nameThread;
    }

    public static Singleton getInstance(String nameThread){
        if(instance == null){
            instance = new Singleton(nameThread);
        }
        return instance;
    }
}
