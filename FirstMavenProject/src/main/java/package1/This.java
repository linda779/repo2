package package1;

public class This {

	void m() {
		
		System.out.println("hello");
	}
	void n() {
		System.out.println("hello1");
		this.m();
	}
	
	
	public static void main(String[] args) {
		new This().n();
		// TODO Auto-generated method stub

	}

}
