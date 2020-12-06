import java.util.Scanner;
public class Lab2p1 {
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			switch (choice) {
				case 1: 
					mulTest();
					break;
				case 2: 
					int m, n;
					System.out.println("Enter the value of m");
					m = sc.nextInt();
					System.out.println("Enter the value of n");
					n = sc.nextInt();
					System.out.println(m + "/" + n + " = " + divide(m, n));
					System.out.println();
					break;
				case 3:
					int x, y;
					System.out.println("Enter the value of m");
					x = sc.nextInt();
					System.out.println("Enter the value of n");
					y = sc.nextInt();
					System.out.println(x + " % " + y + " = " + modulus(x, y));
					System.out.println();
					break;
				case 4:
					int a;
					System.out.println("Enter a positive integer: ");
					a = sc.nextInt();
					if(a<0) {
						System.out.println("n: "+ a + " - Error input!!");
					}
					else {
						System.out.println("n: "+ a + " - count = "+ countDigits(a));
					}
					System.out.println();
					break;
				case 5:
					int num, digit;
					System.out.println("Enter a number: ");
					num = sc.nextInt();
					System.out.println("Enter digit to locate: ");
					digit = sc.nextInt();
					
					System.out.println("position = " + position(num, digit));
					System.out.println();
					break;
				case 6:
					int exNum;
					System.out.println("Enter a number for extraction: ");
					exNum = sc.nextInt();
					if(exNum<0) {
						System.out.println("oddDigits = Error Input!!"); }
					else {
						System.out.println("oddDigits = " + extractOddDigits(exNum)); }
					System.out.println();
					break; 
				case 7: System.out.println("Program terminating ....");
			}
		} while (choice < 7);
	}
	
	//3.2
	public static void mulTest() {
		
		int correctCounter=0, min=1, max=9; 
		int randomNumber1, randomNumber2;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			randomNumber1 = (int)(Math.random()*(max-min+1)+min);
			randomNumber2 = (int)(Math.random()*(max-min+1)+min);
			
			System.out.println("How much is " + randomNumber1 + " times " + randomNumber2 + " ?");
			int mulAns = sc.nextInt();
			
			if(mulAns == randomNumber1*randomNumber2) {
				correctCounter++;
			}
		}
		
		System.out.println(correctCounter + " out of 5 are correct.");
		System.out.println();
	}
	
	
	//3.3
	public static int divide(int m, int n) {
		
		int divideAns=0;
		while(m >= n) {
			m = m - n;
			divideAns++;
		}
		return divideAns;
	}
		
		
	//3.4
	public static int modulus(int m, int n) {
		while(m>=n) {  
			m = m-n;
		}
		return m;
	}
		
	
	//3.5
	public static int countDigits(int n) {
		int count = 0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return count;
	}
	
	
	//3.6
	public static int position(int n, int digit) {
		int a, count=0;
		
		while(n!=0) {
			a = n % 10;
			count++;
			if(a == digit) {
				return count;
			}
			else {
				n/=10;
			}
			
		}
		return -1;
	}
	
	
	//3.7
	public static long extractOddDigits(long n) {
		long x, pow =0, newNum=0;
		
		while(n!=0) {
			x = n % 10;
			
			if(x%2!=0) {
				newNum += x * (long)Math.pow(10,pow);
				pow++;
			}
			n/=10;
				
		}
		
		if(newNum == 0) return -1;
		else return newNum;
	}
	
	
}
