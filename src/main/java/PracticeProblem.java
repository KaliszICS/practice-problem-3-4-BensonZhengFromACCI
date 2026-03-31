public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int min(int num1, int num2, int num3) {
		if (num1 <= num2 && num1 <= num3) {
			return num1;
		}
			else
				if (num2 <= num1 && num2 <= num3) {
					return num2;
				}
	
		else {
		return num3;
		}
	}
	

	public static boolean isLeapYear(int num1) {
		if (num1 % 4 == 0) {
			if (num1 % 100 == 0) {
				if (num1 % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else return true;
		}
		else return false;
	}
}


