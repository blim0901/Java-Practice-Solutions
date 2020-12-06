package Part1;
import java.util.Scanner;

public class Numbers
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
	//When passing integer array to comparable in java, use Integer instead of int. int is a primitive and not a class, hence do not have the compare method.
	Integer[] intList;  //changed int to Integer here
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many integers do you want to sort? ");
	size = scan.nextInt();
	intList = new Integer[size];  //changed int to Integer here
	System.out.println ("\nEnter the numbers...");
	for (int i = 0; i < size; i++)
		intList[i] = scan.nextInt();
		Sorting.insertionSort(intList);
		System.out.println ("\nYour numbers in sorted order...");
	for (int i = 0; i < size; i++)
		System.out.print(intList[i] + " ");
	System.out.println ();
	}
}