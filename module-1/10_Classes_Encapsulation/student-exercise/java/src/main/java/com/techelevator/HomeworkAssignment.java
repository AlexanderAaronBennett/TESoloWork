package com.techelevator;

public class HomeworkAssignment {

	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public  HomeworkAssignment(int possibleMarks) {

		
		this.possibleMarks = possibleMarks;
	}
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String homeworkAssignment(int possibleMarks) {
		return submitterName;
	
	}
	
	public String getLetterGrade() {
		if (((double)earnedMarks * 10) >= ((double)possibleMarks * 9)) {
				return "A";
		}
		else if (((double)earnedMarks * 10) >= ((double)possibleMarks * 8)) {
			
			return "B";
		}
		else if(((double)earnedMarks * 10) >= ((double)possibleMarks * 7)) {
		
			return "C";
		}
		else if (((double)earnedMarks * 10) >= ( (double)possibleMarks * 6)) {
			return "D";
		}
	else return "F";
	}
	
	
}
	
	
	
	


