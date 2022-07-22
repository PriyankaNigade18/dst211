package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	//ArrayList class implement List interface
	//Frequent operation is retrieval Data structure=Dynamic array
	//java.util
	public static void main(String[] args)
	{
		//Generic 1.type safe
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is my list is empty?: "+al.isEmpty());//true
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(400);
		al.add(null);
		Iterator<Integer> ir=al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
//		for(Integer i:al)
//		{
//			System.out.println(i);
//		}
		
		
		
		/*
		int i=al.get(0);
		System.out.println(i);
		System.out.println(al);
		System.out.println("Is my list is empty?: "+al.isEmpty());//false
		System.out.println("Total elements of list are: "+al.size());
		System.out.println("Is list contains 300?: "+al.contains(300));//true
		System.out.println("Is list contains 500?: "+al.contains(500));//false
		al.add(0,900);
		System.out.println(al);
		al.remove(1);
		//al.clear();
		
		System.out.println(al);
		System.out.println(al.size());
		
		*/
		
		
		
		
		
		
		

		//Non generic way  1. Not type safe  2.type casting is required
//		ArrayList al=new ArrayList();
//		al.add(100);
//		al.add("Pooja");
//		al.add(45.56);
//		al.add('W');
//		
//		int num1=(int)al.get(0);
//		System.out.println(num1);
//		System.out.println(al);


	}

}
