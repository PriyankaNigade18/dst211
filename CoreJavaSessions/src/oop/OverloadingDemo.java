package oop;

public class OverloadingDemo
{
	public void add()
	{
		int a=100,b=100;//local variable
		System.out.println("Addition of first method is: "+(a+b));
	}
	//Rule 1: Number of arguments to method
	public void add(int a,int b)//local variable a=100 b=500
	{
		System.out.println("Addition of second method is: "+(a+b));
	}
	//Rule2 : Different type of argument
	public void add(double a,int b)//local variable a=100 b=500
	{
		System.out.println("Addition of third method is: "+(a+b));
	}
	//Rule 3: change order of argument
	public void add(int a,double b)//local variable a=100 b=500
	{
		System.out.println("Addition of third method is: "+(a+b));
	}
	OverloadingDemo()
	{
		System.out.println("This is default constructor");
	}
	OverloadingDemo(int a)
	{
		System.out.println("This is default constructor");
	}
	OverloadingDemo(int a,int b)
	{
		System.out.println("This is default constructor");
	}
	OverloadingDemo(String a,int b)
	{
		System.out.println("This is Parameterize constructor"+ " "+a+" "+b);
	}

	
	public static void main(String[] args)
	{

		OverloadingDemo o1=new OverloadingDemo();//default
		o1.add();
		o1.add(100,500);
		o1.add(200.100,100);
		o1.add(200,200.34);
	
		OverloadingDemo o2=new OverloadingDemo("Priyanka",1010);
		OverloadingDemo o3=new OverloadingDemo(1010);
	}

}
