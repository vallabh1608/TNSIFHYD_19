package str.arr.com;

public class Array_Of_Objects_Student_main {
	
	public static void main(String_Example[] args) {
			
		Array_Of_Objects_Students[] arr=new Array_Of_Objects_Students[5];
		
		arr[0]=new Array_Of_Objects_Students(1,"Varshika");
		arr[1]=new Array_Of_Objects_Students(2,"Varunika");
		arr[2]=new Array_Of_Objects_Students(3,"Vallabh");
		arr[3]=new Array_Of_Objects_Students(4,"Cherry");
		arr[4]=new Array_Of_Objects_Students(5,"Tillu");
		
		for (int i=0; i<=arr.length-1;i++) {
			
			System.out.println("Element at "+i+" of arr is Name: "+arr[i].name+" Roll_no: "+arr[i].roll_no);
			
		}
	}

}
