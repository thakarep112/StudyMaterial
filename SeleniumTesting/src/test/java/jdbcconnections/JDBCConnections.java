package jdbcconnections;

import java.sql.SQLException;
import java.util.List;

public class JDBCConnections {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DbManager.setMysqlDbConnection();
		List<String> values = DbManager.getMysqlQuery("Select * from productline where SuperCatID=5");
		System.out.println(values.size());
		System.out.println(values);
		
		// Printing available values using for each loop.
		
		for(String value : values) {
			
			System.out.println(value);
			
		}
		
	}

}
