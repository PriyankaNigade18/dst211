package oop;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling....");
	}
}
class B extends A//A is Parent & B is child(Single level Inheritance)
{
	public void m2()
	{
		System.out.println("M2 is Calling....");
	}
}
class C extends B//B is Parent and C is child(Multilevel)
{
	public void m3() 
	{
		System.out.println("M3 is calling");

	}
}
class D extends A//A is Parent and D is child
{
	public void m4()
	{
		
	}
}



public class InheritanceDemo {

	public static void main(String[] args)
	{

		//Scenario1: Child class ref and child class object
		//Parent + Child
		
//		B b1=new B();
//		b1.m1();
//		b1.m2();
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
		
		//Scenario2: Parent class ref and Parent class Object
		//Parent Methods
//		A a1=new A();
//		a1.m1();
		
		B b1=new B();
		b1.m1();
		b1.m2();
		
		//Scenario3: Parent class ref and child class object
//		A a2=new B();
//		a2.m1();
		
		B b2=new C();
		b2.m1();
		b2.m2();
		
		//Scenario 4: Child class ref and Parent class Object
		//Invalid
		//B b2=new A();
		
		
		
		
		
		
	

	}

}
