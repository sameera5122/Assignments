package com.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignments4 {

	public static void main(String[] args) {
		
		Map<String, String> row1 = new LinkedHashMap<>();
		row1.put("Employee ID", "E001");
		row1.put("Name", "Alice Green");
		row1.put("Age", "30");
		row1.put("Gender", "Female");
		row1.put("Department", "Engineering");
		row1.put("Position", "Software Engineer");
		row1.put("Salary", "75,000");
		row1.put("Email ID", "alice@example.com");
		row1.put("Contact Number", "9876543213");
		
		Map<String, String> row2 = new LinkedHashMap<>();
		row2.put("Employee ID", "E002");
		row2.put("Name", "Bob Johnson");
		row2.put("Age", "35");
		row2.put("Gender", "Male");
		row2.put("Department", "Marketing");
		row2.put("Position", "Marketing Manager");
		row2.put("Salary", "85,000");
		row2.put("Email ID", "bob@example.com");
		row2.put("Contact Number", "9876543214");
		
		Map<String, String> row3 = new LinkedHashMap<>();
		row3.put("Employee ID", "E003");
		row3.put("Name", "Carol White");
		row3.put("Age", "28");
		row3.put("Gender", "Female");
		row3.put("Department", "Sales");
		row3.put("Position", "Sales Executive");
		row3.put("Salary", "65,000");
		row3.put("Email ID", "carol@example.com");
		row3.put("Contact Number", "9876543215");
		
		List<Map<String, String>> employeeDetails = new ArrayList<Map<String, String>>();
		employeeDetails.add(row1);
		employeeDetails.add(row2);
		employeeDetails.add(row3);
		System.out.print("Email ID of Bob is: ");
		System.out.println(employeeDetails.get(1).get("Email ID"));
		
		
	}

}
