package objects;

import java.io.Serializable;

// To track community volunteering activities
public class Volunteer implements Serializable{
	
	private static final long serialVersionUID = 7792762667683722190L;
	String Location;
	String Activities;
	double Hours;
	String Notes;
	
	Volunteer(String name, String what, double hrs, String notes) {
		Location = name;
		Activities = what;
		Hours = hrs;
		Notes = notes;
	}
}
