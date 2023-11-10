package org.bank;

public class AxisBank extends BankInfo{
	public void saving() {
		System.out.println("Saving-20%");
		
	

}
public static void main(String[]args) {
	AxisBank a=new AxisBank();
	a.saving();
	a.deposit();
	a.fixed();
}
}

