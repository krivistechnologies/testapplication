
public abstract class Car {
	
	int regNo;
	
	Car(int r){
		regNo = r;
	}
	
	void fillTank() {
		System.out.println("Open lid and fill the tank");
	}

	abstract void steering();
	abstract void breaking();
	
}



