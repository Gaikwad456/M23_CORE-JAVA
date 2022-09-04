package com.capgemini.application;

import com.capgemini.framework.BankFactory;
import com.capgemini.framework.CurrentAcc;
import com.capgemini.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int Accno, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc( Accno,accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getCurrentAcc(int Accno, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc( Accno,accNm, accBal, creditLimit);
		return c;
	}

}