package com.capgemini.ThisKeyword;
class Main
{
	public int x, y;
	Main()
	{
		x = 12;
		y = 20;
	}
	Main get1()
	{
		return this;
	}
	public void display()
	{
		System.out.println("Addition of x and y is:" + (x+y));
	}
}
public class CuurentClassInstance {

	public static void main(String[] args) {
		Main m = new Main();
		m.get1().display();

	}

}
