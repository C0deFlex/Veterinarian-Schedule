import java.io.*;
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
		while(true)
		{
			switch (UserInterface.menuChoice(UserInterface.menulocation.START))
			{
				//Create Animal
				case 1:
				{
					instantiateAddAnimal(UserInterface.menuChoice(UserInterface.menulocation.CREATEANIMAL));
					break;
				}
				//Create Appointment
				case 2:
				{
					UserInterface.menuChoice(UserInterface.menulocation.CREATEAPPOINTMENT);
					UserInterface.selectAnimal(this.list).addAppointment();
					break;
				}
				//Search
				case 3:
				{
					System.out.println("Feature not yet implemented!");
					UserInterface.menuChoice(UserInterface.menulocation.SEARCH);
					break;
				}
				//Save
				case 4:
				{
					UserInterface.menuChoice(UserInterface.menulocation.SAVE);
					saveData();
					break;
				}
				//Load
				case 5:
				{
					UserInterface.menuChoice(UserInterface.menulocation.LOAD);
					loadData();
					break;
				}
				case 0:
				{
					UserInterface.menuChoice(UserInterface.menulocation.EXIT);
					break;
				}
			}
			
			// Ends program
			if (UserInterface.getMenuLocation() == UserInterface.menulocation.EXIT)
				break;
		}
	}
	
	public boolean saveData()
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(UserInterface.askForFileName(false));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.list);
			
			oos.close();
			fos.close();
		}
		catch ( Exception e )
		{
			return false;
		}
		
		return true;
	}
	
	public boolean loadData()
	{
		try
		{
			FileInputStream fos = new FileInputStream(UserInterface.askForFileName(true));
			ObjectInputStream ois = new ObjectInputStream(fos);
			
			this.list = (Vector<Animal>)ois.readObject();
			
			fos.close();
			ois.close();
		}
		catch ( Exception e )
		{
			return false;
		}
		
		return true;
	}
	
	private void instantiateAddAnimal(int animal)
	{
		
		switch ( animal )
		{
			// Dog
			case 1:
			{
				Dog d = new Dog();
				addAnimal(d);
				
				System.out.println("\n --- ADDED --- \n" + d + "\n --- ADDED --- \n");
				break;
			}
			case 2:
			{
				//addAnimal(new Bird());
				Bird b = new Bird();
				addAnimal(b);
				
				System.out.println("\n --- ADDED --- \n" + b + "\n --- ADDED --- \n");
				break;
			}
			case 3:
			{
				//addAnimal(new Fish());
				Fish f = new Fish();
				addAnimal(f);
				
				System.out.println("\n --- ADDED --- \n" + f + "\n --- ADDED --- \n");
				break;
			}
		}
	}
}
