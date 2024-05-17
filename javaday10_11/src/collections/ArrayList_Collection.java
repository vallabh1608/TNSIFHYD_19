package collections;
import java.io.*;
import java.util.*;

public class ArrayList_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration of ArrayList
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		//Appending new elements at end of list
		for(int i=1;i<=5;i++) {
			al.add(i);
		}
		
		System.out.println("All elements of ArrayList: "+al); //Printing all elements of ArrayList
		
		//Remove an element from ArrayList "al"
		al.remove(2);
		System.out.println("Elements of ArrayList After Deletion: "+al); //Printing all elements of ArrayList After Deletion
		
		
	   //Printing all elements of ArrayList one by one
		System.out.print("Elements of ArrayList one by one: ");
		
		for(int i=0;i<al.size();i++) {
			
			System.out.print(al.get(i)+" ");
		}

	}

}
