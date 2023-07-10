package inheritnce;

public class Dog extends Animal {

	//String color="black";
	
	public void eat() {
	System.out.println("hallo 1");
	}
	void bark()
	{
		System.out.println("hallo 2");
	}
	void inh()
	{
	super.eat();
	bark();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dog d = new Dog();
	d.inh();
	
	}

}
