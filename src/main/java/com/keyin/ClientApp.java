package com.keyin;

public class ClientApp {
    public static void main(String[] args) {
        // Initialize HTTP Client
        HTTPClient httpClient = new HTTPClient();
        // Initialize Menu for client
        Menu menu = new Menu(httpClient);
        // Display menu on client
        menu.displayMenu();
    }
}