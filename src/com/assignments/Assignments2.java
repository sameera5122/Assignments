package com.assignments;

public class Assignments2 {

	public static void main(String[] args) {
		// 3 Dimensional Array
		
		// Semesters with marks and subject names
		
		String[][][] semisterDetails = {
		
				{//Semister1
				 {"Mathematics I","78"},{"Physics","85"},{"Chemistry","91"},{"Computer Programming","74"},{"Engineering Drawing","88"},
				 {"Basic Electrical Eng.","79"}
			    },
				
				{//Semister2
			     {"Mathematics II","82"},{"Mechanics","77"},{"Environmental Science","93"},{"Basic Electronics","69"},{"Engineering Physics","84"},
			     {"Engineering Graphics","90"}	
				},
				
				{//Semister3
				 {"Data Structures","88"},{"Discrete Mathematics","81"},{"Digital Electronics","76"},{"Operating Systems","92"},
				 {"Signals and Systems","85"},{"Object-Oriented Prog.","78"}	
			    },
				{//Semister4
					 {"Algorithms","91"},{"Computer Networks","73"},{"Database Systems","89"},{"Microprocessors","80"},
					 {"Communication Eng.","76"},{"Software Engineering","87"}	
				},
				{//Semister5
					 {"Probability and Stats","86"},{"Machine Learning","88"},{"Compiler Design","84"},{"Theory of Computation","95"},
					 {"Embedded Systems","73"},{"Computer Graphics","90"}	
				}
		};
				
				System.out.println("Semester 3, Subject 4 Name is: " + semisterDetails[2][3][0]);
				System.out.println("Semester 3, Subject 5 Name is: " + semisterDetails[2][4][0]);
				System.out.println("Semester 5, Subject 3 Marks are: " + semisterDetails[4][2][1]);
				System.out.println("Semester 5, Subject 6 Marks are: " + semisterDetails[4][5][1]);

	}

}
