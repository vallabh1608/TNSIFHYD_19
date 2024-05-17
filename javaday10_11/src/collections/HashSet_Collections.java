package collections;
import java.io.*;
import java.util.*;

public class HashSet_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating HashSet and adding elements
		HashSet<String>hs=new HashSet<String>();
		
		
		hs.add("Hanumaan");
		hs.add("is");
		hs.add("Mythological");
		hs.add("Mythological");
		hs.add("and");
		hs.add("Adventurous");
		hs.add("Movie");
		
		System.out.println(hs); //printing directly
		Iterator<String>itr=hs.iterator();
		
		//printing through iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
