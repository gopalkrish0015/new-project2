package org.bank;

public class AxisBank extends BankInfo  {
@Override
public void deposit() {
	// TODO Auto-generated method stub
System.out.println("deposit value is 10%");

}
public static void main(String[] args) {
	AxisBank d = new AxisBank ();
	d.deposit();
	d.fixed();
	d.saving();
	
}
}


