package day1;

public class DatatypeDemo {

	public static void main(String[] args) 
	{

		//boolean true/false----1bit
		boolean status=true;
		System.out.println("Boolean data is: "+status);//true
		status=false;
		System.out.println("new updated status is: "+status);//false
		System.out.println("*********************************************");
		//character (single)  char 2byte
		char c1='A';
		System.out.println("Character data is: "+c1);//A
		char c2='&';
		System.out.println("Character data is: "+c2);//&
		char c3=65;//char type will accept ASCII value of character.
		System.out.println("Character is: "+c3);//char value of Ascii:A
		System.out.println("*********************************************");

		//Integral====Integer
		//byte 1byte -128 to 127
		byte b1=100;
		System.out.println("byte data is: "+b1);//100
		
		//short 2byte
		short s1=150;
		System.out.println("Short data is: "+s1);//150
		short s2=32700;
		System.out.println("Short data is: "+s2);//32700
		
		//int 4byte
		int i1=50000;
		System.out.println("Integer data is: "+i1);//50000
		
		//long 8byte
		//int i2=99999999999;
		
		long l1=99999999999L;
		System.out.println("Long data is: "+l1);
		System.out.println("*********************************************");
		//Floating point 1.float-4byte(6 to 7)   2.double(default)-8byte(15 to 16)
		
		double d1=67.89;
		System.out.println("Double data is: "+d1);//67.89
		
		float f1=84.34F;
		System.out.println("Float data is: "+f1);
		System.out.println("*********************************************");
		
		//String is class in Java
		String name="Pooja";
		System.out.println("String data is: "+name);
		System.out.println("*********************************************");
		
		//Type Casting
		//1.Implicit Automatic
		
		int n1=100;
		long l2=n1;
		System.out.println("Integer to long data: "+l2);//100L
		
		char c4='b';//char
		int n2=c4;//ascii
		System.out.println("character to intger: "+n2);
		
		float f2=n1;//n1=100 f2=100.0
		System.out.println("Integer to float data: "+f2);
		
		//f2=100.0
		double d2=f2;
		System.out.println("float to double "+d2);
		
		
		//Explicit(Manually)---Casting operator(type)
		long l3=999999999999L;
		int n3=(int)l3;
		System.out.println("Long to integer: "+n3);
		
		
		int n4=67;
		char c5=(char) n4;
		System.out.println("Integer to character: "+c5);
		
		double d3=98.78;
		float f4=(float) d3;
		System.out.println("Double to float: "+f4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
