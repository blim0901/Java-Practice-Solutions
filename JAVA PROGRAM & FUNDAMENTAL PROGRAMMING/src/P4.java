import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the height: ");
		int height = sc.nextInt();
		
		if (height>0)
		{
			for(i=1; i<=height; i++)
			{
				for(j=1; j<=i; j++)
				{
					if(j%2==1)
					{
						if((i%2) == 1)
						{
							System.out.print("AA");
						}
						else
						{
							System.out.print("BB");
						}
						
					}
					else
					{
						if((i%2) == 1)
						{
							System.out.print("BB");
						}
						else
						{
							System.out.print("AA");
						}
					}
				}
				
				System.out.println();
			}
		}
		
		else {
			System.out.println("Error input!!");
		}

	}

}
