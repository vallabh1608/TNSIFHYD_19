package privategetsetjava;

public class Car {
	private String doors;
	private String engine;
	private String driver_seatbelt;
	private int speed;
	
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver_seatbelt() {
		return driver_seatbelt;
	}
	public void setDriver_seatbelt(String driver_seatbelt) {
		this.driver_seatbelt = driver_seatbelt;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String run() {
		if ((driver_seatbelt=="weared")&&(engine=="On")&&(speed>0)&&(doors=="Closed")) {
			return "Your car is on the road, heading towards your destiny.";
		}
		else {
			return "The car isn't running! Make sure your seatbelt is fastened, the engine is running smoothly, and all the car doors are closed.";
		}
	}

}
