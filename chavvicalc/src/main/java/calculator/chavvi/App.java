package calculator.chavvi;

import java.util.Scanner;

/**
* Chavvi Calculator
* By Morgan Beebe CSIS27 Fall 2024
* """
*                          .--.                  Try not.
*               ::\\`--._,'.::.`._.--'/::     Do or do not.
*                ::::.  ` __::__ '  .::::    There is no try.
*                ::::::-:.`'..`'.:-::::::
*               ::::::::\\ `--' /::::::::              -Yoda"""
*/
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Friends!" );

        Scanner scanner = new Scanner(System.in);

        float A = 0;
        float B = 0;
        String input;

        System.out.println("Welcome to Chavvi's Calculator");
        System.out.println("Please only use one of these commands a, b, +, -, *, /, c, q");

        while (true) { 
            System.out.println("Enter a command: ");
            input = scanner.next();

            if (input.equals("a")){
                System.out.println("Please enter a number for A: ");
                try {
                    A = Float.parseFloat(scanner.next());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number input for A.");
                }

            } else if (input.equals("b")) {
                // Ask the user to enter a value for B
                System.out.print("Enter a number for B: ");
                try {
                    B = Float.parseFloat(scanner.next());  // Convert input to a number
                } catch (NumberFormatException e) {
                    // Error handling for invalid input
                    System.out.println("That is not a valid number for B.");
                }

            } else if (input.equals("+")) {
                // Add B to A
                A = A + B;
                System.out.println("A = A + B: " + A);

            } else if (input.equals("-")) {
                // Subtract B from A
                A = A - B;
                System.out.println("A = A - B: " + A);
                
            } else if (input.equals("*")) {
                // Multiply A by B
                A = A * B;
                System.out.println("A = A * B: " + A);

            } else if (input.equals("/")) {
                // Divide A by B, but check if B is 0
                if (B != 0) {
                    A = A / B;
                    System.out.println("A = A / B: " + A);
                } else {
                    // Print error if dividing by 0
                    System.out.println("Error: Division by zero is not allowed.");
                }   

            } else if (input.equals("c")) {
                // Clears the values of A and B
                A = 0;
                B = 0;
                System.out.println("Values have been cleared. A = 0, B = 0");    

            }
        }
    }
}
