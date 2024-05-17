package collections;
import java.io.*;
import java.util.*;

public class TreeSet_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String>ts=new TreeSet<String>();
		
		ts.add("TNS");
		ts.add("C2TC");
		ts.add("Program");
		ts.add("Turns");
		ts.add("Students");
		ts.add("into");
		ts.add("Professionals");
		
        Iterator<String>itr =ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	

	}

}
