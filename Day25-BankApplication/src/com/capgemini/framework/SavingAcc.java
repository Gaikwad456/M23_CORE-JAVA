package com.capgemini.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
   @SuppressWarnings("unused")
private static final float MINBAL=200;
   

	
public SavingAcc(int Accno, String accNm, float accBal, boolean isSalaried) {
	super(Accno, accNm, accBal);
	this.isSalaried = isSalaried;
}

public void withraw(float Withdraw)

{
System.out.println("Account no:"+" "+this.getAccno()+" Account name: "+this.getAccname()+" "+" Balance is:"+(Accbal-Withdraw));
}
@Override
public String toString() {
	return String.format("SavingAcc [isSalaried=%s]", isSalaried);
}
	
	
}