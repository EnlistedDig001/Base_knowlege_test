package edu.enlis;

import java.util.Scanner;

public class Task5CarMainControl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Choose needed auto - (car | lorry): ");
            String chosenCar = scan.nextLine().toLowerCase();

            if (chosenCar.equals("car")) {
                Car car = new Car();
                while (true) {
                    System.out.print("Enter command - (start | stop | isGoes | refuel | getFuelLevel): ");
                    String[] input = scan.nextLine().trim().toLowerCase().split(" ");
                    if (input.length < 1 || input.length > 2) {
                        System.out.println("Incorrect command.");
                        continue;
                    }

                    switch (input[0]) {
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
                            if (input.length != 2) {
                                System.out.println("You need to enter amount of fuel");
                            } else {
                                car.refuel(Integer.parseInt(input[1]));
                            }
                            break;
                        case "getfuellevel":
                            car.getFuelLevel();
                            break;
                        case "exit":
                            return;
                        default:
                            System.out.println("Incorrect command.");
                            break;
                    }
                }
            } else if (chosenCar.equals("lorry")) {
                Lorry car = new Lorry();
                while (true) {
                    System.out.print("Enter command - (start | stop | isGoes | refuel | getFuelLevel): ");
                    String[] input = scan.nextLine().trim().toLowerCase().split(" ");
                    if (input.length < 1 || input.length > 2) {
                        System.out.println("Incorrect command.");
                        continue;
                    }

                    switch (input[0]) {
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
                            if (input.length != 2) {
                                System.out.println("You need to enter amount of fuel");
                            } else {
                                car.refuel(Integer.parseInt(input[1]));
                            }
                            break;
                        case "getfuellevel":
                            car.getFuelLevel();
                            break;
                        case "exit":
                            return;
                        default:
                            System.out.println("Incorrect command.");
                            break;
                    }
                }
            } else {
                System.out.println("Incorrect command.");
            }

        }
    }


}
