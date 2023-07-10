package inheritnce;

abstract class Employeeassignment {

	abstract void calculateSalary();
	

}

class contractor extends Employeeassignment {
	int payment = 100;
	int hours = 24;
	
	void calculateSalary()
	{
	
	int calculate = payment * hours ;	
		System.out.println("Salray of contractor is is" +calculate);
	}
	
}


class fulltimeemp extends Employeeassignment {
	int payment = 100;
	int hours = 8;
	
	void calculateSalary()
	{
	
	int calculate = payment * hours ;	
		System.out.println("Salary of  fulltimeemp is" +calculate);
	}
	
}