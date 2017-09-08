package objects;

import java.io.Serializable;

// for creating a list of desired field trips, with a spot for notes about it.
public class Trip implements Serializable{
	
	private static final long serialVersionUID = 7810777405717567495L;
	String Destination;
	Boolean Educational;
	Boolean Complete;
	String Notes;
	String Date;
	
	Trip(String name, Boolean ed) {
		Destination = name;
		Educational = ed;
	}
	
	void complete(String date) {
		Date = date;
		Complete = true;
	}
	
	void addNotes(String notes) {
		Notes = notes;
	}
	
}
