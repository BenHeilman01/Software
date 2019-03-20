package claim;

public class Employee extends Person {

	@Override
	public double taxes(double amount) {

		return .20;
	}
	Employee e1 = new Employee();
}
