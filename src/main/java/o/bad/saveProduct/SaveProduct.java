package o.bad.saveProduct;

import o.bad.carModel.HyundaiHybrid;
import o.bad.carModel.KiaHybrid;
import o.bad.carModel.ToyotaElectric;

public class SaveProduct {
    public void save(HyundaiHybrid electricCar) {
        System.out.println(electricCar);
    }

    public void save(ToyotaElectric toyotaElectric) {
        System.out.println(toyotaElectric);
    }

    public void save(KiaHybrid kiaHybrid) {
        System.out.println(kiaHybrid);
    }

}