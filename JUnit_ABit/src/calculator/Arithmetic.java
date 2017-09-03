package calculator;

public class Arithmetic {
	
	public double add(double a, double b){
		return a + b;
	}
	
	public double deduction(double a, double b){
		return a - b;
	}
	
	public double multiply(double a, double b){
		return a * b;
	}
	
	public double division(double a, double b){
		if(b == 0) throw new ArithmeticException();
		return a / b;
	}

}
