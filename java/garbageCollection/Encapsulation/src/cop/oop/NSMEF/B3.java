package cop.oop.NSMEF;

public class B3 extends A3{
	
	int y = m2();
	int m2() {
		System.out.println("B NSV");
		return 20;
	}
	{
		System.out.println(" B NSB");
	}
	
	public B3() {
		super();
	}

	public static void main(String[] args) {
		System.out.println("B main");
		B3 b = new B3();
		System.out.println("x :"+b.x);
		System.out.println("y : "+b.y);
	}
	
	

}
