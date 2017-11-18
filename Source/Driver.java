/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Driver.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */


/**
 * Entry Point
 */
public class Driver 
{
	public static void main(String[] args)
	{
		Registry items = new Registry();

		Dog yadda = new Dog("Yipper",5);

		items.addAnimal(yadda);

		yadda.addMedicalHistory("Blind", true);
		yadda.addMedicalHistory("Mute", false);

		System.out.println(yadda.getMedicalHistory());

		yadda.setPathologyStatus("Blind", true);

		System.out.println(yadda.getMedicalHistory());
	}
}
