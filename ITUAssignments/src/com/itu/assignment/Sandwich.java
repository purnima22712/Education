/**
 * 
 */
package com.itu.assignment;

/**
 * @author Sindhu
 *
 */
class GreenSandwich {
	String ingredient = "Grilled Veggies";
	String breadType = "wheat";
	double price = 4.99;

	
	public void displaySandwichTypeAndPrice(){
		System.out.println("Bread Type is >>> "+getBreadType());
		System.out.println("Price is >>> "+getPrice());
	}


	/**
	 * @return the ingredient
	 */
	public String getIngredient() {
		System.out.println("Sandwich >>> "+ingredient);
		return ingredient;
	}


	/**
	 * @param ingredient the ingredient to set
	 */
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}


	/**
	 * @return the breadType
	 */
	public String getBreadType() {
		System.out.println("Bread Type >>> "+breadType);
		return breadType;
	}


	/**
	 * @param breadType the breadType to set
	 */
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		System.out.println("Price >>> "+price);
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
