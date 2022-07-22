package day1;

public class StringDemo {

	public static void main(String[] args) 
	{	
		
		
		
//		StringBuilder sb=new StringBuilder("HI");
//		System.out.println(sb.append(" "+"Hello"));
//		System.out.println(sb);
//		System.out.println(sb.reverse());
		
		
		
		String s1="Selenium WebDriver is WebUI automation tool";
		
		//length()
		//		int length=s1.length();
		System.out.println("Length of the string is: "+s1.length());
		
		//convert-toUpperCase()  -toLowserCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//contains()
		System.out.println("Is String contains tools??: "+s1.contains("tools"));
		
		//Compare --(String contents)
		//equals()-exact matching & case sensitive   
		//equalsIgnoreCase()-exact matching & not case sensitive
	
		String s2="Welcome for Selenium Automation";
		String s3="Welcome for Selenium Automation";
		
		System.out.println("equals(): "+s2.equals(s3));//true/false
		System.out.println("equalsIgnoreCase(): "+s2.equalsIgnoreCase(s3));//true
		//Operator compares id defined by jvm
		System.out.println(s2==s3);
		
		
		//concat()
		System.out.println(s1.concat(" "+s2));
		
		//trim()----remove white space from before and after string 
		String s4="    Welcome   ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		//startsWith("prefix")    endsWith(suffix)
		
		System.out.println("Is s2 String starts with welcome??: "+s2.startsWith("Wel"));
		System.out.println("Is s2 String ends With tools??: "+s2.endsWith("mation"));
		
		
		//charAt()
		System.out.println(s2.charAt(6));//e
		
		//split(regexp)---pattern matching
		String tools="HPQTP Selenium Postman TestLink JIRA";
		String data[]=tools.split(" ");
		for(String i:data)
		{
			System.out.println(i);
		}
		
		
		//reverse
		String s5="Selenium WebDriver";
		String rev="";
		for(int i=s5.length()-1;i>=0;i--)
		{
			rev=rev+s5.charAt(i);
		}
		System.out.println("Reverse of String "+s5+" is "+rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
