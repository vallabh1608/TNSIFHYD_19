package collections;
import java.io.*;
import java.util.*;

public class LinkedLHashSet_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>lhs=new LinkedHashSet<String>();
		
		lhs.add("Eclipse");
		lhs.add("is");
		lhs.add("is");
		lhs.add("Effective");
		lhs.add("IDE");
		
		Iterator<String>itr =lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
