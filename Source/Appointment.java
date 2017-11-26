import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Appointment.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

public class Appointment
{
	public static final String dateFormat = "MM/dd/yyyy '-' hh:mm a";
	
	private Date date;
	DateFormat df;
	
	Appointment()
	{
		setDate();
	}
	
	public void printDate()
	{
		System.out.printf("%1$tB %1te, %1$tY - %1$tr",this.date);
	}
	
	private void setDate()
	{
		df = new SimpleDateFormat(dateFormat);
		
		try
		{
			date = df.parse(UserInterface.askUserForAppointment());
		}
		catch ( ParseException e )
		{
			System.out.println("Error - You did not follow the correct date format. ");
		}
	}
}
