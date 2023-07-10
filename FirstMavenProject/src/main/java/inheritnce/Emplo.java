package inheritnce;

public class Emplo {
int id;
String name;
String address;

	
	public Emplo(int id, String name, Emplo obj1) {
	super();
	this.id = id;
	this.name = name;
	this.address = obj1;
}

	void display()
	{
		System.out.println("id is"+id);
		System.out.println("name is"+name);
		//System.out.println("city is"+address.city);
		//System.out.println("country is"+address.country);
		//System.out.println("adress is"+address.zipcode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address obj = new Address("ahgh","gfjhg",2222);
		Emplo obj1 = new Emplo(7,"f","obj1");
		obj1.display();
		
	
	}

}
