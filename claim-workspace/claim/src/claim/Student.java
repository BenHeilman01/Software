package claim;

public class Student extends Person {
	
	public Student() {
		this.firstName = "Ben";
		this.lastName = "Heilman";
	}

	@Override
	public double taxes(double amount) {

		return .02;
	}
	Student s1 = new Student(); 

	}
	

 //	protected String firstName;
//protected String lastName;