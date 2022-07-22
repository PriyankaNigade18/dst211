package day1;

//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runtimeparameterpassing
{
	public void display(String n)//local n=name
	{
		System.out.println("Your name is "+n);
	}

	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		Runtimeparameterpassing r1=new Runtimeparameterpassing();
		r1.display(name);
		sc.close();
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Enter your score");
//		double num=sc.nextDouble();
//		System.out.println(num);
//		int num=sc.nextInt();
//		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//method2 
//		InputStreamReader ir=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(ir);
//		System.out.println("Enter your name");
//		String name=br.readLine();
//		System.out.println(name);
//		
//		System.out.println("Enter your age");
//		String data=br.readLine();
//		int num=Integer.parseInt(data);
//		System.out.println(num);
		
		
		
		
		
		
		
		//technique 1
//		System.out.println("Enter your age");
////		char c=50;
////		System.out.println(c);		
//		int num=System.in.read();
//		System.out.println((char)num);

	}

}
