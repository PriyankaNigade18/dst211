package day1;

public class MethodDemo 
{
	public void show()
	{
		System.out.println("This is instance method");
	}
	public static void display()
	{
		System.out.println("This is static method");
	}

	public static void main(String[] args)
	{
		//calling method
		//to call static method by using class name
		MethodDemo.display(); 
		
		//To call instance need to create object
		
		MethodDemo m1=new MethodDemo ();
		m1.show();
		//m1.display();
		
		
		
		
		
		


	}

}
