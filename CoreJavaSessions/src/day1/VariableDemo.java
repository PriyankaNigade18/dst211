package day1;

public class VariableDemo 
{	//class variable
	String name="Sumit";//instance
	static String cname="AISSPMS";//static
		
	public void show() 
	{ 
		int id=10;//local
		System.out.println(id);
	//System.out.println(marks);
		System.out.println(name);
		System.out.println(cname);
	}
	
	public static void main(String[] args) 
	{
		int marks=90;//local
		//System.out.println(id);
		System.out.println(marks);
		VariableDemo  v1=new VariableDemo ();
		System.out.println(v1.name);
		v1.show();
		System.out.println(cname);


	}

}
