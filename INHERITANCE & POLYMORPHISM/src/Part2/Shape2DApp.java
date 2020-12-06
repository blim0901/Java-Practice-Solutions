package Part2;

import java.util.Scanner;

public class Shape2DApp {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int tempLength, tempWidth, tempRadius, tempHeight, tempBase;
		double totalArea = 0;
		
		System.out.println("Enter the total number of shapes: ");
		int numOfShapes = sc.nextInt();
		
		for (int i=0; i<numOfShapes; i++) {
			System.out.println("Choose the shape according to the number: ");
			System.out.println("Enter 1 for Square");
			System.out.println("Enter 2 for Rectangle");
			System.out.println("Enter 3 for Circle");
			System.out.println("Enter 4 for Triangle");
			int shapeChoice = sc.nextInt();
			switch(shapeChoice) {
			
			case 1:
				System.out.println("You have chosen Square");
				System.out.println("Enter the value of the length:");
				tempLength = sc.nextInt();
				Square square = new Square(tempLength);
				System.out.println("Area of square is " + square.getArea());
				totalArea += square.getArea();
				break;
			case 2:
				System.out.println("You have chosen Rectangle");
				System.out.println("Enter the value of the length:");
				tempLength = sc.nextInt();
				System.out.println("Enter the value of the width:");
				tempWidth = sc.nextInt();
				Rectangle rectangle = new Rectangle(tempLength, tempWidth);
				System.out.println("Area of rectangle is " + rectangle.getArea());
				totalArea += rectangle.getArea();
				break;
			case 3:
				System.out.println("You have chosen Circle");
				System.out.println("Enter the value of the radius:");
				tempRadius = sc.nextInt();
				Circle circle = new Circle(tempRadius);
				System.out.println("Area of circle is " + circle.getArea());
				totalArea += circle.getArea();
				break;
			case 4:
				System.out.println("You have chosen Triangle");
				System.out.println("Enter the value of the height:");
				tempHeight = sc.nextInt();
				System.out.println("Enter the value of the base:");
				tempBase = sc.nextInt();
				Triangle triangle = new Triangle(tempHeight, tempBase);
				System.out.println("Area of triangle is " + triangle.getArea());
				totalArea += triangle.getArea();
				break;
			}
			
		}
		
		System.out.printf("Total area of all the shape is %f", totalArea);
		System.out.println();
		System.out.println("----- END OF PROGRAM -----");
	}
	
	
	
}
