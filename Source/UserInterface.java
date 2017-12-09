import java.util.Scanner;
import java.util.Vector;

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
	
	public enum menulocation {START, CREATEANIMAL, CREATEAPPOINTMENT, SEARCH, SAVE, LOAD, EXIT }
	
	private static menulocation menuLocation;
	
	public static int menuChoice(menulocation menu)
	{
		switch (menu)
		{
			case START:
			{
				menuLocation = menulocation.START;
				
				System.out.println("1. Create animal Entry.");
				System.out.println("2. Create Appointment for existing Animal.");
				System.out.println("3. Search for Appointments.");
				System.out.println("4. Save current Registry.");
				System.out.println("5. Load a Registry.");
				System.out.println("0. Exit program.");
				userInput = scan.nextLine();
				break;
			}
			case CREATEANIMAL:
			{
				menuLocation = menulocation.CREATEANIMAL;
				
				return askTypeOfAnimal();
				
				// Create Animal Object with Name and Age
				
				// Create Animal Owner's Information
				
				// Ask to insert into list.
			}
			case CREATEAPPOINTMENT:
			{
				menuLocation = menulocation.CREATEAPPOINTMENT;
				break;
			}
			case SEARCH:
			{
				menuLocation = menulocation.SEARCH;
				break;
			}
			case SAVE:
			{
				menuLocation = menulocation.SAVE;
				break;
			}
			case LOAD:
			{
				menuLocation = menulocation.LOAD;
				break;
			}
			case EXIT:
			{
				menuLocation = menulocation.EXIT;
				break;
			}
		}
		
		return Integer.parseInt(userInput);
	}
	
	public static menulocation getMenuLocation()
	{
		return menuLocation;
	}
	
	
	
	/**
	 * // Ask for animal type: Dog / Fish / Bird
	 * @return 1,2,3 respectively
	 */
	public static int askTypeOfAnimal()
	{
		do
		{
			System.out.println("Please select the type of animal: ");
			System.out.println("1. Dog");
			System.out.println("2. Bird");
			System.out.println("3. Fish");
			
			userInput = scan.nextLine();
		}while (!askForConfirmation(userInput));
		
		// TODO exception handle.
		return Integer.parseInt(userInput);
	}
	
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
				System.out.println((x + 1)+ ". " + Dog.supportedDogs[x]);
			
			userInput = scan.nextLine();
			
			/** TODO Exception can occur here */
			if (Integer.parseInt(userInput) > 6 && Integer.parseInt(userInput) < 1)
				continue;
			
		}while (!askForConfirmation(userInput));
		
		switch ( Integer.parseInt(userInput) )
		{
			case 1:
			{
				return Dog.dogType.PITBULLTERRIER;
			}
			case 2:
			{
				return Dog.dogType.LABRADORRETRIEVER;
			}
			case 3:
			{
				return Dog.dogType.BOSTONTERRIER;
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
		
		return null;
	}
	
	public static Bird.birdType askForAcceptedBirds()
	{
		do
		{
			System.out.println("Currently we support the following:");
			for (int x = 0; x < Bird.supportedBirds.length; x++)
				System.out.println((x + 1)+ ". " + Bird.supportedBirds[x]);
			
			userInput = scan.nextLine();
			
			/** TODO Exception can occur here */
			if (Integer.parseInt(userInput) > 6 && Integer.parseInt(userInput) < 1)
				continue;
			
		}while (!askForConfirmation(userInput));
		
		switch ( Integer.parseInt(userInput) )
		{
			case 1:
			{
				return Bird.birdType.UMBRELLACOCKATOO;
			}
			case 2:
			{
				return Bird.birdType.AFRICANGRAY;
			}
			case 3:
			{
				return Bird.birdType.CONURE;
			}
			case 4:
			{
				return Bird.birdType.COCKATIEL;
			}
			case 5:
			{
				return Bird.birdType.PARAKEET;
			}
		}
		
		return null;
	}
	
	public static Fish.fishType askForAcceptedFish()
	{
		do
		{
			System.out.println("Currently we support the following:");
			for (int x = 0; x < Fish.supportedFish.length; x++)
				System.out.println((x + 1)+ ". " + Fish.supportedFish[x]);
			
			userInput = scan.nextLine();
			
			/** TODO Exception can occur here */
			if (Integer.parseInt(userInput) > 6 && Integer.parseInt(userInput) < 1)
				continue;
			
		}while (!askForConfirmation(userInput));
		
		switch ( Integer.parseInt(userInput) )
		{
			case 1:
			{
				return Fish.fishType.BETA;
			}
			case 2:
			{
				return Fish.fishType.GOLDFISH;
			}
			case 3:
			{
				return Fish.fishType.ANGLERFISH;
			}
			case 4:
			{
				return Fish.fishType.TETRADONTIDAE;
			}
			case 5:
			{
				return Fish.fishType.EEL;
			}
		}
		
		return null;
	}
	
	/// Owner Information
	public static String askOwnerInformation(String information)
	{
		switch ( information )
		{
			case "name":
			{
				do
				{
					System.out.println("Please enter Owner Name: " );
					userInput = scan.nextLine();
				}while (!askForConfirmation(userInput));
				break;
			}
			case "address":
			{
				do
				{
					System.out.println("Please enter Owner address: " );
					userInput = scan.nextLine();
				}while (!askForConfirmation(userInput));
				break;
			}
			case "phone":
			{
				do
				{
					System.out.println("Please enter Owner phone: " );
					userInput = scan.nextLine();
				}while (!askForConfirmation(userInput));
				break;
			}
		}
		return userInput;
	}
	///
	
	public static String askForFileName(boolean load)
	{
		do
		{
			System.out.print("Enter " + (!load ? "save " : "load ") + "file name: ");
			userInput = scan.nextLine();
		}while(!askForConfirmation(userInput));
		
		return ( userInput + ".dat" );
	}
	
	public static Animal selectAnimal(Vector<Animal> list)
	{
		int counter = 1;
		
		do
		{
			System.out.println("Please select the animal you wish to create an appointment for: ");
			
			counter = 1;
			for ( Animal a : list)
			{
				System.out.println(counter + ". " + list.elementAt(counter - 1).getName());
				counter++;
			}
			
			userInput = scan.nextLine();
			
		}while(!askForConfirmation(userInput));
		
		return list.elementAt(counter - 1);
	}
}
