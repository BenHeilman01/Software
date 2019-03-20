package inClassDemos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {



	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private double gpa;
	private String telephone;
	private Address address;
	private final static String path = "C:\\Users\\ben_h\\streams";
	
	//5. Add a default constructor public Student() {}
		public Student() {}
	//6. Add a parameterized constructor 
		public Student (String firstName, String lastName, String email, int age, double gpa, String telephone, Address address) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.age = age;
			this.gpa = gpa;
			this.telephone = telephone;
			this.address = address;
		}
		
		public static Student readFromFile(String email) {
			Student student = new Student();
			String fileName = path+email+".txt";
			
			try {
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				String[] parsedLine = line.split(",");
				String fName = parsedLine[0];
				student.setFirstName(fName);
				student.setLastName(parsedLine[1]);
				student.setEmail(parsedLine[2]);
				int parseAge = Integer.parseInt(parsedLine[3]);
				student.setAge(parseAge);
				double parseGpa = Double.parseDouble(parsedLine[4]);
				student.setGpa(parseGpa);
				
				
			}
			}catch(FileNotFoundException e) {
				System.out.println("Invalid file name");
			}
			return student;
		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
	this.age = age;
}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Address getAddress() {
	return address;
	}
	public void setAddress(Address address) {
	this.address = address;
}
	
	public void saveToFile() {
	String fileName = path+email+".txt";
	
	try {
	BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	bw.write(formatData());
	bw.close();
	}catch(IOException e) {
		System.out.println("Save to file failed");
	}
	
	}
	
	private String formatData() {
		return this.firstName+","+this.lastName+","+this.email+","+this.age+","+this.gpa+","+this.telephone;
	}
	
	public String toString() {
		return "First Name: "+this.firstName+"/nLastName: "+this.lastName;
	}
	
	
	
	
	
	
	
	
	
	
	
}
