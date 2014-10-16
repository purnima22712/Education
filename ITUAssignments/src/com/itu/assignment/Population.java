/**
 * 
 */
package com.itu.assignment;

/**
 * @author Sindhu
 *
 */
public class Population {
	
	double mexicoPopulation = 114;
	double usPopulation = 312;
	double mexicoPercentageIncrease = 1.01;
	double usPercentageDecrease = 0.15;
	int mexicoYears = 0;
	int usYears = 0;
			

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Population population = new Population();
		
		while(population.mexicoPopulation < population.usPopulation){
			double mexicoPopulationByYear = population.calculateMexicoPopulationPerYear();
			System.out.println("mexicoPopulationByYear >>> "+mexicoPopulationByYear);
			
			double usPopulationByYear = population.calculateUSPopulationPerYear();
			System.out.println("usPopulationByYear >>> "+usPopulationByYear);
		}
		
		System.out.println("Number of years it took for Mexico to exceed US population is >>> "+population.mexicoYears);
		
	}
	
	private double calculateMexicoPopulationPerYear(){
		mexicoPopulation = mexicoPopulation + (mexicoPercentageIncrease/100) * mexicoPopulation;
		mexicoYears = mexicoYears+1;
		System.out.println("mexicoYears >> "+mexicoYears);
		return  mexicoPopulation;
	}
	
	private double calculateUSPopulationPerYear(){
		usPopulation = usPopulation - (usPercentageDecrease/100) * usPopulation;
		usYears = usYears+1;
		System.out.println("usYears >> "+usYears);
		return  usPopulation;
	}

}
