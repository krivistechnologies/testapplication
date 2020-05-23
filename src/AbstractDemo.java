
public class AbstractDemo {

	public static void main(String[] args) {
		
		// Car obj = new Car();//can create object to abstract class
		String carType = args[0];
		Car obj = null;
		
		if(carType.equals("maruthi"))
			obj = new Maruthi(1001);
		else
			obj = new Santro(2001);
		
	
		obj.fillTank();
		obj.steering();
		obj.breaking();
		
	
		

	}

}
