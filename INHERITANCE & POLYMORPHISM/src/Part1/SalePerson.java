package Part1;

import java.util.Scanner;

public class SalePerson implements Comparable{
	
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	public String toString() {
		return this.lastName + " ," + this.firstName + " : " + this.totalSales;
	}
	
	
	public boolean equals(Object o) {
		SalePerson p = (SalePerson) o;
		if (this.firstName ==  p.getFirstName() && this.lastName == p.getLastName()) {
			return true;
		}
		return false;
	}
	
	
	public int compareTo(Object o) {
		SalePerson p = (SalePerson) o;
		if (this.totalSales == p.getTotalSales()) {
			return this.lastName.compareTo(p.getLastName());
		}
		
		
		else if (this.totalSales < p.getTotalSales()) {
			return -1;
		}
		
		else  {
			return 1;
		}
	}
	
	
	public String getFirstName() {
		return this.firstName;
	}
	

	public String getLastName() {
		return this.lastName;
	}
	
	
	public int getTotalSales() {
		return this.totalSales;
	}
	
}
