package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{

		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(10);
		ls.add(30);
		ls.add(20);
		ls.add(60);
		ls.add(30);
		
		System.out.println("Is list is empty?: "+ls.isEmpty());
		System.out.println("Total elementy in list: "+ls.size());
		
		for(Integer i: ls)
		{
			System.out.println(i);
		}
		
		ls.addFirst(100);
		ls.addLast(200);

		System.out.println(ls);

		System.out.println(ls.getFirst());

	}

}
