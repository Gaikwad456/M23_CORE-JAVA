package com.capgemini.lambdaexpression;
interface C
{   
	/*lambda expression is only work for functional
	implementation not for other*/
	void display();
	//void accept();
}
public class InterfaceImpl {

	public static void main(String[] args) {
		//The target type of this expression must be functional interface
		C obj =()->
		{
			System.out.println("Functinal Intarface Implementation"+ " " + "Lambda Expression");
				
		};
		obj.display();
	}

}
