package oop;

public class ChildSuper extends ParentSuper
{
	int id=200;
	
	public void display()
	{
		super.show();//to access immediate parent method
		System.out.println(super.id);//immediate parent variable
		System.out.println("Child id is: "+id);//200
	}
	
	ChildSuper()
	{
		super();//immediate constructor of parent class
	}

	public static void main(String[] args)
	{
		ChildSuper c1=new ChildSuper();
		c1.display();

	}

}
