package oop;

public class Child extends Parent
{
	//child class always override parent class method.
	public void color()
	{
		String s1="Yellow";
		System.out.println("Child color"+s1);
	}
	public void childIncome()
	{
		System.out.println("Child income:$90000");
	}
	public static void main(String[] args)
	{
		//Scenario 1: child class ref and child class object
		Child c1=new Child();
		c1.parentIncome();
		c1.childIncome();
		c1.color();//Yellow
		
		//Scenario 2:Parent ref and Parent Object
		Parent p1=new Parent();
		p1.parentIncome();
		p1.color();//Red
	
		//Scenario 3: Parent ref & child object
		Parent p2=new Child();
		p2.parentIncome();
		p2.color();//Yellow
		
		
		
		
		
		
		



	}

}
