package inClassDemos;

public class StudentApp {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.setFirstName("Ben");
		student.setLastName("Heilman");
		student.setEmail("ben_heilman@yahoo.com");
		student.setGpa(3.7);
		student.setAge(37);
		student.setTelephone("3146777840");
		
		//student.saveToFile();
		System.out.println(Student.readFromFile("ben_heilman@yahoo.com"));
	}

}
