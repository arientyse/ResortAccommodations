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
		int resortFloors = in.nextInt(); //The user inputs the total amount of resort floors
		
		while (resortFloors < 1) //Prompts the user to input a valid number if they attempt to input a number less than 1
		{
			System.out.print("Invalid. Enter 1 or more: ");
			resortFloors = in.nextInt();
		}
		
		for (int floor = 1; floor <= resortFloors; floor++) //Increments the floor value when the system prompts the user to input floor information
		{
			System.out.print("How many rooms does Floor " + floor + " have? "); //Prompts the user to input the amount of rooms on each floor and increments to the next floor once entered
			int floorRooms = in.nextInt();
			
			while (floorRooms < 10) //If the amount of rooms added is less than 10, the system will prompt the user to enter the value again
			{
				System.out.print("Invalid. Enter 10 or more: ");
				floorRooms = in.nextInt();
			}
			
			floorRooms = totalRooms;
			
			System.out.print("How many occupied rooms does Floor " + floor + " have? "); //Prompts the user to input the amount of occupied rooms on each floor and increments to the next floor once added
			int occupiedFloorRooms = in.nextInt();
			
			while (occupiedFloorRooms > floorRooms) //If the amount of occupied rooms entered exceeds the amount of rooms on the floor, the system will prompt the user to enter the value again
			{
				System.out.print("Invalid. Exceeds number of available rooms on this floor. How many rooms are on Floor" + floor);
				occupiedFloorRooms = in.nextInt();	
			}
			
			 occupiedFloorRooms = totalOccupiedRooms;
		}
		
		in.close();
		
		
		//Computation
		
		int vacantRooms = totalRooms - totalOccupiedRooms; //Calculates the number of vacant rooms in the resort
		
		double percentOccupant = (totalOccupiedRooms/totalRooms) * 100; //Calculates the percentage of occupied rooms
		
		//Output
		
		System.out.println();
		
		System.out.println("Number of Floors: " + resortFloors); // Prints the amount of resort floors
		System.out.println("Occupied Rooms:   " + totalOccupiedRooms); //Prints the total number of occupied rooms
		System.out.println("Vacant Rooms:     " + vacantRooms); //Prints the total number of vacant rooms
		System.out.printf("Occupancy Rate: %.2f \n", percentOccupant); //Prints the percentage of occupied rooms in the resort

	}

}
