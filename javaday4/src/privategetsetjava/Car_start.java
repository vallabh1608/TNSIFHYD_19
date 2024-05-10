package privategetsetjava;

public class Car_start{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.setDoors("Closed");
		car1.setDriver_seatbelt("weared");
		car1.setEngine("On");
		car1.setSpeed(10);
		
		
//		System.out.println(car1.getSpeed());
//		System.out.println(car1.getDoors());
//		System.out.println(car1.getDriver_seatbelt());
//		System.out.println(car1.getEngine());
		
		System.out.println(car1.run());

	}

}
