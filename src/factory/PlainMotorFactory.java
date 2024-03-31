package factory;

import product.*;

public class PlainMotorFactory extends MotorFactory{
    @Override
    protected Motor createMotor(){
        return new PlainMotor();
    }
}
