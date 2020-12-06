import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		char choice;
		
		System.out.println("Enter character a, c or d: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.next().charAt(0);
		
		switch(choice)
		{
			case 'A':
				System.out.println("Action movie fan");
				break;
			case 'a':
				System.out.println("Action movie fan");
				break;
			case 'C':
				System.out.println("Comedy movie fan");
				break;
			case 'c':
				System.out.println("Comedy movie fan");
				break;
			case 'D':
				System.out.println("Drama movie fan");
				break;
			case 'd':
				System.out.println("Drama movie fan");
				break;
			default:
				System.out.println("Invalid choice");
			
		}

	}

}
