package com.capgemini.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom1
{   
	//abstract method
	//multiple value annotation -contain more than one method
    String name() default "Komal";
    int roll_no() default 5;
    float percentage() default 4.5f;
}
class C
{
	@Custom1 (name="Trisha", roll_no = 8, percentage = 78.7f)
	public void display()
	{
		System.out.println("Holiday");
	}
}
public class CustomAnnotations {

	public static void main(String[] args) throws Exception {
		C c = new C();
		c.display();
		
		Method m=c.getClass().getMethod("display");
        Custom1 obj =m.getAnnotation(Custom1.class);
        
        System.out.println(obj.name());
        System.out.println(obj.roll_no());
        System.out.println(obj.percentage());
		

	}

}
