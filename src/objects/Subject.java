package objects;

import java.io.Serializable;
import java.util.ArrayList;

// class for subjects
public class Subject implements Serializable{

	private static final long serialVersionUID = -2861434089604274486L;
	String name;
	double grade;
	String let_grade;
	Grader grader;
	ArrayList<Assignment> assignments;
	
	Subject(String title) {
		name = title;
		assignments = new ArrayList<Assignment>();
	}
	
	void addHW(Assignment hw) {
		if (hw != null) {
			this.assignments.add(hw);
			calcGrades();
		}
	}
	
	String getAlphaGrade() {
		return let_grade;
	}
	
	void calcGrades() {
		grader = new Grader();
		this.grade = grader.calcPerc(assignments);
		this.let_grade = grader.grade(this.grade);
	}
}
