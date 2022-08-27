package com.capgemini.enums;

public enum Size implements PizzaSizeExample
{
	Small,Medium,Large,ExtraLarge;

	@Override
	public void size() {
		System.out.println("Size is:"+" "+this);
		
	}
	

}
