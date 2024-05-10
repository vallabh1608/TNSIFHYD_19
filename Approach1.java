package inst_static_members;

public class Approach1 {
	String batsman="viratkohli";
	static String batting="Right-Hanaded";
	static String Ipl_team="RCB";
	
	void about() {
		System.out.println("Batsman : "+batsman+"\nBatting : "+batting);
	}
	static void moreinfo() {
		System.out.println("Ipl_team : "+Ipl_team);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Approach1 a1=new Approach1();
		a1.about();
		Approach1.moreinfo();
		

	}

}
