package collections;
import java.io.*;
import java.util.*;

public class Vector_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v=new Vector<Integer>();
		//Appending new elements at end of list
		for(int i=1;i<=5;i++) {
		    v.add(i);
		}
		
		System.out.println("All elements of Vector: "+v); //Printing all elements of Vector
		
		//Remove an element from Vector "v"
		v.remove(2);
		System.out.println("Elements of Vector After Deletion: "+v); //Printing all elements of Vector After Deletion
		
		
	   //Printing all elements of Vector one by one
		System.out.print("Elements of Vector one by one: ");
		
		for(int i=0;i<v.size();i++) {
			
			System.out.print(v.get(i)+" ");
		}

	}

}
