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
public class TestPainting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			Painting p1 = new Painting();
			System.out.println("Enter the title1 for p1 >>> ");
			String title1 = br.readLine();
			System.out.println("Enter the artist1 for p1 >>> ");
			String artist1 = br.readLine();
			System.out.println("Enter the medium1 for p1 >>> ");
			String medium1 = br.readLine();
			System.out.println("Enter the price1 for p1 >>> ");
			double price1 = Double.parseDouble(br.readLine());
			System.out.println("Enter the galleryCommission1 for p1 >>> ");
			double galleryCommission1 = Double.parseDouble(br.readLine());
			
			p1.setTitle(title1);
			p1.setArtist(artist1);
			p1.setMedium(medium1);
			p1.setPrice(price1);
			p1.setGalleryCommission(galleryCommission1);
			
			Painting p2 = new Painting();
			System.out.println("Enter the title2 for p2 >>> ");
			String title2 = br.readLine();
			System.out.println("Enter the artist2 for p2 >>> ");
			String artist2 = br.readLine();
			System.out.println("Enter the medium2 for p2 >>> ");
			String medium2 = br.readLine();
			System.out.println("Enter the price2 for p2 >>> ");
			double price2 = Double.parseDouble(br.readLine());
			System.out.println("Enter the galleryCommission2 for p2 >>> ");
			double galleryCommission2 = Double.parseDouble(br.readLine());
			
			p2.setTitle(title2);
			p2.setArtist(artist2);
			p2.setMedium(medium2);
			p2.setPrice(price2);
			p2.setGalleryCommission(galleryCommission2);
			
			
			p1.getTitle();
			p1.getArtist();
			p1.getMedium();
			p1.getPrice();
			p1.getGalleryCommission();
			
			p2.getTitle();
			p2.getArtist();
			p2.getMedium();
			p2.getPrice();
			p2.getGalleryCommission();
			
			Painting p3 = new Painting();
			
			p3.getTitle();
			p3.getArtist();
			p3.getMedium();
			p3.getPrice();
			p3.getGalleryCommission();
			
			
			
			System.out.println(p3.getGalleryCommission());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
