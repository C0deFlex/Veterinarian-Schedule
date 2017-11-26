/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Dog.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

public class Dog extends Animal
{
	public static final String[] supportedDogs = {"Pitbul Terrier","Labrador Retriever", "Boston Terrier", "Golden Retriever", "King Charles Spaniel" };
	public enum dogType { PITBULLTERRIER, LABRADORRETRIEVER, BOSTONTERRIER, GOLDENRETRIEVER, KINGCHARLESSPANIEL }
	private dogType type;
	
	Dog(String name, int age)
	{
		super(name, age);
	}
	
	Dog()
	{
		super(UserInterface.askAnimalName(), UserInterface.askAnimaleAge());
		this.type = UserInterface.askForAcceptedDogs();
	}
	
}
