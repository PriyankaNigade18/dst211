package cotrolflow;

public class Person 
{
	public Person read()
	{
		System.out.println("Read method from person class");
		return this;
	}
	public Person write()
	{
		System.out.println("Write method from person class");
		return this;
	}
	public void talk()
	{
		System.out.println("talk method from person class");
	}

	public static void main(String[] args)
	{
		Person p1=new Person();
//		p1.read();
//		p1.talk();
//		p1.write();
		
		//Method chaining
		p1.read().write().talk();

	}

}
