import java.io.Serializable;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Bird.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

public class Bird extends Animal implements Serializable
{
	public static final String[] supportedBirds = {"Umbrella Cockatoo", "African Gray", "Conure", "Cockatiel", "Parakeet"};
	
	public enum birdType { UMBRELLACOCKATOO, AFRICANGRAY, CONURE, COCKATIEL, PARAKEET }
	
	private birdType type;
	
	Bird()
	{
		super(Animal.animalType.BIRD);
		this.type = UserInterface.askForAcceptedBirds();
	}
	
	public String getBirdType()
	{
		return this.type.toString();
	}
	
	@Override
	public String toString () { return ("Animal Name: " + super.getName() + "\nAnimal Age: " + super.getAge() + "\nAnimal Type: BIRD" + "\nAnimal Subtype: " + this.getBirdType() + "\nOwner Name: " + this.getOwner().getName()
			+ "\nOwner Address: " + this.getOwner().getAddress() + "\nOwner Phone: " + getOwner().getPhoneNumber()); }
}
