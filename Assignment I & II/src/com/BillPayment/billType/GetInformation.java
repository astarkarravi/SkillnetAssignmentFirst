package com.BillPayment.billType;

import java.util.Scanner;

import com.BillPayment.customer;

public class GetInformation {
	public customer getData() {
		Scanner sc = new Scanner(System.in);
		customer cust = new customer();
		System.out.print("Enter Name");
		cust.setName(sc.nextLine());
		System.out.print("Customer Id");
		cust.setCustomerId(sc.nextInt());
		System.out.print("Enter Bill Type : \n eg. COMMERCIAL  OR  INDUSTRIAL  OR  DOMESTIC");
		cust.setBilltype(sc.next());
		System.out.print("Enter Unit :");
		cust.setUnit(sc.nextInt());
		
		return cust;
		
	}
}
