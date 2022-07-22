package oop;

public class HDFC implements RBIBank1
{
	public void custdetails()
	{
		System.out.println("This is Customer information");
	}

	public static void main(String[] args) 
	{
		RBIBank1 r1=new HDFC();
		r1.deposite();
		r1.withdrow();
		System.out.println(r1.rateofintrest(8));
		
		HDFC h1=new HDFC();
		h1.custdetails();
		h1.deposite();
		h1.withdrow();
		h1.rateofintrest(9);


	}

	@Override
	public void withdrow() {
		System.out.println("Customer can withdrow ammount");
		
	}

	@Override
	public void deposite() {
		
		System.out.println("Customer can deposite ammount");
	}

	@Override
	public int rateofintrest(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}

}
