public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		int subtractReturn = 0;
		if (a > b) {
			subtractReturn =  a - b;
		} else if ((b > a) || (b == a)) {
			subtractReturn = b - a;
		}
		return subtractReturn;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		double divideReturn = 0;
		if (a > b) {
			divideReturn = (double)a / b;
		} else if ((b > a) || (b == a)) {
			divideReturn = (double)b / a;
		}
		return divideReturn;
	}
}
