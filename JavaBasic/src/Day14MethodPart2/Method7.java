package Day14MethodPart2;

public class Method7 {

	public void additionOfTwoNumbers(int p,int t)//int p=25; int t=45;
	{
		int rt=p+t;
		System.out.println("Addition result is: "+rt);
	}
	
	public double getAdditionOfTwoNumbers(double p,double t) {
		double wq=p+t;
		return wq;
	}
	
	public static void main(String[] args) {
		System.out.println("Program Starts...");
		Method7 m1=new Method7();
		m1.additionOfTwoNumbers(25, 45);
		
		double res=m1.getAdditionOfTwoNumbers(25, 45);
		System.out.println("Result: "+res);
		double total=res*100-58;
		System.out.println("Total sum:"+total);
		
		System.out.println("Sum: "+m1.getAdditionOfTwoNumbers(25, 45));
		System.out.println("Program ends...");
	}
	
}
