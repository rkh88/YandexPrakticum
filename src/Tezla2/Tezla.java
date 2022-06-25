package Tezla2;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {

        if(speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
        else {
            speed = autoPilotMaxSpeed;
        }// исправьте метод для ускорения при автопилоте
    }

    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    @Override
    public void brake() {
        if (speed > brakingSpeed) {
            speed -= brakingSpeed;
        } else {
            speed = 0;
        }

    }

    // переопределите метод для ускорения

    // переопределите метод для торможения
}
