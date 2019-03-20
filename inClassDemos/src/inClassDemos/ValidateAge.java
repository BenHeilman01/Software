package inClassDemos;
import java.util.Scanner;

public class ValidateAge {
	
	public static void main(String[] args){
		
		validateAge();
		
	}

	public static void validateAge() {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.next();
		
		try {	
		int age = Integer.parseInt(inputValue);
	}catch(NumberFormatException e) {
		System.out.println("bad age");
		validateAge();
	}
	}
}
