package lab3plane;

import java.util.Arrays;

public class Plane {

	private int numEmptySeat;
	private PlaneSeat[] seat = new PlaneSeat[12];
	
	public Plane() {
		this.numEmptySeat = 12;
		
		for (int i=0; i<12; i++) {
			this.seat[i] = new PlaneSeat(i);
		}
		
	}
	
	
	private PlaneSeat[] sortSeats() {
		
		//Create a temporary array to store customerID
		int[] tempCustomerArr = new int[12-this.numEmptySeat];
		int x = 0;
		for (int i=0; i<12; i++) {
			if (this.seat[i].isOccupied()) {
				tempCustomerArr[x++] = this.seat[i].getCustomerID();
			}
		}
		
		//Sort in ascending order
		Arrays.sort(tempCustomerArr);
		
		
		//Create a temporary PlaneSeat
		PlaneSeat[] tempPlaneSeat = new PlaneSeat[12];
		for (int i=0; i<12; i++) {
			tempPlaneSeat[i] = new PlaneSeat(i);
		}
		
		//Storing the the customerID into new array
		for (int i=0; i<tempCustomerArr.length; i++) { 
			for (int j=0; j<12; j++) { 
				if (tempCustomerArr[i] == this.seat[j].getCustomerID()) {
					tempPlaneSeat[i].assign(j);
					break;
				}
			}
		}
		
		return tempPlaneSeat;
		
	}
	
	
	public void showNumEmptySeats() {
		System.out.println("There are " + this.numEmptySeat + " empty seats");
	}
	
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty:");
		for (int i=0; i<12; i++) {
			if (this.seat[i].isOccupied() == false) {
				System.out.println("SeatID " + (i+1));
			}
		}
		
	}
	
	
	public void showAssignedSeat(boolean bySeatId) {
		if (bySeatId) {
			for (int i=0; i<12; i++) {
				if (this.seat[i].isOccupied()) {
					System.out.println("SeatID " + (i+1) + " assigned to CustomerID " + this.seat[i].getCustomerID() + ".");
				}
			}
		}
		
		else {
			//PlaneSeat[] tempSeat = sortSeats();
			PlaneSeat[] tempSeat = new PlaneSeat[12];
			tempSeat = sortSeats();
			for (int i=0; i<tempSeat.length; i++) { // looping through the position counter
				for (int j=0; j<12; j++) { 
					if (tempSeat[i].getCustomerID() == j) {
						System.out.println("SeatID " + (j+1) + " assigned to CustomerID " + this.seat[j].getCustomerID() + ".");
						break;
					}
				}	
			}
		}
	}
	
	
	public void assignSeat(int seatId, int cust_id) {
		if (this.seat[seatId-1].isOccupied()) {
			System.out.println("Seat already assigned to a customer.");
		}
		
		else {
			this.seat[seatId-1].assign(cust_id);
			this.numEmptySeat--;
			System.out.println("Seat Assigned!");
		}
	}
	
	
	public void unAssignSeat(int seatId) {
		this.seat[seatId-1].unAssign();
		this.numEmptySeat++;
	}
	
	
}
