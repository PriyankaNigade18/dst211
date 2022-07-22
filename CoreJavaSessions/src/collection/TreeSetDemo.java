package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(50);
		ts.add(20);
		ts.add(90);
		ts.add(10);
		ts.add(40);
		ts.add(30);
		ts.add(50);
		
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println("First element:"+ts.first());
		System.out.println("Last element: "+ts.last());
		System.out.println("headSet(): Less than 50"+ts.headSet(50));
		System.out.println("subSet(): "+ts.subSet(20,50));//20,30,40
		System.out.println("tailSet(): greater than value"+ts.tailSet(30));
		

	}

}
