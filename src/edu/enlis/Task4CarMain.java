package edu.enlis;

public class Task4CarMain {
        public static void main(String[] args) {
            Car car = new Car();
            car.start();
            while(car.isGoes());
            car.refuel(25);
            car.start();
            while(car.getFuelLevel() > 10);
            car.stop();

        }
    }
