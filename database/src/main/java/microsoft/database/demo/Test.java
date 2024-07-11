package microsoft.database.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	static final String url="jdbc:mysql://localhost:3306/demo";
	final static String user="root";
	final static String pass="1234";
	final static String driverString="com.mysql.jdbc.Driver";
	static String insert="insert into "
			+ "tblEmployee values(1,'mahajan','Hyd')";
	static String update="update  tblEmployee set name='joe' where id=1";
	static	String selectString ="select id,name,city from tblEmployee";

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		//	st.executeUpdate(update);
		//System.out.println("connection done");

		ResultSet rSet=st.executeQuery(selectString);

		while(rSet.next())
		{
			System.out.println(rSet.getInt(1)+"  "+rSet.getString(2)+" "
					+ " "+rSet.getString(3));
		}

	}
}
