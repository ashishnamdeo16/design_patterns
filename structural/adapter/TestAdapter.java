package structural.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        Car myCar = new ElectricCarAdapter(new ElectricVehicle());
        myCar.drive();
    }
}
