package oop;

public class StudentDetails extends AbstractclassDemo
{
	public void display()
	{
		System.out.println("This display All data");
	}
	
//	public void show()
//	{
//		System.out.println("This is Abstract method");
//	}

	public static void main(String[] args)
	{

		//Scenario1: child class ref and child class object
		StudentDetails s1=new StudentDetails();
		s1.accept();
		s1.display();
		s1.show();
		s1.print();
		
		//scenario 2: Parent class ref and child class object
		AbstractclassDemo a1=new StudentDetails();
		a1.accept();
		a1.show();
		a1.print();
		
		//Scenario 3: Parent class ref and Parent class object
		
		//AbstractclassDemo a2=new AbstractclassDemo();
		
		
		//Scenario 4: Child class ref and parent object
		//invalid
		
		

	}

	@Override
	public void show() {
	System.out.println("This is Abstract method");
	
	}

	@Override
	public void print() {
		System.out.println("This is abstract print ");
		
	}

}
