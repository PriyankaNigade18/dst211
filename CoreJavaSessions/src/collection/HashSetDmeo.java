package collection;

import java.util.HashSet;

public class HashSetDmeo {

	public static void main(String[] args) 
	{

		HashSet<Integer> hs=new HashSet<>();
		System.out.println("Is set empty?: "+hs.isEmpty());
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add(30);
		hs.add(40);
		System.out.println("Is set empty?: "+hs.isEmpty());
		System.out.println(hs);
		System.out.println("Total element from set are: "+hs.size());
		System.out.println("Is set contains 30?: "+hs.contains(30));
		hs.remove(10);
		System.out.println("final Set: "+hs);
		hs.clear();
		System.out.println(hs);
	}

}
