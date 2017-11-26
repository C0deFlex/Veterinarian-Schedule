import java.util.Scanner;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Owner.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

public class Owner 
{
	public Scanner scan;

	private String name;
	private String address;
	private String phoneNumber;

	public Owner()
	{
		scan = new Scanner(System.in);
	}

	private String initName()
	{
		while(true)
		{

		}
		
	}

	public String getName ()
	{
		return name;
	}

	public String getAddress ()
	{
		return address;
	}

	public String getPhoneNumber ()
	{
		return phoneNumber;
	}
}
