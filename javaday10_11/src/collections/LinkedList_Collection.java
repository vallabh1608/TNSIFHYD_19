package collections;
import java.io.*;
import java.util.*;

public class LinkedList_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> LL=new LinkedList<Integer>();
		//Appending new elements at end of list
		for(int i=1;i<=5;i++) {
			LL.add(i);
		}
		
		System.out.println("All elements of LinkedList: "+LL); //Printing all elements of LinkedList
		
		//Remove an element from LinkedList "LL"
		LL.remove(2);
		System.out.println("Elements of LinkedList After Deletion: "+LL); //Printing all elements of LinkedList After Deletion
		
		
	   //Printing all elements of LinkedList one by one
		System.out.print("Elements of LinkedList one by one: ");
		
		for(int i=0;i<LL.size();i++) {
			
			System.out.print(LL.get(i)+" ");
		}

	}

}
