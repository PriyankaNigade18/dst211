package day1;

public class StudentData 
{
	//data
	 int id=2021;
	 String name="Akash";
	
	//Method
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	public static void main(String[] args)
	{
		//to create object
		StudentData s1=new StudentData();
		s1.show();
		s1.id=2022;
		System.out.println(s1.id);
		

	}

}
