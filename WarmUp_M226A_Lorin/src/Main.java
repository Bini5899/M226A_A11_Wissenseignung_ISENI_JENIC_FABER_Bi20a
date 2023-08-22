import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] userName = new String[10];

        for (int i = 0; i < 10; i++) {
            // Initialize Scanner for reading the input from terminal
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter your thing");

            // Reads the beneath the println statement userinput
            userName[i] = myObj.nextLine();
            System.out.println(i);

            if (userName[i].equals("Stop")) {
                for (int j = 0; j < i; j++) {
                    System.out.println(userName[j]);
                }
                System.exit(0);
            }
        }
    }
}