package collections;
import java.io.*;
import java.util.*;

public class PriorityQueue_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It uses FIRST IN FIRST OUT-(FIFO) principle
		
		//Creating empty Priority Queue
		PriorityQueue<Integer>pQ=new PriorityQueue<Integer>();
		
		pQ.add(10);
		pQ.add(20);
		pQ.add(30);
		System.out.println("PriorityQueue Elements: "+pQ);//Displaying all elements of PriorityQueue
		System.out.println("Top element of Queue peek method: "+pQ.peek()); //printing top element of pQ collection
		//printing top element of Queue and removing it by poll method
		System.out.println("Deleted Element by polling method:"+pQ.poll());
		System.out.println("Top element of Queue after polling: "+pQ.peek()); //checking the top element of pQ collection after polling(removing first eleement of collection)
		System.out.println("PriorityQueue Elements after polling: "+pQ); //Displaying all elements of PriorityQueue

	}

}
