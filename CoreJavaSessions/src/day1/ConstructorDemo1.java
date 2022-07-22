package day1;

public class ConstructorDemo1 
{
	//instance
	int id=100;
	String name="Sagar";
	
	ConstructorDemo1()
	{
		System.out.println(id);
		System.out.println(name);
	}
	//this keyword will refer current class obj/var
	ConstructorDemo1(int id,String n)//local
	{
		this.id=id;
		this.name=n;
		System.out.println(this.id);
		System.out.println(this.name);
		
	}

	public static void main(String[] args)
	{
		ConstructorDemo1 obj1=new ConstructorDemo1();//default
		ConstructorDemo1 obj2=new ConstructorDemo1(200,"Pooja");//parameterize 
		

	}

}
