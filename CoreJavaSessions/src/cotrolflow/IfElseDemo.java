package cotrolflow;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Valid age");
		}else
		{
			System.out.println("Invalid age");
		}

		sc.close();
	}

}
