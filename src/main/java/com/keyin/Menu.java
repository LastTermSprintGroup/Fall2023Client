package com.keyin;

import java.util.Scanner;

public class Menu {
    private final HTTPClient httpClient;
    private final Scanner scanner;

    public Menu(HTTPClient httpClient) {
        this.httpClient = httpClient;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option;
        do {
            System.out.println("\nWelcome to the Airport Management System!");
            System.out.println("Please select an option:");
            System.out.println("1. List all airports in a specific city.");
            System.out.println("2. List all aircraft a specific passenger has traveled on.");
            System.out.println("3. List all airports an aircraft can take off from and land at.");
            System.out.println("4. List all airports a specific passenger has used.");
            System.out.println("5. Exit.");
            System.out.print("Enter your choice: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (option) {
                case 1:
                    listAirportsInCity();
                    break;
                case 2:
                    listAircraftForPassenger();
                    break;
                case 3:
                    listAirportsForAircraft();
                    break;
                case 4:
                    listAirportsUsedByPassenger();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);
    }

    private void listAirportsInCity() {
        System.out.print("Enter the city ID: ");
        int cityId = scanner.nextInt();
        scanner.nextLine();
        httpClient.listAirportsInCity(cityId);
    }

    private void listAircraftForPassenger() {
        System.out.print("Enter the passenger's ID or name: ");
        String passengerIdentifier = scanner.nextLine();
        httpClient.listAircraftForPassenger(passengerIdentifier);
    }

    private void listAirportsForAircraft() {
        System.out.print("Enter the aircraft's ID or model: ");
        String aircraftIdentifier = scanner.nextLine();
        httpClient.listAirportsForAircraft(aircraftIdentifier);
    }

    private void listAirportsUsedByPassenger() {
        System.out.print("Enter the passenger's ID or name: ");
        String passengerIdentifier = scanner.nextLine();
        httpClient.listAirportsUsedByPassenger(passengerIdentifier);
    }
}