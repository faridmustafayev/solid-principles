package l.bad;

public class Bicycle implements Bike {
    boolean isEngine;
    int speed;

    @Override
    public void turnOnEngine() {
        throw new UnsupportedOperationException("There is no engine !");
    }

    @Override
    public void accelerate() {
        speed += 15;
    }
}
