package com.claim;

public class Application {
	public static void main(String[] args) {
//Create student1 and student2 
		//student1 creating w/no values
		Student student1 = new Student();
		//student2 creating w/name
		Student student2 = new Student("add first name here "," add last name here "," enter age here ", " enter phone number here ");
//'getting' our variable, 'setFirstName' and 'setLastName' by calling our object 'student1'
// with the '.'  The . is how I call that variable and assign it to my object.
		student1.setFirstName("john");
		student1.setLastName("doe");
		student1.setAge("37");
		student1.setTelephone("314-not-here");
//Printing students name 
		System.out.println(student2.getFirstName() + "" + student2.getLastName() + "" + student2.getAge() + "" + student2.getTelephone() + "");
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getAge());
		System.out.println(student1.getTelephone());
	}

}
