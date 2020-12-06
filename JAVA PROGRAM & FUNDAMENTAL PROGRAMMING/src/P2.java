import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		
		System.out.println("Enter merit: ");
		int merit = sc.nextInt();
		
		if ((700<=salary&&salary<=899) && merit>=20 || (800<=salary&&salary<=899))
		{
			grade = 'A';
		}
		
		else if ((700<=salary&&salary<=799) && merit<=20 || (600<=salary&&salary<=799) && merit>=10)
		{
			grade = 'B';
		}
		
		else
		{
			grade = 'C';
		}
		
		System.out.println("salary: $" + salary + ", merit: " + merit + " - Grade " + grade);
	}

}
