package com.capgemini.application;

import com.capgemini.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int Accno, String accNm, float accBal, boolean isSalaried) {
		super(Accno, accNm, accBal, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc []");
	}

	
}