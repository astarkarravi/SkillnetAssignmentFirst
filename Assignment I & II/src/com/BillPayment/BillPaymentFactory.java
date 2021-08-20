package com.BillPayment;

import com.BillPayment.billType.CalculateBill;
import com.BillPayment.billType.GetInformation;
import com.BillPayment.billType.Plan;

public class BillPaymentFactory extends GetInformation {
	public static void main(String[] args) {

		GetInformation getinfo = new GetInformation();

		customer cust = getinfo.getData();

		Plan plan = new Plan();

		CalculateBill obj = plan.CalBill(cust.getBilltype());

		obj.showBill(cust);

	}
}
