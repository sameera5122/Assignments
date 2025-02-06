package com.assignments;

public class Assignments6 {

	public static void main(String[] args) {
		
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		{
			// if condition to check if the the credit score is more than 750. If so, the loan is auto approved.
		if (creditScore > 750) {
			System.out.println("Loan is automatically Approved");
		}
		   // else check if the credit score is between 650 and 750, if so then check for other criteria.
		else if (creditScore > 650 && creditScore < 750) {
		   // if credit score is between 650 and 750, check if income, emp status, DTI ratio to get the loan approved.
			if (income >= 50000 && isEmployed && debtToIncomeRatio < 40 ) {
				System.out.println("Loan is approved for the user " + customerName);
				// if the employee details do not meet the expectations for income, emp status, DTI ratio then the loan gets rejected.	
			}else {
				System.out.println("Loan is rejected due to other other criteria");
			      }
			//if the credit score is not between 650 and 750, then reject the loan.
		} else {
			System.out.println("Loan is rejected due to Credit score");
		}
		
		
		}
	}

}
