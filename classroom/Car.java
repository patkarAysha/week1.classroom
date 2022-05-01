package week1.day1.classroom;

public class Car {

	static short totalWheels=4;
	int totalGears=6;
	long regNum=9876543212345l;
	boolean isEmpty=false;
	char isFuel='Y';
	String modelNaame="Swift";
	float filledFuel;
	double usedKM;
	
	
	public void driveCar() {
		System.out.println("driving the car");
		System.out.println(usedKM=54321.5);
	}
	public void gearCar() {
		System.out.println("put gear on the Car");
		System.out.println(modelNaame);
	}
	public static void main(String[] args) {
		
		
		Car obj = new Car();
		obj.driveCar();
		obj.gearCar();
		
	}

}