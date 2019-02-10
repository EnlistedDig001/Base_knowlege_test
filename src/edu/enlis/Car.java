package edu.enlis;

public class Car {
    private boolean isGoes;
    private int fuel = 10;
    private int fuelConsumption = 1;

    public boolean isGoes() {
        if (isGoes) {
            System.out.println("Car is currently going.");
        } else {
            System.out.println("Car is currently doesn't move.");
        }

        return isGoes;
    }

    public int getFuelLevel() {
        System.out.println("Current fuel level: " + fuel + " litters.");
        return fuel;
    }

    public void refuel(int litters) {
        if (isGoes) {
            System.out.println("Can't refuel during a ride.");
        } else {
            System.out.println("Car was refueled for " + litters + " litters.");
            fuel += litters;
        }
    }

    public void start() {
        if (isGoes) {
            System.out.println("Car already goes.");
        } else if (fuel < 0) {
                System.out.println("Out of fuel!");
            } else {
                System.out.println("Car started.");
                isGoes = true;
            }

        long startTimeMillis = System.currentTimeMillis();
        while (fuel > 0) {
            if (System.currentTimeMillis() - startTimeMillis == 1000) {
                startTimeMillis = System.currentTimeMillis();
                updateFuel(fuelConsumption);
            }
        }
        stop();
    }

    void updateFuel(int fuelConsumption) {
        fuel -= fuelConsumption;
    }

    public void stop() {
        if (isGoes) {
            System.out.println("Car stopped.");
            isGoes = false;
        } else {
            System.out.println("Car already doesn't move.");
        }
    }
}
