package collections;
import java.io.*;
import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instances of Array,vector,hashtable
		
		int arr[]=new int[]{1,2,3,4,5}; //Array instance creation requires []
		
		Vector<Integer> v=new Vector<Integer>(); //vector instance requires ()
		
		HashMap<Integer,String> h=new HashMap<Integer, String>(); //hashmap instance requires ()
		
		v.addElement(10); //to insert new element in vector we require .addelement()	
		v.addElement(20); //to insert new element in vector we require .addelement()	
		
		h.put(1, "sri");   //to insert new element in hash-table we require .put()	
		h.put(2, "indu");  //to insert new element in hash-table we require .put()	
		
		//Accessing elements from vector,array,hashmap
		
		System.out.println("1st of array is arr[0]="+arr[0]);
		//for accessing array elements we use arr[]
		System.out.println("1st of vector is v.elementAt(0)="+ v.elementAt(0));
		//for accessing vector elements we use v.elementAt()
		System.out.println("1st of hashtable is h.get(0)="+h.get(1));
		//for accessing hash-table elements we use h.get()
		
	}

}
