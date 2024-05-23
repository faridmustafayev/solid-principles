package i.bad;

public class Car implements Vehicle {

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car is not flying !");
    }
}
