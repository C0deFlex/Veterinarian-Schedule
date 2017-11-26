import java.io.Serializable;
import java.util.Vector;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Registry.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

/**
 * This will be the main item that stores ALL information for the clinic
 * More specifically this was initially made to have a way to save/load the items.
 */
public class Registry implements Serializable
{
	private Vector<Animal> list;

	Registry()
	{
		this.list = new Vector<Animal>();
	}

	public void addAnimal(Animal animal)
	{
		this.list.add(animal);
	}
	
	public void delAnimal(Animal animal) {this.list.remove(animal);}
	
	/**
	 * Start of the program. The registry is the program.
	 */
	public void start()
	{
		UserInterface.welcomeScreen();
		
		Animal a = new Dog();
		//a.addAppointment();
	}
}
