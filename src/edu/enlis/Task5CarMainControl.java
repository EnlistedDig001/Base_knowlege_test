package edu.enlis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5CarMainControl {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lorry car = new Lorry();
        while (true) {
            System.out.print("Введите одну из команд - (start | stop | isGoes | refuel | getFuelLevel): ");
            String[] params = reader.readLine().trim().toLowerCase().split(" ");
            if (params.length < 1 || params.length > 2) {
                System.out.println("Неверная команда.");
                continue;
            }

            switch (params[0]) {
                case "start":
                    car.start();
                    break;
                case "stop":
                    car.stop();
                    break;
                case "isgoes":
                    car.isGoes();
                    break;
                case "refuel":
                    car.refuel(Integer.parseInt(params[1]));
                    break;
                case "getfuellevel":
                    car.getFuelLevel();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Неверная команда.");
                    break;
            }
        }
    }
}
