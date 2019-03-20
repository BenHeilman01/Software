package claim;

public abstract class Person {

public abstract double taxes(double amount);
	protected String firstName;
	protected String lastName;
	
public double calculateTelePhoneBill(double amount) {
	return this.taxes(amount) + amount;
}

	}


