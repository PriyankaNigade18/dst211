package day1;

public class PassParameterDemo2 
{
	int x=100;
	public void callbyvalue(int a,String s)//local a=100 s=Jay
	{
		System.out.println("Call by value: "+a+" "+s);
		
	}
	public void callbyref(PassParameterDemo2 a)//a is ref variable a=p1
	{
		a.x=x+10;
		System.out.println(a.x);
		a.callbyvalue(200,"Pooja");
		
	}

	public static void main(String[] args)
	{
		PassParameterDemo2 p1=new PassParameterDemo2 ();
		p1.callbyvalue(100,"Jay");
		
		p1.callbyref(p1);//passing object of class as reference
		

	}

}
