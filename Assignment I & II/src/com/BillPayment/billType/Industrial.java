package com.BillPayment.billType;

import com.BillPayment.customer;

public class Industrial implements CalculateBill {

	@Override
	public void showBill(customer cust) {
		float rate=7.5f;		
		double bill=rate*cust.getUnit();
		System.out.println("Name ="+cust.getName());
		System.out.println("Custmer Id ="+ cust.getCustomerId());
		System.out.println("Customer Bill Type = "+ cust.getBilltype());
		System.out.println("Industrial Bill = Rs."+ bill );
		
	}

}
