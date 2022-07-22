package oop;

class Student
{
	private int id=101;
	private String name="Pooja";
	
		
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void show()
	{
		System.out.println(id+" "+name);
	}
	
}





public class EncapsulationDemo {

	public static void main(String[] args)
	{
		
		Studentdata s1=new Studentdata();
		s1.show();//old data
		
		s1.setId(110);
		s1.setName("Ankit");
		
		s1.show();//updated data
		
		
		
		
//		Student s1=new Student();
//		s1.show();
//		s1.setId(103);
//		s1.setName("Vidya");
//		//System.out.println(s1.getId());
////		s1.id=102;
////		s1.name="Jay";
//		s1.show();

	}

}
