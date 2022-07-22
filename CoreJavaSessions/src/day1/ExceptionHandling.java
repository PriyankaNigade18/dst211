package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception 
	{
		
		File test1=new File("path of file");
		FileInputStream fs=new FileInputStream(test1);
		
		
		
//Example for Compile time exception
		System.out.println("Program started....");
		
		Thread.sleep(4000);
		
		System.out.println("Program ends.....");
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter index value between 0 to 3");
//		int index=sc.nextInt();
//		int arr[]= {10,20,30,40};
//		try {
//			System.out.println("Array value is : "+arr[index]);
//		} catch (Exception e) {
//			System.out.println("Enter valid index "+e.getMessage());
//		}finally
//		{
//			System.out.println("Program completed!...Thank you");
//		}
//		
		
		//System.out.println("Program completed!");
		
		
		
		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("Addition is: "+(a+b));
//		System.out.println("Subtraction is: "+(a-b));
//		try {
//		System.out.println("Division is: "+(a/b));
//		}catch(Exception e)
//		{
//			System.out.println("Please enter number other than zero otherwise you will get:  "+e.getMessage());
//			
//		}
//		System.out.println("Multiplication is: "+(a*b));
		//sc.close();

	}

}
