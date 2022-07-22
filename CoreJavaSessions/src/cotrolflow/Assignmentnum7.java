package cotrolflow;

import java.util.Scanner;

public class Assignmentnum7 {

	public static void main(String[] args)
	{
	 	  
				int num=153, sum=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			//sum=sum*10+rem;
			sum=sum+rem*rem*rem;
		}
		
		//System.out.println("Reverse number of "+temp+" is "+sum);
		if(temp==sum)
		{
			System.out.println(temp+" is an Armstrong number");
		}else
		{
			System.out.println(temp+" is not an Armstrong number");
		}
		
		
		
		
		
		
		
		
		
		//swap two numbers
//		int a=10,b=20,temp;
//		System.out.println("Before swapping a="+a+"&"+" b="+b);
////		temp=a;
////		a=b;
////		b=temp;
//		a=a+b;//a=30
//		b=a-b;//b=10
//		a=a-b;//a=20
//		System.out.println("After swapping a="+a+"&"+" b="+b);
//		
		
		
		
		
		
		//print factorial of number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number");
//		int fact=1,num=sc.nextInt();
//		for(int i=num;i>=1;i--)
//		{
//			fact=fact*i;
//			
//		}
//		System.out.println("Factorial of number "+num+" is "+fact);

	}

}
