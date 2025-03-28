package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Assignments5 {

	private static final String Set = null;

	public static void main(String[] args) {
		
		
		// 1. Create a list of the top 5 most populated countries in the world and print 2nd Country.
		{
			List<String> populatedCountriesList = new ArrayList<String>();
			populatedCountriesList.add("India");
			populatedCountriesList.add("China");
			populatedCountriesList.add("United States");
			populatedCountriesList.add("Indonesia");
			populatedCountriesList.add("Pakistan");
			
			System.out.println("2nd populated countries in the world is: " + populatedCountriesList.get(1));
		}
		// 2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		{
			Set<String> touristAttractions = new HashSet<String>(); 
			touristAttractions.add("Paris, France");
			touristAttractions.add("Bangkok, Thailand");
			touristAttractions.add("London, England");
			touristAttractions.add("Dubai, United Arab Emirates");
			touristAttractions.add("Singapore");
			touristAttractions.add("Kuala Lumpur, Malaysia");
			touristAttractions.add("New York City, USA");
			touristAttractions.add("Istanbul, Turkey");
			touristAttractions.add("Tokyo, Japan");
			touristAttractions.add("Antalya, Turkey");
			
			System.out.println("Size of top 10 most visited tourist attractions in the world is: " + touristAttractions.size() );
		}
		// 3. Create a map of the 5 largest cities in the United States and their populations.
		{
			Map<String,String> citiesAndPopulation = new HashMap<String,String>(); 
			citiesAndPopulation.put("New York City", "8,804,190");
			citiesAndPopulation.put("Los Angeles", "3,898,747");
			citiesAndPopulation.put("Chicago", "2,746,388");
			citiesAndPopulation.put("Houston", "2,304,580");
			citiesAndPopulation.put("Phoenix", "1,608,139");
			
			System.out.println("5 largest cities in the United States and their populations are: " + citiesAndPopulation);
		}
		//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		{
			int [] randomNum = new int [10];
			randomNum[0] = 5;
			randomNum[1] = 10;
			randomNum[2] = 15;
			randomNum[3] = 20;
			randomNum[4] = 25;
			randomNum[5] = 30;
			randomNum[6] = 35;
			randomNum[7] = 40;
			randomNum[8] = 45;
			randomNum[9] = 50;
			
			int sum = randomNum[2] + randomNum[4];
			
			System.out.println("Sum of 3rd and 5th value is: "+ sum);					
		
		}
		// 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		{
			List<String> highGrossingMovies = new LinkedList<String>();
			highGrossingMovies.add("Avatar");
			highGrossingMovies.add("Avengers: Endgame");
			highGrossingMovies.add("Avatar: The Way of Water");
			highGrossingMovies.add("Titanic");
			highGrossingMovies.add("Star Wars: Episode VII - The Force Awakens");
			
			System.out.println("3rd highest-grossing movies of all time is: " + highGrossingMovies.get(2));
		}

	}

}
