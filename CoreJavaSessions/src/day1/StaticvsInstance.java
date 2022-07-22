package day1;

public class StaticvsInstance 
{
	//int count=1;//instance
	static int count=1;//static
	StaticvsInstance()
	{
		System.out.println(count);
		count++;//count=count+1
	}
	public static void main(String[] args)
	{
		StaticvsInstance s1=new StaticvsInstance();
		StaticvsInstance s2=new StaticvsInstance();
		StaticvsInstance s3=new StaticvsInstance();
		StaticvsInstance s4=new StaticvsInstance();
		StaticvsInstance s5=new StaticvsInstance();


	}

}
