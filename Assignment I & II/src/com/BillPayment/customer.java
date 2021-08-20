package com.BillPayment;

public class customer {
	
	private String name;
	private int customerId;
	private int unit;
	protected String billtype;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public String getBilltype() {
		return billtype;
	}
	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}
	@Override
	public String toString() {
		return "customer [name=" + name + ", customerId=" + customerId + ", unit=" + unit + ", billtype=" + billtype
				+ "]";
	}

	
	
	
	

}
