import factory.CarMotorFactory;
import factory.MotorFactory;
import factory.PlainMotorFactory;

public class Main {
    private static MotorFactory motor;

    public static void main(String[] args) {
        // 1. Factory Design Pattern
        motor = new CarMotorFactory();
        motor.create();

        motor = new PlainMotorFactory();
        motor.create();
    }
}