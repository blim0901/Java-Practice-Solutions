package lab3plane;

import java.util.Scanner;

public class PlaneApp {
	
	public static void main(String[] args) {
		
		Plane plane1 = new Plane();
		int seatIDInput, customerIDInput;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		System.out.println("Enter the number of your choice: ");
		int choice = sc.nextInt();
		System.out.println();
		
		while(choice!=7)
		{
			switch(choice)
			{
				case 1:
					plane1.showNumEmptySeats();
					break;
				case 2:
					plane1.showEmptySeats();
;					break;
				case 3:
					System.out.println("The seat assignments are as follows: ");
					plane1.showAssignedSeat(true);
					break;
				case 4:
					System.out.println("The seat assignments are as follows: ");
					plane1.showAssignedSeat(false);
					break;
				case 5:
					System.out.println("Assigning Seat ..");
					System.out.println("  Please enter SeatID: ");
					seatIDInput = sc.nextInt();
					System.out.println("  Please enter Customer ID: ");
					customerIDInput = sc.nextInt();
					plane1.assignSeat(seatIDInput, customerIDInput);
					break;
				case 6:
					System.out.println("Enter SeatID to unassign customer from: ");
					seatIDInput = sc.nextInt();
					plane1.unAssignSeat(seatIDInput);
					System.out.println("Seat Unassigned!");
					break;
				default:
					System.out.println("Invalid input, try again");
				
			}
			System.out.println("Enter the number of your choice: ");
			choice = sc.nextInt();
		}
		
		
	}
	
}
