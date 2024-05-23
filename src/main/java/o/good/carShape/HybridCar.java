package o.good.carShape;

import o.bad.car.Car;

public abstract class HybridCar extends Car {
    abstract protected void gasolineCharger();
    abstract protected void electricCharger();
}