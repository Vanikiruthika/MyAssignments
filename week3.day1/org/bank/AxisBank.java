package org.bank;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Axis bank deposit details overridden in Axisbank class");
	}
	
	public static void main(String[] args) {
	
	System.out.println("************Bankinfo details*************");
	BankInfo bankObj=new BankInfo();
	bankObj.saving();
	bankObj.fixed();
	bankObj.deposit();
	System.out.println("**************Axis Bank details***************");
	AxisBank axisObj=new AxisBank();
	axisObj.deposit();
	axisObj.saving();
	axisObj.fixed();
		
}
}
