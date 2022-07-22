package oop;

public class AxisBank implements RBIBank1,Bank2
{
	//Multiple inheritance

	public static void main(String[] args)
	{
//		RBIBank1 r1=new AxisBank();
//		r1.deposite();
//		r1.withdrow();
//		System.out.println(r1.rateofintrest(7));
		
		
		AxisBank a1=new AxisBank();
		a1.loan();
		a1.deposite();
		a1.withdrow();
		int a=a1.rateofintrest(7);
		System.out.println(a);
	}

	@Override
	public void withdrow() {
		System.out.println("Calling from axis");
		
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Calling from axis");
	}

	@Override
	public int rateofintrest(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public void loan() {
		System.out.println("This is Loan feature");
		
	}

}
