import factory.CarMotorFactory;
import factory.MotorFactory;
import factory.PlainMotorFactory;

public class Main {
    private static MotorFactory motor;

    public static void main(String[] args) {
        motor = new CarMotorFactory();
        motor.create();

        motor = new PlainMotorFactory();
        motor.create();
    }
}