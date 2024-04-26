/* AddUp by Mario
 * The purpose of this application is to perform calculates with two numbers.
 * The user can either add, subtract, divide, multiply, or modulus any two numbers. (Cannot perform division by 0)
 * 
 * This project will be improved overtime. A list of planned future changes is outlined below:
 * Allow user to enter as many numbers as desired by storing input in a stack
 * Implement GUI via the Swing framework
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello there. Welcome to AddUp.\n");
		
		while (true)
		{
			System.out.print("History: ");
			Calcuation.printStack(); // Print previous calculations performed
			System.out.println("\n\nPlease select a menu option from any of the choices below");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
		
			boolean isValid = false;
			int userChoice = 0;
		
			while (!isValid) // Continue getting user input until the user chooses a valid value; between 1 and 5.
			{
				userChoice = input.nextInt();
				
				if (userChoice >= 1 && userChoice <= 5)
				{
					isValid = true; // stop the loop.
				}
				else
				{
					System.out.println("Must choose a value between 1 and 5");
					continue; // prompt the user to input again.
				}
			
			}
			float num1;
			float num2;
			float result = 0;
			switch(userChoice) 
			{
				case 1:
					System.out.print("Input two numbers to add (seperated by a space) : ");		
					num1 = input.nextFloat();
					num2 = input.nextFloat();
					result = Addition.add(num1, num2);
					break;
				case 2:
					System.out.print("Input two numbers to subtract (seperated by a space) : ");
					num1 = input.nextFloat();
					num2 = input.nextFloat();
					result = Subtraction.sub(num1, num2);
					break;
				case 3:
					System.out.print("Input two numbers to multiply (seperated by a space) : ");
					num1 = input.nextFloat();
					num2 = input.nextFloat();
					result = Multiplication.multiply(num1, num2);
					break;
				case 4:
					System.out.print("Input two numbers to divide (seperated by a space) : ");
					num1 = input.nextFloat();
					num2 = input.nextFloat();
					result = Division.div(num1, num2);
					break;
				case 5:
					System.out.print("Input two numbers to modulus (seperated by a space) : ");
					num1 = input.nextFloat();
					num2 = input.nextFloat();
					result = Modulus.mod(num1, num2);
					break;
			}
			System.out.println("The result is: " + result);
		
			System.out.println("Want to play again?");
			String userInput = input.next();
		
			if (userInput.equals("Yes") || userInput.equals("yes") || userInput.equals("y") || userInput.equals("Y"))
			{
				continue; // Restart the calculator.
			}
			else
			{
				break; // Stop the application.
			}
		}
	}
}
