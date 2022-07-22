package day1;

public class WrapperclassDemo {

	public static void main(String[] args)
	{
		//Object to primitive---parse()
			String s1="100";
			System.out.println(s1+100);//100100
			//wrapper class ParseInt() this will convert string data into int
			int num=Integer.parseInt(s1);//id data doesn't match -->Exception(NumberFormatException)
			System.out.println(num+100);//200
			
			String s2="78.67";
			System.out.println(s2+10.10);
			//String to double
			double num2=Double.parseDouble(s2);
			System.out.println(num2+10.10);
			
			String s3="true";
			//String to boolean
			boolean b1=Boolean.parseBoolean(s3);
			System.out.println("String to boolaen: "+b1);
			
			//String to char ---charAt()
			String s4="A";
			char c1=s4.charAt(0);
			System.out.println(c1);
			
			
			//Primitive to object---valueOf()
			int i1=100;
			System.out.println(i1+100);//200
			String s5=String.valueOf(i1);
			System.out.println(s5+100);//100100
			
			char c2='U';
			String s6=String.valueOf(c2);
			System.out.println(s6+"AB");
			
			
			
			
			
			
			
			

	}

}
