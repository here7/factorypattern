package factory;

import product.*;

public class CarMotorFactory extends MotorFactory{
    @Override
    protected Motor createMotor(){
        return new CarMotor();
    }
}
