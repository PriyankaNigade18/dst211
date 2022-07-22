package oop;
//final class Data
 class Data
{
	 final int id=100;//read only
	int rno=10;
	public final void show()
	{
		System.out.println("This is Prent method");
	}
	
}

//Final variable we can't update
//final method can't be override
//final class can't be extends 
public class FinalKeywordDemo extends Data
{
//	public void show()
//	{
//		System.out.println("This is Prent method");
//	}

	public static void main(String[] args) 
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		//f1.id=200;
		f1.rno=20;
		System.out.println(f1.id);
		f1.show();
		

	}

}
