package com.BillPayment.billType;

import com.BillPayment.BillPaymentFactory;

public class Plan {
 
 public CalculateBill CalBill(String str) {
	 if(str.equalsIgnoreCase("Commercial"))
		 return new Commercial();
	 else if(str.equalsIgnoreCase("domestic"))
		 return new Domestic();
	 else if(str.equalsIgnoreCase("industrial"))
		 return new Industrial();
	 else
		 return null;
 }
}
