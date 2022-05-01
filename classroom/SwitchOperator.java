package week1.day1.classroom;

public class SwitchOperator {
	public static void main(String[] args) {
		int num1=3,num2=2,add,sub,mul,div;
		String operations="+,-,*,/";
		switch (operations) {
		case "+":
			add=num1+num2;
			System.out.println("Addition = "+add);
			break;
			
		case "-":
			sub=num1-num2;
			System.out.println("Substraction = "+sub);
			break;
			
		case "*":
			mul=num1*num2;
			System.out.println("Multiplication = "+mul);
			break;
			
		case "/":
			div=num1/num2;
			System.out.println("Division = "+div);
			break;
			
		default:
			System.out.println("Incorrect symbol");
			break;
		}
	}
}