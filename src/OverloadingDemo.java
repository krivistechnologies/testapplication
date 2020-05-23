
public class OverloadingDemo {

	public static void main(String[] args) {
		
		/*Calculator calculator = new Calculator();
		calculator.add(10, 20);
		calculator.add(10, 30, 40);
		calculator.add(10.00, 20.50);
		
		calculator.display(10,'d');
		calculator.display('d', 10);
		
		*/
		
		/*
		Calculator calculator = new Calculator();
		calculator.calculate(10);
		
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		scientificCalculator.calculate(16);
		*/
	/*
		
		//Up casting  or widening
		 Calculator calculator = new ScientificCalculator();
		 calculator.calculate(15);
		 
		 */
		
		//ScientificCalculator scientificCalculator = new Calculator(); //illegal 
		
		//down casting or narrowing
		 Calculator calculator;
		 //calculator = new ScientificCalculator();

		// ScientificCalculator scientificCalculator = (ScientificCalculator) calculator;
		 	
		// scientificCalculator.cal();
		// scientificCalculator.calculate(10);
		  
	
		 
	}

}
