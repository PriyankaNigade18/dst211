package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
			LinkedHashSet<Integer> ls=new LinkedHashSet<>();
			ls.add(100);
			ls.add(200);
			ls.add(300);
			ls.add(400);
			ls.add(200);
			ls.add(500);
			System.out.println(ls);
			System.out.println("total elements: "+ls.size());
			System.out.println("is set Empty: "+ls.isEmpty());
			System.out.println("is set contains 600?: "+ls.contains(600));

	}

}
