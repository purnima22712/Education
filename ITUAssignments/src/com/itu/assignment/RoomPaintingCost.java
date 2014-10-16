/**
 * 
 */
package com.itu.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sindhu
 *
 */
public class RoomPaintingCost {
	
	private static int paintSqFtPerGallon = 350;
	private static int pricePerGallon = 32;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the length: ");
			int length = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the width:");
			int width = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the height:");
			int height = Integer.parseInt(br.readLine());
			
			int wallArea = calculateRoomArea(width, height);
			
			int numOfGallonsNeeded = calculateNumberOfGallons(wallArea);
			
			System.out.println("Number Of Gallons Needed >>> "+numOfGallonsNeeded);
			
			float calculateTotalPrice =  calculateTotalPrice(numOfGallonsNeeded);
		
			StringBuffer sb = new StringBuffer();
			sb.append("The Cost of painting a ");
			sb.append(length);
			sb.append(" by ");
			sb.append(width);
			sb.append(" by ");
			sb.append(height);
			sb.append(" feet room is $");
			sb.append(calculateTotalPrice);
			
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int calculateRoomArea(int width, int height){
		
		return width * height;
	}
	
	private static int calculateNumberOfGallons(int wallArea){
		
		return wallArea / paintSqFtPerGallon;
	}
	
	private static float calculateTotalPrice(int numOfGallonsNeeded){
		
		return numOfGallonsNeeded * pricePerGallon;
	}

}
