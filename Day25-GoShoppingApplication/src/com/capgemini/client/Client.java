package com.capgemini.client;


import com.capgemini.application.GSPrimeAcc;
import com.capgemini.application.GSShopFactory;
import com.capgemini.framework.NormalAcc;
import com.capgemini.framework.PrimeAcc;
import com.capgemini.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"Komal Gaikwad",500, true);
		NormalAcc n=new com.capgemini.application.GSNormalAcc(1002,"Trisha Kyarkatti",500, 50);
		System.out.println("Prime Account: ");
		p.bookProduct(500);
		
		System.out.println("Normal Account: ");
		n.bookProduct(500);
		
		
		System.out.println(p);
		System.out.println(n);



		

	}

}