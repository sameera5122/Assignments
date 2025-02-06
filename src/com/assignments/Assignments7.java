package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignments7 {

	public static void main(String[] args) {
		// declare a list for the input variables. Also declare the amount variables.
		List<Integer> transactionAmount = new ArrayList<Integer>(); 
		transactionAmount.add(50000);
		transactionAmount.add(-2000);
		transactionAmount.add(3000);
		transactionAmount.add(-15000);
		transactionAmount.add(-200);
		transactionAmount.add(-300);
		transactionAmount.add(4000);
		transactionAmount.add(-3000);
		int creditAmount = 0;
		int debitAmount = 0;
		int remainingAmount = 0;
		int suspeciousTransactions = 0;
		System.out.println("1. Total number of credit & debit transactions is: " + transactionAmount.size());
		// 
		for (int i = 0; i<transactionAmount.size(); i++) {
			if (transactionAmount.get(i) > 0) {
				 creditAmount += transactionAmount.get(i);
			}else {
				debitAmount += transactionAmount.get(i);
			}
			
			if (transactionAmount.get(i) > 10000 || transactionAmount.get(i) < -10000) {
				suspeciousTransactions++;
				System.out.println("4. Suspecious credit/debit transactions with amount: " + transactionAmount.get(i));
				
			}
		} System.out.println("4.1 Suspecious credit/debit transactions count is: " + suspeciousTransactions);
		 System.out.println("2. Total credit amount is: " + creditAmount + " and Total debit amount is: " + debitAmount);
		 
			remainingAmount = creditAmount + debitAmount;
			System.out.println("3. Total remaning amount in the bank account is: " + remainingAmount);	
		
		}
		 
	

}
