package com.techelevator;

public class Airplane {

	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;

	}

	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		
//		if(forFirstClass) {
//			if(this.getAvailableFirstClassSeats() < totalNumberOfSeats) {
//				return false;
//			}else {
//				bookedFirstClassSeats += totalNumberOfSeats; 
//				return true;
//			}
//			
//			
//		}else {
//			if(this.getAvailableCoachSeats() < totalNumberOfSeats) {
//				return false;
//			}else {
//				bookedCoachSeats += totalNumberOfSeats; 
//				return true;
//			}
//			
//		}

		if ((totalNumberOfSeats <= getAvailableFirstClassSeats()) && (forFirstClass)) {

			this.bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
			return true;
		}
		else if ((totalNumberOfSeats <= getAvailableCoachSeats()) && (!forFirstClass)) {
			this.bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
			return true;

		}
		return false;
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;

	}

	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;

	}

}
