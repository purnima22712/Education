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
public class TestSandwich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			GreenSandwich gs1 = new GreenSandwich();
			gs1.setIngredient("Default Type");
			gs1.getIngredient();
			
			GreenSandwich gs2 = new GreenSandwich();
			System.out.println("Enter BreadType >>> ");
			String breadType = br.readLine();
			gs2.setBreadType(breadType);
			gs2.getBreadType();
			
			GreenSandwich gs3 = new GreenSandwich();
			System.out.println("Enter price >>> ");
			String price = br.readLine();
			gs3.setPrice(Double.parseDouble(price));
			gs3.getPrice();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
