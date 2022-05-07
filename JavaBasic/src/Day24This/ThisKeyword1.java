package Day24This;

class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee) {//rollon=101, fee=5000.0
		System.out.println("Local rollno: "+rollno);
		System.out.println("Local fee: "+fee);
		rollno = rollno;
		fee = fee;
		System.out.println("Local rollno: "+rollno);
		System.out.println("Local fee: "+fee);
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
class ThisKeyword1 {
	public static void main(String args[]) {
		Student s1 = new Student(101, 5000f);
		Student s2 = new Student(102, 6000f);
		s1.display();
		s2.display();
	}
}
/**
 * this keyword:
 * 	- Its an instance of current class
 *  - its use to diffirenticate non-static global and local variable when they have same name
 *  - can be use to call non-static members of the class
 */
