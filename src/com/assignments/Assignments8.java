package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignments8 {

	public static void main(String[] args) {
		String [] employeeName = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		Map<String,Double> employeeSalary = new HashMap <String,Double>();
		employeeSalary.put("Alice Johnson", 75000.0);
		employeeSalary.put("Bob Smith", 68000.0);
		employeeSalary.put("Carol Davis", 82000.0);
		employeeSalary.put("David Brown", 90000.0);
		employeeSalary.put("Eva Green", 60000.0);
		
		Map<String,Double> employeeExperience = new HashMap <String,Double>();
		employeeExperience.put("Alice Johnson", 5.0);
		employeeExperience.put("Bob Smith", 3.0);
		employeeExperience.put("Carol Davis", 7.0);
		employeeExperience.put("David Brown", 10.0);
		employeeExperience.put("Eva Green", 2.0);
		
		Map<String,Double> employeeRating = new HashMap <String,Double>();
		employeeRating.put("Alice Johnson", 4.2);
		employeeRating.put("Bob Smith", 3.8);
		employeeRating.put("Carol Davis", 4.5);
		employeeRating.put("David Brown", 2.0);
		employeeRating.put("Eva Green", 3.5);
		
		List<Map<String,Double>> employeeDetails = new ArrayList <Map<String,Double>>();
		employeeDetails.add(employeeSalary);
		employeeDetails.add(employeeExperience);
		employeeDetails.add(employeeRating);
		
		//System.out.println(employeeDetails.get(2).get("Bob Smith"));
		int variablePay = 0;
		int bonus = 0;
		int bonusPerks = 0;
		Double hike = 0.0;
		Double hikePercentage = 0.0;
		for (String empname : employeeName) {
			if (employeeRating.get(empname) >= 4.0) {
				variablePay+=15;
				bonus+=1500;
				if (employeeExperience.get(empname) > 5.0){
					bonusPerks+=5000;
				}
			}else if (employeeRating.get(empname) > 3.0 && employeeRating.get(empname) < 4.0) {
					variablePay+=10;
					bonus+=1200;
					if (employeeExperience.get(empname) > 5.0){
						bonusPerks+=5000;
				}
			} else if (employeeRating.get(empname) < 3.0) {
				variablePay+=3;
				bonus+=300;
				if (employeeExperience.get(empname) > 5.0){
					bonusPerks+=5000;
			}
		}
			//System.out.println(employeeExperience.get(empName));
			//System.out.println(employeeSalary.get(empName));
			//System.out.println(employeeRating.get(empName));
			
			
			
			hike = (employeeSalary.get(empname)*variablePay) + bonus + bonusPerks;
			hikePercentage = hike/employeeSalary.get(empname);
			
			Map<String, Double> employeeHike = new HashMap<String, Double>(); 
			employeeHike.put(empname, hikePercentage);
			
			 variablePay = 0;
			 bonus = 0;
			 bonusPerks = 0;
			System.out.println("Hike percentage of each employee is: " + employeeHike);

		}
		
		
	}

}
