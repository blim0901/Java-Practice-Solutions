package Part2;

import java.util.Scanner;

public class Shape3DApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tempLength, tempWidth, tempRadius, tempHeight, tempBase;
		double totalArea = 0;
		
		System.out.println("Enter the total number of 3D figures: ");
		int numOfShapes = sc.nextInt();
		
		for (int i=0; i<numOfShapes; i++) {
			System.out.println("Choose the figure according to the number: ");
			System.out.println("Enter 1 for Cube");
			System.out.println("Enter 2 for Cuboid");
			System.out.println("Enter 3 for Sphere");
			System.out.println("Enter 4 for Pyramid");
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
				System.out.println("You have chosen Cuboid");
				System.out.println("Enter the value of the length:");
				tempLength = sc.nextInt();
				System.out.println("Enter the value of the width:");
				tempWidth = sc.nextInt();
				System.out.println("Enter the value of the height:");
				tempHeight = sc.nextInt();
				Cuboid cuboid = new Cuboid(tempLength, tempWidth, tempHeight);
				System.out.println("Area of cuboid is " + cuboid.getSurfaceArea());
				totalArea += cuboid.getSurfaceArea();
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
				System.out.println("You have chosen Pyramid");
				System.out.println("Enter the value of the slant height:");
				int tempSlantHeight = sc.nextInt();
				System.out.println("Enter the value of the height:");
				tempHeight = sc.nextInt();
				System.out.println("Enter the value of the base:");
				tempBase = sc.nextInt();
				Pyramid pyramid = new Pyramid(tempSlantHeight, tempHeight, tempBase);
				System.out.println("Area of pyramid is " + pyramid.getSurfaceArea());
				totalArea += pyramid.getSurfaceArea();
				break;
			}
			
		}
		
		System.out.printf("Total area of all the figures is %f", totalArea);
		System.out.println();
		System.out.println("----- END OF PROGRAM -----");

	}

}
