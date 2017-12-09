import java.io.Serializable;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Fish.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

public class Fish extends Animal implements Serializable
{
	public static final String[] supportedFish = {"Beta", "Goldfish", "Anglerfish", "Tetradontidae", "Eel" };
	
	public enum fishType { BETA, GOLDFISH, ANGLERFISH, TETRADONTIDAE, EEL }
	
	private fishType type;
	
	Fish()
	{
		super(Animal.animalType.FISH);
		this.type = UserInterface.askForAcceptedFish();
	}
	
	public String getFishType()
	{
		return this.type.toString();
	}
	
	@Override
	public String toString () { return ("Animal Name: " + super.getName() + "\nAnimal Age: " + super.getAge() + "\nAnimal Type: FISH" + "\nAnimal Subtype: " + this.getFishType() + "\nOwner Name: " + this.getOwner().getName()
			+ "\nOwner Address: " + this.getOwner().getAddress() + "\nOwner Phone: " + getOwner().getPhoneNumber()); }
}
