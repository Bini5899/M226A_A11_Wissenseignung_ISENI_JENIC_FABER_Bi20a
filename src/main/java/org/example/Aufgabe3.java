package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe3 {
    public void Aufgabe3() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Geben Sie etwas ein (\"stop\" zum Beenden): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Programm wird beendet.");
                break;
            }

            inputs.add(input);
        }

        System.out.println("Eingegebene Zeilen:");
        for (String input : inputs) {
            System.out.println(input);
        }

        scanner.close();
    }
}