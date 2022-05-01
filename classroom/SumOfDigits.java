package week1.day1.classroom;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int number=123;
		int sum=0;
		while (number>0) {
			int remainder = number%10;
			sum=sum+remainder;
			number=number/10;
		}
		System.out.println("The sum inputed digits are= "+sum);
	}
}