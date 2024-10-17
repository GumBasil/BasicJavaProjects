/*
File name: cubesSquaresPowers.java
Author: Sahil Alamgir
Date: October 11 2024
Description: User is given a menu with 4 options. The first option squares a
number that the user gives. The second option cubes it. The third option asks
user for base and power. The fourth option exits the program.
*/

package cubessquarespowers;

import java.util.Scanner; // for keyboard input

public class CubesSquaresPowers {

    public static void main(String[] args) {
        
        // setting keyedInput as input
        Scanner keyedInput = new Scanner(System.in);
        
        // declare and initialize variables
        int choice;
        int number;
        int power;
        int result;
        
        System.out.println("Cubes and Squares and Powers:");
        
        do {
            // present user menu
            System.out.println("");
            System.out.println("Please enter your choice:");
            System.out.println("1... Find the value of a number squared");
            System.out.println("2... Find the value of a number cubed");
            System.out.println("3... Find the value of a number, to any power");
            System.out.println("4... Exit");
            System.out.println("");
            
            // prompt user for choice
            System.out.print("Please enter your choice: ");
            choice = keyedInput.nextInt();
            System.out.println("");
            
            // display results according to choice
            if (choice == 1) {
                // prompt user for base
                System.out.print("Please enter your number: ");
                number = keyedInput.nextInt();
                System.out.println(number + " squared is: "
                        + (number * number));
            }
            else if (choice == 2) {
                // prompt user for base
                System.out.print("Please enter your number: ");
                number = keyedInput.nextInt();
                System.out.println(number + " cubed is: "
                        + (number * number * number));
            }
            else if (choice == 3) {
                // prompt user for base and power
                System.out.print("Please enter your number: ");
                number = keyedInput.nextInt();
                System.out.print("Please enter your power: ");
                power = keyedInput.nextInt();
                result = number;
                
                // use for loop to multiple number by itself n - 1
                // times where n is power
                for (int i = 1; i < power; i++) {
                    result *= number;
                }
                System.out.println(number + " to the power of "
                        + power + " is: " + result);
            }
            else if (choice != 4) {
                // if input is not 1, 2, 3, or 4 (DOES NOT WORK FOR NON-INTEGERS)
                System.out.println("Please enter a number from 1 to 4.");
            }
        }    
        while (choice != 4);
        
        // output farewell message
        System.out.println("Goodbye!");
        }
        
    }
    

