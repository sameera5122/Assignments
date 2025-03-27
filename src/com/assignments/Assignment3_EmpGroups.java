package com.assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		Assignment3_Employees obj = new Assignment3_Employees();
		
		String [] empNames = { obj.employeeName1, obj.employeeName2, obj.employeeName3 };
		int [] empId = {obj.employeeId1, obj.employeeId2, obj.employeeId3};
		
		System.out.println("Employee Name is: "+ empNames[0] + ", " + "Employee ID is: " + empId[0]);
		System.out.println("Employee Name is: "+ empNames[1] + ", " + "Employee ID is: " + empId[1]);
		System.out.println("Employee Name is: "+ empNames[2] + ", " + "Employee ID is: " + empId[2]);
	}
}
