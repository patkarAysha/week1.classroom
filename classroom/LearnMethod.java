package week1.day2.classroom;

public class LearnMethod {
	static short wheel;
	int otp,a=8,b=2;
	long regNum;
	float num;
	double accountBalance=34.233d;
	char status='P';
	public String name="swift";
	boolean isEmpty;
	
	public String driveCar() {
		wheel=6;
		System.out.println("My Cardfjhgh244769880!@#$%");
		System.out.println(num=1234);
         return name;
	}
	private long gearCar() {
		System.out.println("GearCar");
		System.out.println(otp=74278);
		System.out.println(isEmpty);
		return regNum;
	}
	public int addTwoNumber(int a,int b){ 
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		
		long regNum=12345678987665L;
		LearnMethod car = new LearnMethod();
		car.driveCar();
		car.gearCar();
		System.out.println(regNum);
		System.out.println(wheel);
	}
}