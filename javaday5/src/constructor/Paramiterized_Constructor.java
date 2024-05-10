package constructor;


public class Paramiterized_Constructor {
	private String doors;
	private String driverSeatBelt;
	private String engine;
	private int speed;
	
	public Paramiterized_Constructor(String doors,String driverSeatBelt,String engine,int speed) {
		this.doors=doors;
		this.driverSeatBelt=driverSeatBelt;
		this.engine=engine;
		this.speed=speed;
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
