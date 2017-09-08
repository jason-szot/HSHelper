package objects;

import java.io.Serializable;

// object representing an assignment
public class Assignment implements Serializable{
	private static final long serialVersionUID = 7961676765366591502L;
	String Name;
	int Score;
	int Worth;
	double Grade;
	String Alpha_Grade;
	
	Assignment(String name, int score, int total, double percent, String let_grade) {
		Name = name;
		Score = score;
		Worth = total;
		Grade = percent;
		Alpha_Grade = let_grade;
	}
}
