package com.capgemini.application;

import com.capgemini.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int Accno, String accNm, float accBal, float creditLimit) {
		super(Accno, accNm, accBal, creditLimit);
		
		}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc []");
	}

}