package inheritnce;

public class Bank {

private int pin;
	
	public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Bank obj = new Bank();
	obj.setPin(65656);
	System.out.println(obj.getPin());
	
	}

}

