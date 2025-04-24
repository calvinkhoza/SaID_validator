package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("South African ID Validator");
        System.out.println("--------------------------");
        
        while (true) {
            System.out.print("\nEnter ID number (or 'quit' to exit): ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            
            if (ValidateSaid.isValid(input)) {
                System.out.println("\n Valid SA ID Number");
                System.out.println("Gender: " + ValidateSaid.getGender(input));
                System.out.println("Birth Date: " + ValidateSaid.getBirthDate(input));
                System.out.println("\nID Breakdown:");
                System.out.println("YYMMDD: " + input.substring(0, 6));
                System.out.println("Citizenship: " + 
                    (input.charAt(10) == '0' ? "SA Citizen" : "Permanent Resident"));
                
            }
        }

        scanner.close();
        System.out.println("\nThank You have a great day !");
    }
}