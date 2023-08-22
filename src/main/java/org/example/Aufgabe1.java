package org.example;

import java.util.Scanner;

public class Aufgabe1 {

    public void Aufgabe1(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie mir einen Input:");
        String input = myScanner.nextLine();  // Read user input
        System.out.println("Sie haben: " + input + " eingegeben.");
    }
}
