package oop;

interface Demo
{
	int x=100;//final
	
	public void accept();
	public void display();
	
	
	
}




public class InterfaceDemo implements Demo//Demo is parent and InterfaceDemo is child
{
	public void show()
	{
		System.out.println("This is all data");
	}

	public static void main(String[] args)
	{
		InterfaceDemo i1=new InterfaceDemo();
		i1.accept();
		i1.display();
		i1.show();



	

	}

	@Override
	public void accept() {

		System.out.println("This is Accept ");
		
	}

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

}
