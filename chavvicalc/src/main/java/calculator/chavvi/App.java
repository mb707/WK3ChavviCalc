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

        float a = 0;
        float b = 0;
        String input;

        System.out.println("Welcome to Chavvi's Calculator");
        System.out.println("Please only use one of these commands a, b, +, -, *, /, c, q");

        while (true) { 
            System.out.println("Enter a command: ");
            input = scanner.next();

            if (input.equals("a")){
                System.out.println("Please enter a number for A: ");
                
            }
        }
    }
}
