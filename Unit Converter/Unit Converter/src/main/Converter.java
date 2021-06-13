package main;

import java.util.Scanner;

public class Converter {

	static Scanner userScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		//variables needed for the program
		String userInput;
		int converter;
		int output;
		int cupsToTeaspoons = 48;
		int mileToYard = 1760;
		int myTemperature = 32;
		
		boolean finished = false;
		do {
			System.out.println("Please select an option:");
			System.out.println("1. Convert measurement");
			System.out.println("2. Convert distance");
			System.out.println("3. Convert temp");
			System.out.println("F. Press f to be finished");
			
			System.out.print("Your input: ");
			userInput = userScanner.next();
			System.out.println();
			
		switch (userInput) {
		case "1": 
			System.out.print("Enter in the number of cups: ");
			converter = userScanner.nextInt();
			output = converter * cupsToTeaspoons;
			System.out.println();
			System.out.println(converter + " cups is " + output + " teaspoons");
			break;
			
		case "2": 
			System.out.print("Enter in the number of miles: ");
			converter = userScanner.nextInt();
			output = converter * mileToYard;
			System.out.println();
			System.out.println(converter + " miles is " + output + " yards");
			break;
			
		case "3": 
			System.out.print("Enter in the degree of Farenheit to convert to Celsius: ");
			converter = userScanner.nextInt();
			output = (converter - myTemperature) * 5/9;
			System.out.println();
			System.out.println(converter + " degrees Farenheit is " + output + " degrees Celsius");
			break;
			
		//case used to end the program without the stop button
		case "f":
			finished = true;
			break;
		}
	}while (finished != true);
		
	}
}