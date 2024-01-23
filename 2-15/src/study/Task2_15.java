package study;

public class Task2_15 {
	
	//問1
	public static String red = "赤";
	public static String blue = "青";
	
	public static void main(String[] args) {
		
		//問2
		Bike bike1 = new Bike(red);
		Bike bike2 = new Bike(blue,"700cc");
		
		bike1.run();
		System.out.println("car1は" + bike1.color + "色で" + bike1.type + "タイプです。 現在" + bike1.check());
		bike2.stop();
		System.out.println("car2は" + bike2.color + "色で" + bike2.type + "タイプです。 現在" + bike2.check());
	}
}

class Bike {
	String color;
	String type;
	Boolean state;

	public Bike(String color) {
		this.color = color;
		this.type = "250cc";
	}

	public Bike(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public void run() {
		this.state = true;
	}

	public void stop() {
		this.state = false;
	}

	public String check( ) {
		if(this.state) {
			return "走行中です。";
		} else {
			return "停止中です。";
		}
	}
}