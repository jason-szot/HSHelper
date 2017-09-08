package objects;

import java.util.ArrayList;

// used for calculating grades
public class Grader {

	public String grade(Double num) {
		if (num <= 59) {
			return "F";
		} else if (num <= 69) {
			return "D";
		}else if (num <= 76) {
			return "C";
		}else if (num <= 79) {
			return "C+";
		}else if (num <= 82) {
			return "B-";
		}else if (num <=86) {
			return "B";
		}else if (num <= 89) {
			return "B+";
		}else if (num <= 92) {
			return "A-";
		}else if (num <= 96) {
			return "A";
		}else{
			return "D";
		}
	}
	
	public double calcPerc(ArrayList<Assignment> list) {
		if (list == null || list.isEmpty()) {
			return -1;
		}
		double score = 0;
		double points = 0;
		for (Assignment node : list) {
			score += node.Score;
			points += node.Worth;
		}
		return ((score / points) * 100);
		
	}
	
}
