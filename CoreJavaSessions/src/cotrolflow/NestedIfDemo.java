package cotrolflow;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		//Method chaining
		char c1=sc.nextLine().charAt(0);
		
		if(c1>='a'&&c1<='z'||c1>='A'&&c1<='Z')
		{
			System.out.println("It is an Alphabet");
		}else
		{
			System.out.println("It is not an Alphabet");
		}
		
		
		
		
		
		
//		String data=sc.nextLine();
//		char c1=data.charAt(0);
		
		
		
		
		
		
		
		
		
		
		
//		if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
//		{
//			System.out.println(c1+" is a vowel");
//		}
//		else
//		{
//			System.out.println(c1+" is not a vowel");
//		}
//		
		
		
		
		
		
		
		
		/*
		if(c1=='a')
		{
			System.out.println(c1+" is a vowel");
		}else if(c1=='e')
		{
			System.out.println(c1+" is a vowel");
		}else if(c1=='i')
		{
			System.out.println(c1+" is a vowel");
		}else if(c1=='o')
		{
			System.out.println(c1+" is a vowel");
		}else if(c1=='u')
		{
			System.out.println(c1+" is a vowel");
		}else
		{
			System.out.println(c1+" is not a vowel");
		}
*/
		sc.close();
	}

}
