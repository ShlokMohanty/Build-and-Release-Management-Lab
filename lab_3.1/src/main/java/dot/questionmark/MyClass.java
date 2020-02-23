package dot.questionmark;

import pkg1.*;

public class MyClass 
{
	
	public static void main(String[] args) 
	{		
		MyClass1 ob1 = new MyClass1();
		MyClass2 ob2 = new MyClass2();
			
		System.out.println("sum = " + ob1.sum(4, 3));
		System.out.println("sub = " + ob1.sub(4, 3));
		System.out.println("mul = " + ob2.mul(4, 3));
		System.out.println("div = " + ob2.div(7, 3));
	}

}
