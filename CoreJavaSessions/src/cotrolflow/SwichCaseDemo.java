package cotrolflow;

import java.util.Scanner;

public class SwichCaseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char c1=sc.nextLine().charAt(0);
		switch(c1)
		{
		case 'a','A':
			System.out.println("It is vowel");
		break;
		case 'e','E':
			System.out.println("It is vowel");
		break;
		case 'i','I':
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Not a vowel");
			
		}
		
		
		
		
//		System.out.println("Enter number between 0 to 5");
//		int num=sc.nextInt();
//		switch(num)
//		{
//		case 0:
//			System.out.println("Zero");
//			break;
//		case 1:
//			System.out.println("One");
//			break;
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		case 4:
//			System.out.println("Four");
//			break;
//		case 5:
//			System.out.println("Five");
//			break;
//			default:
//				System.out.println("Invalid number");
//		
//		}
		System.out.println("Completed........");
		
	}

}
