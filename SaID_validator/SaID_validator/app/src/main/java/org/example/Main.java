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
            
            
                
            }
        }
    
          scanner.close();
        System.out.println("\nThank You have a great day !");   
    }
}
