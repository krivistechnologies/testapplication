
public class InheritanceDemo {

	public static void main(String[] args) {
		
		OracleDB oracleDB= new OracleDB();
		oracleDB.oracleDBOperation();
		oracleDB.getDBConnection();
		System.out.println("Connection Pool Size = " + oracleDB.connectionPoolSize);
		

	}

}
