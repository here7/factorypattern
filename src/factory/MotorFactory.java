package factory;

public abstract class MotorFactory {
    public Motor create(){
        Motor motor = createMotor();
        motor.build();
        return motor;
    }

    protected abstract Motor createMotor();
}
