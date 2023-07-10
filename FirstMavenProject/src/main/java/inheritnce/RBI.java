package inheritnce;

public interface RBI {
   void recurringDeposit();
   
}

class Hdfc implements RBI {

public void recurringDeposit() {
}
{
	int amount=1000;
	int duration=8;
	int deposit = amount * duration;
	System.out.println("deposit amount is "+deposit);
}
	
}
