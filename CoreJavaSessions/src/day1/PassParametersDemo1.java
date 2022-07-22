package day1;

public class PassParametersDemo1
{
	
	public void add()//instance
	{
		int a=100,b=200;//local
		//int c=a+b;
		System.out.println("Addition is: "+(a+b));
	}

	public void sub(int a,int b)//a,b local var. a=200 b=100
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	//return keyword
	//if you want to return output from function then use return keyword
	
	public int mul(int a,int b)//local a=10 b=10
	{
		return a*b;//return output to calling function
	}
	
	public static void main(String[] args)
	{
		PassParametersDemo1 p1=new PassParametersDemo1();
		p1.add();//calling method without parameter
		
		//compile time parameter passing
		
		//How to call method with parameter without return keyword
		p1.sub(200,100);
		
		//call method with return keyword
		//int res=p1.mul(10,10);
		System.out.println("Multiplication is: "+p1.mul(100,10));

	}

}
