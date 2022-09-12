package com.yash.bankmanagement.serviceImpl;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.yash.bankmanagement.model.Account;
import com.yash.bankmanagement.service.Rbi;

public class Sbi implements Rbi {
	
	Account a = new Account();
	Account a1 = new Account();
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	LocalDateTime date = LocalDateTime.now();
	int flag = 0;

	public void createAccount() {
		System.out.println("Date and Time:- \n" + date);
		System.out.println(".........................");
		System.out.println("Enter your Account Number:");
		int acc = sc.nextInt();
		a.setAccNo(acc);
		System.out.println("Enter your name:");
		String g = sc1.nextLine();
		a.setName(g);
		System.out.println("Enter Your mobile Number:");
		String mb = sc.next();
		a.setMobNo(mb);
		System.out.println("Enter your Aadhar No:");
		String ad = sc1.next();
		a.setAdharNo(ad);
		System.out.println(" Enter your Gender:");
		String gn = sc.next();
		a.setGender(gn);
		System.out.println("Enter Your Age:");
		int ag = sc1.nextInt();
		a.setAge(ag);
		System.out.println(" Please Enter Your First Bank Deposit:\n" + "Enter Minimum Amount Rs.500/- ");

		double d = sc.nextDouble();

		if (d >= 500) {
			a.setBalance(d);

			System.out.println("Thanks..! Your Account Get Created..!!");
			System.out.println("Your Current Balance is:" + d);
		} else {
			System.out.println("Please enter minimum amount Rs.500/-");
			double d1 = sc.nextDouble();

			if (d1 >= 500) {
				a.setBalance(d1);
				System.out.println("Thanks..! Your Account Get Created..!!");
				System.out.println("Your Current Balance is:" + d1);
			}

			else {
				System.out.println("Please Try again");

			}
		}
		flag++;

	}

	public void displayAllDetails() {
		if (flag >= 1) {
			System.out.println("Enter Your Account Number:");
			int a1 = sc.nextInt();

			if (a1 == a.getAccNo()) {
				System.out.println("Your Account Number:" + a.getAccNo());
				System.out.println("Name:" + a.getName());
				System.out.println("Mobile Number:" + a.getMobNo());
				System.out.println("Aadhar No:" + a.getAdharNo());
				System.out.println("Gender:" + a.getGender());
				System.out.println("Age:" + a.getAge());
				System.out.println(" Avail Balance is:" + a.getBalance());
			} else {
				System.out.println("Please Enter valid Account Number");
			}
		} else {
			System.out.println("Please Create Account ..You Dont have Account.  ");
		}
	}

	public void depositeMoney() {
		if (flag >= 1) {
			System.out.println("Enter Your Account Number To Deposite Money:");
			int acc1 = sc.nextInt();
			if (acc1 == a.getAccNo()) {
				System.out.println("Select the Account Type:\n" + "1.Saving\n" + "2.Current\n" + "3.Exit");
				int type = sc.nextInt();
				switch (type) {
				case 1, 2:
					double cb = a.getBalance();
					System.out.println("Enter amount to Deposit.. Amount should be Minimum Rs.1000/-:");
					double db = sc.nextDouble();
					if (db >= 1000) {
						System.out.println("Deposited Amount is:" + db);
						cb = cb + db;
						System.out.println("Current Account balance:" + cb);
						a.setBalance(cb);
					} else {
						System.out.println("please Deposite Amount more than Rs.1000/-");
						double db1 = sc.nextDouble();
						if (db1 >= 1000) {
							cb = cb + db1;
							System.out.println("Deposited Amount is:" + cb);
							a.setBalance(cb);
						} else {
							System.out.println("Please Try Again...");

						}
					}
					break;
				case 3:
					System.out.println("Exit SuccessFully..");

					break;

				default:
					System.out.println("Invalid Input..Please Try Again..");
					break;
				}
			}
		} else {
			System.out.println("Please Create Your Account First..");
		}

	}

	public void withdrawal() {
		if (flag >= 1) {
			System.out.println("Enter Your Account Number To Withdraw Money:");
			int acc1 = sc.nextInt();
			if (acc1 == a.getAccNo()) {
				System.out.println("Select the Account Type:\n" + "1.Saving\n" + "2.Current\n" + "3.Exit");
				int type = sc.nextInt();

				switch (type) {
				case 1, 2:
					System.out.println("Enter amount to Withdraw From Account:");
					double wd = sc.nextDouble();
					double cb = a.getBalance();
					cb = cb - wd;
					if (cb >= 1000) {
						System.out.println("Amount Wirhdraw By You:" + wd);
						a.setBalance(cb);
					} else {
						System.out.println("You have Insuficient Balance to Withdrawl");
					}
					break;
				case 3:
					System.out.println("Exit SuccessFully..");
					break;

				default:
					System.out.println("Invalid Input..Please Try Again..");
					break;
				}
			}
		} else {
			System.out.println("Please Create Your Account First..");
		}

	}

	public void balanceCheck()

	{
		if (flag >= 1) {
			System.out.println("Enter Your Account Number To Check Balance:");
			int acc1 = sc.nextInt();
			if (acc1 == a.getAccNo()) {
				double ab = a.getBalance();
				System.out.println("Your Available balance is:" + ab);
			}
		} else {
			System.out.println("Please Create Your Account First..");
		}
	}

	public void updateInfo() {
		if (flag >= 1) {
			a1 = a;

			System.out.println("Enter Your Account Number To UpdateInfo:");
			int acc1 = sc.nextInt();
			if (acc1 == a.getAccNo()) {
				System.out.println("Update Your Details:\n" + "1.MobileNo:\n" + "2.Name:\n" + "3.Age\n"
						+ "4.Aadhar No:\n" + "5.exit");

				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter your new mobile No. :\n");
					String m = sc.next();
					a1.setMobNo(m);
					System.out.println("Your Mobile Number Updated Successfully");
					break;

				case 2:
					System.out.println("Enter Your Updated Name:\n");
					String n = sc1.nextLine();
					a1.setName(n);
					System.out.println("Your Name upadated Successfully..");
					break;

				case 3:
					System.out.println("Enter Your Age:\n");
					int g = sc.nextInt();
					a1.setAge(g);
					System.out.println("Your Age upadated Successfully..");
					break;

				case 4:
					System.out.println("Enter your Aadhar No:\n");
					String ad = sc1.nextLine();
					a1.setAdharNo(ad);
					System.out.println("Your Aadhar NO. upadated Successfully..");
					break;

				case 5:
					System.out.println("You are Exit Successfully..");
					break;
				default:
					System.out.println("Invalid Input..Please Try Again..");
					break;

				}

			}
		} else {
			System.out.println("Please Create Your Account First..");
		}
	}
	

}
