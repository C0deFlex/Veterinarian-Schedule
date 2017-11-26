import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Animal.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

public abstract class Animal
{
	private Owner owner;
	private String name;
	private int age;
	private Map<String, Boolean> medicalHistory;
	private Vector<String> vaccinations;
	private Vector<Appointment> appointments;

	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
		this.medicalHistory = new HashMap<String, Boolean>();
	}

	public Owner getOwner ()
	{
		return owner;
	}

	public String getName ()
	{
		return name;
	}

	public int getAge ()
	{
		return age;
	}

	public String getMedicalHistory ()
	{
		String output = new String();

		for (Map.Entry<String, Boolean> entry : this.medicalHistory.entrySet())
			output += "Pathology: " + entry.getKey() + " | Active: " + entry.getValue() + "\n";

		return output;
	}

	public Vector<String> getVaccinations ()
	{
		return vaccinations;
	}

	public Vector<Appointment> getAppointments ()
	{
		return appointments;
	}

	/**
	 * Adds pathology to medical history and whether it is active or not.
	 * @param pathology - String representation of the pathology
	 * @param active - boolean value if it is still active
	 * @return - True if the pathology was added, false otherwise which means avoiding double entry into medical history.
	 */
	public boolean addMedicalHistory(String pathology, Boolean active)
	{
		if (!this.medicalHistory.containsKey(pathology))
		{
			this.medicalHistory.put(pathology,active);
			return true;
		}

		return false;
	}

	/**
	 * Set's pathology in medical records to true or false
	 * @param pathology - provided disease to alter status
	 * @param cured - status changing boolean
	 * @return True, if executed successfully, false if not, due to @param pathology not existing in medical history.
	 */
	public boolean setPathologyStatus(String pathology, boolean cured)
	{
		if (this.medicalHistory.containsKey(pathology))
		{
			this.medicalHistory.replace(pathology,!cured);
			return true;
		}

		return false;
	}

	/**
	 * Remove medical pathology from history
	 * @param pathology - The pathology to remove
	 * @return - True if sucessfull, false otherwise. False: pathology did not exist in medical history
	 */
	public boolean removeMedicalPathology(String pathology)
	{
		if (this.medicalHistory.containsKey((pathology)))
		{
			this.medicalHistory.remove(pathology);
			return true;
		}

		return false;
	}
	
	public void addAppointment()
	{
		Appointment a = new Appointment();
		this.appointments.add(a);
	}

	@Override
	public String toString () { return ("Animal Name: " + this.name + "\nAnimal Age: " + this.age); }

}
