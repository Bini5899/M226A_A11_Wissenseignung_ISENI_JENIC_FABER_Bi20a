package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie mir einen Input:");
        String input = myScanner.nextLine();  // Read user input
        System.out.println("Sie haben: " + input + " eingegeben.");
    }
}