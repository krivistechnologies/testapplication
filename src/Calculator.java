
public class Calculator {
	
	int number;
	
	Calculator(int number ){
		this.number = number;
	}
	
	void execute(int num) {
		int number = 10;
		System.out.println(number);
		this.number = 20;
		System.out.println(number);
	}
	
	public static void main(String args[]) {
		
		Calculator calculator = new Calculator(30);
		calculator.execute(15);
		
	}
	
}
