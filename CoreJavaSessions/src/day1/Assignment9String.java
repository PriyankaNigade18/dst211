package day1;

import java.util.Scanner;

public class Assignment9String {

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enyter browser name: ");
			String browser=sc.nextLine();
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.out.println("Test case is running on Chrome");
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				System.out.println("Test case is running on Firefox");
			}else if(browser.equalsIgnoreCase("Sarafri"))
			{
				System.out.println("Test case is Running on Safari");
			}else
			{
				System.out.println("No such browser");
	
			
			}
			sc.close();

	}

}
