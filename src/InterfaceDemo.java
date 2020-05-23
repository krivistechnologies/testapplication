
public class InterfaceDemo {

	public static void main(String[] args) {
		
		//DBInterface obj = new DBInterface();
		
		
		DBInterface obj;
		

		obj = new OracleDBImpl();
		
		obj.connect();
		obj.process();
		obj.disconnect();
		
	
		obj = new MySQLDBImpl();
		
		obj.connect();
		obj.process();
		obj.disconnect();

	}

}
