package Day17UnaryOperator;

public class UnaryOp2 {

	public static void main(String[] args) {

		int a = 47, b;
		b = a++;
		System.out.println(a);// 
		System.out.println(b);// 
		int x = a;
		int y;
		System.out.println(x);// 
		y = ++x;
		System.out.println(x);// 
		System.out.println(y);// 

		int p = -15, q = 25, res;
		res = p++ + --q;
		System.out.println("res: " + res);//
		System.out.println("p: " + p);// 
		System.out.println("q: " + q);//
		System.out.println("*****************************");
		int res1 = ++p + ++q;
		System.out.println(res1);// 
		System.out.println("p: " + p);// 
		System.out.println("q: " + q);// 
	}

}
