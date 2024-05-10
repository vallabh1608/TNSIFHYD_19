package abstract_interface;

abstract class Abstract_Class_base {
	abstract void area(int a,int b);
	
	void display() {
		System.out.println("In abstract it can contain both concrete and unimplemented methods,so it will gain only partial abstractness");
	}
	
}
