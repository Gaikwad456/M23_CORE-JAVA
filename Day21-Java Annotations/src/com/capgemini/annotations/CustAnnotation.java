package com.capgemini.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//Custom Annotation
@interface MyAnnotation
{
	int accept();
}
class D
{
	@MyAnnotation(accept=22)
	public void display()
	{
		System.out.println("I am using custom annotation");
	}
}
public class CustAnnotation {

	public static void main(String[] args) throws Exception  {
		D d = new D();
		Method m=d.getClass().getMethod("display");
        MyAnnotation obj =m.getAnnotation(MyAnnotation.class);
        d.display();
        System.out.println(obj.accept());
        
	}

}
