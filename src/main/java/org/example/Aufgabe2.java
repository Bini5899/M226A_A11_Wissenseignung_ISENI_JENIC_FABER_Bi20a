package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Aufgabe2 {
    public void Aufgabe2(){
        Scanner myScanner = new Scanner(System.in);
        Boolean stop = false;
        while (stop == false){
            System.out.println("Bitte geben Sie mir einen Input:");
            String input = myScanner.nextLine();  // Read user input
            if(Objects.equals(input, "Stop") || Objects.equals(input, "stop")){
                stop = true;
            }else{
                System.out.println("Sie haben: " + input + " eingegeben.");
            }
        }

    }
}
