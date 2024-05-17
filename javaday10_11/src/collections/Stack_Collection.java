package collections;
import java.io.*;
import java.util.*;

public class Stack_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s=new Stack<String>();
		
		//Stack uses LAST IN FIRST OUT (LIFO) Principle
		
		s.push("Election"); //By using push operation we append new element to stack
		s.push("Commission");  //By using push operation we append new element to stack
		s.push("Of");      //By using push operation we append new element to stack
		s.push("India");   //By using push operation we append new element to stack
		s.push("India");   //By using push operation we append new element to stack
		
		//Iterator for Stack
		Iterator<String> itr= s.iterator();
		
		System.out.print("Stack data: ");
		
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		s.pop(); //to remove last element(word) from stack using pop method
		
		itr=s.iterator();
		
		System.out.println();
		System.out.print("Stack data after Poping: ");
		while (itr.hasNext()) {
			System.out.print (itr.next()+" ");
		}

	}

}
