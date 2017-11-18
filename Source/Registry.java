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

public class Registry 
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
}
