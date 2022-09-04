package com.capgemini.client;

import com.capgemini.application.MMBankFactory;
import com.capgemini.application.MMCurrentAcc;
import com.capgemini.application.MMSavingAcc;
import com.capgemini.framework.BankFactory;
import com.capgemini.framework.CurrentAcc;
import com.capgemini.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(234567891,"Komal Gaikwad",4000, true);
		CurrentAcc c=new MMCurrentAcc(234567892,"Trisha Kyarkatti",5000, 1000);
		System.out.println("Saving Account: ");
		s.withraw(500);
		
		System.out.println("Current Account: ");
		c.withdraw(400);
		
		
		System.out.println(s);
		System.out.println(c);

	}

}