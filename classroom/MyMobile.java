package week1.day1.classroom;

public class MyMobile {
	
	boolean recieve;
	double callDuration;
	String contactName;
	int billAmount=3000;
	

	public void makeCall() {
		System.out.println("i can call");
		System.out.println(contactName="abc");
		System.out.println(callDuration=29.83);
	}
	public void sendMsg() {
		System.out.println("i can msg");
		System.out.println(contactName="xyz");
		System.out.println(recieve=true);
	}
	void payBills() {
		System.out.println("i will pay the bill " + billAmount);
		
	}
	

}