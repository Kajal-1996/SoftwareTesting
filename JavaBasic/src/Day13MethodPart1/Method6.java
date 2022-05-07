package Day13MethodPart1;

public class Method6 {
	
	static void getAdditionResult(double num1,double num2) {
		double res = num1+num2;
		System.out.println("Result: "+res);
	}
	

	public static void main(String[] args) {
		getAdditionResult(25, 30);
		Method6.getAdditionResult(250.36, 45);
	}
	
}
