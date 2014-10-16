/**
 * 
 */
package com.itu.assignment;

/**
 * @author Sindhu
 *
 */
public class Painting {
	
	String title;
	String artist;
	String medium;
	double price;
	double galleryCommission;
	
	public Painting() {
		title = "Nature";
		artist = "Alexandar";
		medium = "OilPaint";
		price = 90;
		galleryCommission = 10;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		System.out.println("Title >> "+title);
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		System.out.println("Artist >> "+artist);
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * @return the medium
	 */
	public String getMedium() {
		System.out.println("Medium >> "+medium);
		return medium;
	}

	/**
	 * @param medium the medium to set
	 */
	public void setMedium(String medium) {
		this.medium = medium;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		System.out.println("Price >> "+price);
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the galleryCommission
	 */
	public double getGalleryCommission() {
		System.out.println("Gallery Commision >> "+20);
		return 20;
	}

	/**
	 * @param galleryCommission the galleryCommission to set
	 */
	public void setGalleryCommission(double galleryCommission) {
		this.galleryCommission = galleryCommission;
	}

	
}
