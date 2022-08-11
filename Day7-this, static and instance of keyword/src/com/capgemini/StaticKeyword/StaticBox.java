package com.capgemini.StaticKeyword;

public class StaticBox {
	double width;
	double height;
	static int count;
	//Parameterized constructor
	public StaticBox(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
     public StaticBox()
     {
    	 super();
    	 int cnt =0;
    	 cnt++;
    	 System.out.println("Count is : " +cnt);
    	 count++;
    	 System.out.println("Count is : " +cnt);

    	 
     }
	public static void main(String[] args) {
		StaticBox s = new StaticBox();
		System.out.println(s.width);
		

	}

}
