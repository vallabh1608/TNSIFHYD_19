package keywords;

public class Super_Animal_2 extends Super_Animal_1{
	void bark() {
		System.out.println("Barking");
	}
	void work() {
		bark();
		super.eat();
	}
}
