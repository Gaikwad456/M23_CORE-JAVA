package com.capgemini.Array;
class Student
{
	public int Roll_no;
	public String name;
	//constructor
	Student(int Roll_no, String name)
	{
		this.Roll_no = Roll_no;
		this.name = name;
	}
}
public class StudentArray {

	public static void main(String[] args) {
		//Non primitive array memo allocation
        Student[] arr = new Student[5];
         arr[0] = new Student(101 , "Komal");
         arr[1] = new Student(102 , "Suvarna");
         arr[2] = new Student(103 , "Princy");
         arr[3] = new Student(104 , "Lavanya");
         arr[4] = new Student(105 , "Trisha"); 
         
         for(int i =0; i<arr.length; i++)
         {
           System.out.println("Elements in " +i +" "+ "index:"+" " + arr[i].Roll_no+ " "+ arr[i].name);
         }
	}
         
         

}
