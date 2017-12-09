import java.io.Serializable;

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

public class Dog extends Animal implements Serializable
{
	public static final String[] supportedDogs = {"Pitbul Terrier","Labrador Retriever", "Boston Terrier", "Golden Retriever", "King Charles Spaniel" };
	
	public enum dogType { PITBULLTERRIER, LABRADORRETRIEVER, BOSTONTERRIER, GOLDENRETRIEVER, KINGCHARLESSPANIEL }
	
	private dogType type;
	
	Dog()
	{
		super(Animal.animalType.DOG);
		this.type = UserInterface.askForAcceptedDogs();
	}
	
	public String getDogType()
	{
		return this.type.toString();
	}
	
	@Override
	public String toString () { return ("Animal Name: " + super.getName() + "\nAnimal Age: " + super.getAge() + "\nAnimal Type: DOG" + "\nAnimal Subtype: " + this.getDogType() + "\nOwner Name: " + this.getOwner().getName()
			+ "\nOwner Address: " + this.getOwner().getAddress() + "\nOwner Phone: " + getOwner().getPhoneNumber()); }
}
