import Views.CLI;
import Views.GUI;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //TODO GIVE OPTION TO CHOOSE GUI OR CLI

            final Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose between GUI and CLI:");
            String Choice = "GUI";//scanner.nextLine();
            switch (Choice) {
                case "CLI":
                    new CLI(scanner);
                    break;
                case "GUI":
                    new GUI();
                    break;
                default:
                    System.out.println("invalid choice");
            }


    }
}
