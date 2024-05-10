package constructor;

public class Default_Constructor {
	private String doors;
	private String driverSeatBelt;
	private String engine;
	private int speed;
	
	public Default_Constructor() {
		this.doors="Closed";
		this.driverSeatBelt="Weared";
		this.engine="On";
		this.speed=10;
	}
	public void run() {
		if ((driverSeatBelt=="Weared")&&(engine=="On")&&(speed>0)&&(doors=="Closed")) {
			System.out.println("Your car is on the road, heading towards your destiny.");
		}
		else {
			System.out.println("The car isn't running! Make sure your seatbelt is fastened, the engine is running smoothly, and all the car doors are closed.");
		}
	}
	

}
