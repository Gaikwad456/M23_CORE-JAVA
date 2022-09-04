package com.capgemini.framework;

public abstract class CurrentAcc extends BankAcc {
	private static float creditLimit;

	//constructor
	@SuppressWarnings("static-access")
	public CurrentAcc(int Accno, String accNm, float accBal,float creditLimit) {
		super(Accno, accNm, accBal);
		this.creditLimit=creditLimit;
		
	}


	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	public void withdraw(float Withdraw)	
	
	{
	   System.out.println("Account no:"+" "+this.getAccno()+" Account name: "+this.getAccname()+" "+" Balance is: "+(Accbal-Withdraw));
    }

}