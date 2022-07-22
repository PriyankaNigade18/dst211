package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args)
	{

		//Map<Integer,String> map=new HashMap<>();
	
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(101, "C Pragramming");
		hs.put(102, "Python");
		hs.put(103, "Java");
		hs.put(102, null);
		hs.put(105, "Python");
		System.out.println(hs.get(104));//null
	
		System.out.println(hs);
		
		

	}

}
