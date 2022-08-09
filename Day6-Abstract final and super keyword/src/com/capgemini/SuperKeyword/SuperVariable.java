package com.capgemini.SuperKeyword;
class Color
{
	protected String name = "Purple";
    
}
class Red extends Color
{
	public String name = "Red";
	 void display()
	{
        System.out.println(name);
        //super keyword is used to refer the parent class variable
        System.out.println(super.name);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		Red r = new Red ();
		r.display();
        
	}

}
