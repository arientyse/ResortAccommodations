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
		
		for (int floor = 1; floor <= resortFloors; floor++)
		{
			System.out.print("How many rooms does Floor " + floor + " have? ");
			int floorRooms = in.nextInt();
			
			while (floorRooms < 10)
			{
				System.out.print("Invalid. Enter 10 or more: ");
				floorRooms = in.nextInt();
			}
			
			floorRooms = totalRooms;
			
			System.out.print("How many occupied rooms does Floor " + floor + " have? ");
			int occupiedFloorRooms = in.nextInt();
			
			while (occupiedFloorRooms > totalRooms)
			{
				System.out.print("Invalid. Exceeds number of total rooms. How many rooms are on Floor" + floor);
				occupiedFloorRooms = in.nextInt();	
			}
			
			 occupiedFloorRooms = totalOccupiedRooms;
		}
		
		in.close();
		
		
		//Computation
		
		int vacantRooms = totalRooms - totalOccupiedRooms;
		
		double percentOccupant = (totalOccupiedRooms/totalRooms) * 100;
		
		//Output
		
		System.out.println();
		
		System.out.println("Number of Floors: " + resortFloors);
		System.out.println("Occupied Rooms:   " + totalOccupiedRooms);
		System.out.println("Vacant Rooms:     " + vacantRooms);
		System.out.printf("Occupancy Rate: %.2f \n", percentOccupant);

	}

}
