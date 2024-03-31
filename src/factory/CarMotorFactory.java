package factory;

public class CarMotorFactory extends MotorFactory{
    @Override
    protected Motor createMotor(){
        return new CarMotor();
    }
}
