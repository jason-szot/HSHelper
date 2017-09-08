package objects;

import java.io.Serializable;

public class Goal implements Serializable{

	private static final long serialVersionUID = -7306608295399598748L;
	String name;
	Boolean complete;
	String comp_date;
	
	Goal(String goal) {
		name = goal;
	}
	
	public Boolean isComplete() {
		return complete;
	}
	
	public void Complete(String date) {
		this.complete = true;
		this.comp_date = date;
	}
}
