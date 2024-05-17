package collections;
import java.io.*;
import java.util.*;


public class ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization of deque
		ArrayDeque<Integer>ADQ=new ArrayDeque<Integer>();
		
		//add() method to insert
		ADQ.add(10);
		ADQ.add(20);
		ADQ.add(30);
		ADQ.add(40);
		ADQ.add(50);
		
		//Displaying ArrayDeque Elements
		System.out.println(ADQ);
        ADQ.clear(); //clearing elements from from ArrayDeque
        System.out.println(ADQ); //checking collection after clearing
        
        //again initializing elements to DEQUE
        ADQ.add(10);
		ADQ.add(20);
		ADQ.add(30);
		ADQ.add(40);
		ADQ.add(50);
	
		ADQ.addFirst(101); //used to insert elements at first of row
		ADQ.addFirst(201);
		ADQ.addLast(301);
		ADQ.addLast(401);//used to insert elements at last of row
		//Displaying ArrayDeque Elements
		System.out.println(ADQ);
		
	

	}

}
