package oop;

public class Studentdata
{
	private int id=101;
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

	private String name="Priya";
	
	public void show()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args)
	{

		Studentdata s1=new Studentdata();
		s1.id=102;

	}

}
