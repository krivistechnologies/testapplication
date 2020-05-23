
public class MultipleInheriatnceDemo {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.property();
		
		System.out.println(Father.property1);
		System.out.println(Mother.property2);
	}

}
