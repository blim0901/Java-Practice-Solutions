import java.util.Scanner;

public class P3 {

	public static double UsdToSgd( int usDollars)
	{
		double newValue = usDollars * 1.82;
		return newValue;
	}
	
	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("starting: ");
		int start = sc.nextInt();
		
		System.out.println("ending: ");
		int end = sc.nextInt();
		
		System.out.println("increment: ");
		int increment = sc.nextInt();
		
		if(start<=end)
		{
			//for loop method
			System.out.println("\nUS$        S$");
			System.out.println("--------------");
			for(i=start; i<=end; i+=increment)
			{
				double convertedValue = UsdToSgd(i);
				System.out.printf("%d    %.2f\n", i, convertedValue);
			}
			
			//while loop method
			i=start;
			System.out.println("\nUS$        S$");
			System.out.println("--------------");
			while(i<=end)
			{
				double convertedValue = UsdToSgd(i);
				System.out.printf("%d    %.1f\n", i, convertedValue);
				i+=increment;
			}
			
			//do/while loop method
			i=start;
			System.out.println("\nUS$      S$");
			System.out.println("--------------");
			do {
				double convertedValue = UsdToSgd(i);
				System.out.printf("%d      %.1f\n", i, convertedValue);
				i+=increment;
			} while(i<=end);
			
		}
		
		else
			System.out.println("Error input!!");

	}

}
