import factory.CarMotorFactory;
import factory.MotorFactory;
import factory.PlainMotorFactory;
import singleton.Singleton;
import singleton.Thread1;
import singleton.Thread2;

public class Main {
    private static MotorFactory motor;

    public static void main(String[] args) {
        System.out.println("+++ 1) Factory Pattern +++");
        motor = new CarMotorFactory();
        motor.create();

        motor = new PlainMotorFactory();
        motor.create();

        System.out.println("\n +++ 2) Singleton Pattern +++");
        System.out.println("Same result means Singleton is reused. If not --> 2 Singletons were created");
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }
}