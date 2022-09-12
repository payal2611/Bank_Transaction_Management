package com.yash.bankmanagement.client;

import java.util.Scanner;

import com.yash.bankmanagement.service.Rbi;
import com.yash.bankmanagement.serviceImpl.Sbi;

public class Test {
	
	
	public static void main(String args[]) {

		Rbi bank =new Sbi();
		Scanner s1 = new Scanner(System.in);
		System.out.println("***Welcome To Braindata BankManagementSystem:***");
		while (true) {
			System.out.println("Select Option You want:");
			System.out.println("1.Create Account\n" + "2.Display Account Details\n" + "3.Deposite Money\n"
					+ "4.Withdraw Money\n" + "5.Check Account Balance\n" + "6.UpdateInformation\n" + "7.Exit");
			System.out.println("********************************");
			int option = s1.nextInt();
			switch (option) {
			case 1:
				System.out.println("***********************");
				bank.createAccount();
				System.out.println("*************************************");
				break;

			case 2:
				System.out.println("***********************");
				bank.displayAllDetails();
				System.out.println("**************************************");
				break;
			case 3:
				System.out.println("***********************");
				bank.depositeMoney();
				System.out.println("**************************************");
				break;
			case 4:
				System.out.println("***********************");
				bank.withdrawal();
				System.out.println("**************************************");
				break;
			case 5:
				System.out.println("***********************");
				bank.balanceCheck();
				System.out.println("****************************************");
				break;
			case 6:
				System.out.println("***********************");
				bank.updateInfo();
				System.out.println("****************************************");
				break;

			case 7:
				System.exit(0);
			default:
				System.out.println("enter valid input");
				break;
			}
		}
	}

}
