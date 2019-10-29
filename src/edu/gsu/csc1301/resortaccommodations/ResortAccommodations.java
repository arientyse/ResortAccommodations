package edu.gsu.csc1301.resortaccommodations;

/**
 *This program find the occupancy rate at a hotel by comparing the number of rooms to the amount of 
 *occupied rooms and vacant rooms at a given time. 
 * 
 * 
 * @author Ariana Tyson
 * @version 10/28/2019
 *
 */

import java.util.Scanner;

public class ResortAccommodations {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		int totalRooms = 0;
		int totalOccupiedRooms = 0;
		
		//Input
		
		System.out.print("How many floors does the resort have? ");
		int resortFloors = in.nextInt();
		
		while (resortFloors < 1)
		{
			System.out.print("Invalid. Enter 1 or more: ");
			resortFloors = in.nextInt();
		}
		
		
		//Computation
		
		
		//Output

	}

}
