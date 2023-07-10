
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b;
		b = new SBI();
		System.out.println("rate of interest of sbi"+b.getRate());
		b = new ICICI();
		System.out.println("rate of interest of icici"+b.getRate());
		b = new Axis();
		System.out.println("rate of interest of Axis"+b.getRate());
		
	}

}
