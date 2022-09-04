package com.capgemini.framework;

public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingAcc(int Accno, String accNm, float accBal,boolean isSalaried);
	
	public abstract CurrentAcc getCurrentAcc(int Accno, String accNm, float accBal,float creditLimit);
		
}