package objects;

import java.io.Serializable;

// object for tracking attendance
public class Attendance implements Serializable{


	private static final long serialVersionUID = 4597017163513193342L;
	String date;
	String time;
	String subjects;
	
	Attendance(String d, String t, String subj) {
		date = d;
		time = t;
		subjects = subj;
	}
	
}
