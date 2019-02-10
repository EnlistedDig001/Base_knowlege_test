package edu.enlis;

public class Lorry extends Car {
    private int fuelConsumption = 5;

    @Override
    void updateFuel(int fuelConsumption) {
        super.updateFuel(this.fuelConsumption);
    }
}
