package defults;

public class DefaultWhatIfs {

		public static void main(String[] args) {

		
			System.out.println(max(1, 10));
		}	
		public static int max(int num1, int num2) {
		
		int result;
		
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		
		return result;
		}

		}