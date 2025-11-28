package structural.adapter;

public class ElectricCarAdapter implements Car{
    ElectricVehicle car;

    public ElectricCarAdapter(ElectricVehicle car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.chargeAndGo();
    }
}
