package com.keyin;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HTTPClient {
    private final HttpClient httpClient;

    public HTTPClient() {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    // Constructor that accepts HttpClient for testing
    public HTTPClient(HttpClient httpClient) {
        this.httpClient = httpClient != null ? httpClient : HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    public void listAirportsInCity(int cityId) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/airports/city/" + cityId))
                .GET()
                .build();

        sendRequest(request);
    }

    public void listAircraftForPassenger(String passengerIdentifier) {
        try {
            int passengerId = Integer.parseInt(passengerIdentifier);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/passengers/" + passengerId + "/aircrafts"))
                    .GET()
                    .build();

            sendRequest(request);
        } catch (NumberFormatException e) {
            System.out.println("Passenger identifier must be an integer.");
        }
    }

    public void listAirportsForAircraft(String aircraftIdentifier) {
        try {
            int aircraftId = Integer.parseInt(aircraftIdentifier);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/aircrafts/" + aircraftId + "/airports"))
                    .GET()
                    .build();

            sendRequest(request);
        } catch (NumberFormatException e) {
            System.out.println("Aircraft identifier must be an integer.");
        }
    }

    public void listAirportsUsedByPassenger(String passengerIdentifier) {
        try {
            int passengerId = Integer.parseInt(passengerIdentifier);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/passengers/" + passengerId + "/airports"))
                    .GET()
                    .build();

            sendRequest(request);
        } catch (NumberFormatException e) {
            System.out.println("Passenger identifier must be an integer.");
        }
    }

    private void sendRequest(HttpRequest request) {
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println(response.body());
            } else {
                System.out.println("Error: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println("Error sending request: " + e.getMessage());
        }
    }
}