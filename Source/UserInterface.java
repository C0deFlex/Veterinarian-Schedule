import java.util.Scanner;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           UserInterface.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */
 
public abstract class UserInterface
{
	private static Scanner scan = new Scanner(System.in);
	
	/** Using a univesal string for input is faulty if the program is to be multithreaded, we will have race conditions.
	 * For this class, this should suffice. */
	private static String userInput;
	
	public static String  askUserForAppointment()
	{
		System.out.println("Use the following format for an appointment: " + Appointment.dateFormat);
		
		userInput = scan.nextLine();
		
		return  userInput;
	}
	
	public static void welcomeScreen()
	{
		System.out.println("Welcome to Vet-A$$ist v1.0!");
	}
	
	public static String askAnimalName()
	{
		do
		{
			System.out.println("Please enter the Animal's Name: ");
			userInput = scan.nextLine();
		}while (!askForConfirmation(userInput));
		
		return userInput;
	}
	
	public static int askAnimaleAge()
	{
		do
		{
			System.out.println("Please enter the Animal's Age: ");
			userInput = scan.nextLine();
		}while (!askForConfirmation(userInput));
		
		return Integer.parseInt(userInput);
	}
	
	private static boolean askForConfirmation(String input)
	{
		String confirmation = "NULL";
		
		while(confirmation.toLowerCase().compareTo("n") != 0 && confirmation.toLowerCase().compareTo("no") != 0 &&
				confirmation.toLowerCase().compareTo("y") != 0 && confirmation.toLowerCase().compareTo("yes") != 0)
		{
			System.out.println("You entered: " + input);
			System.out.println("Is this correct? Y/N?");
			confirmation = scan.nextLine();
		}
		
		if (confirmation.toLowerCase().compareTo("n") == 0 || confirmation.toLowerCase().compareTo("no") == 0)
			return false;
		return true;
	}
	
	public static Dog.dogType askForAcceptedDogs()
	{
		do
		{
			System.out.println("Currently we support the following:");
			for (int x = 0; x < Dog.supportedDogs.length; x++)
				System.out.println((x + 1) + Dog.supportedDogs[x]);
			
			userInput = scan.nextLine();
			
			/** Exception can occur here */
			if (Integer.parseInt(userInput) > 5 && Integer.parseInt(userInput) < 0)
				continue;
			
			switch ( Integer.parseInt(userInput) )
			{
				case 1:
				{
					return Dog.dogType.PITBULLTERRIER;
				}
				case 2:
				{
					return Dog.dogType.BOSTONTERRIER;
				}
				case 3:
				{
					return Dog.dogType.LABRADORRETRIEVER;
				}
				case 4:
				{
					return Dog.dogType.GOLDENRETRIEVER;
				}
				case 5:
				{
					return Dog.dogType.KINGCHARLESSPANIEL;
				}
			}
			
		}while (askForConfirmation(userInput));
		
		return null;
	}
}
