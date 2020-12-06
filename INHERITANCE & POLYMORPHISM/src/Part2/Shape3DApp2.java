package Part2;

import java.util.Scanner;

public class Shape3DApp2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tempLength, tempRadius, tempHeight;
		double totalArea = 0;
		
		System.out.println("Enter the total number of 3D figures: ");
		int numOfShapes = sc.nextInt();
		
		for (int i=0; i<numOfShapes; i++) {
			System.out.println("Choose the figure according to the number: ");
			System.out.println("Enter 1 for Cube");
			System.out.println("Enter 2 for Cylinder");
			System.out.println("Enter 3 for Sphere");
			System.out.println("Enter 4 for Cone");
			int figureChoice = sc.nextInt();
			switch(figureChoice) {
			
			case 1:
				System.out.println("You have chosen Cube");
				System.out.println("Enter the value of the length:");
				tempLength = sc.nextInt();
				Cube cube = new Cube(tempLength);
				System.out.println("Area of cube is " + cube.getSurfaceArea());
				totalArea += cube.getSurfaceArea();
				break;
			case 2:
				System.out.println("You have chosen Cylinder");
				System.out.println("Enter the value of the radius:");
				tempRadius = sc.nextInt();
				System.out.println("Enter the value of the height:");
				tempHeight = sc.nextInt();
				Cylinder cylinder = new Cylinder(tempRadius, tempHeight);
				System.out.println("Area of cylinder is " + cylinder.getSurfaceArea());
				totalArea += cylinder.getSurfaceArea();
				break;
			case 3:
				System.out.println("You have chosen Sphere");
				System.out.println("Enter the value of the radius:");
				tempRadius = sc.nextInt();
				Sphere sphere = new Sphere(tempRadius);
				System.out.println("Area of sphere is " + sphere.getSurfaceArea());
				totalArea += sphere.getSurfaceArea();
				break;
			case 4:
				System.out.println("You have chosen Cone");
				System.out.println("Enter the value of the height:");
				int tempHeight1 = sc.nextInt();
				System.out.println("Enter the value of the radius:");
				tempRadius = sc.nextInt();
				Cone cone = new Cone(tempRadius, tempHeight1);
				System.out.println("Area of cone is " + cone.getSurfaceArea());
				totalArea += cone.getSurfaceArea();
				break;
			}
			
		}
		
		System.out.printf("Total area of all the figures is %f", totalArea);
		System.out.println();
		System.out.println("----- END OF PROGRAM -----");
		

	}

}
