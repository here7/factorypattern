package factory;

public class PlainMotorFactory extends MotorFactory{
    @Override
    protected Motor createMotor(){
        return new PlainMotor();
    }
}
