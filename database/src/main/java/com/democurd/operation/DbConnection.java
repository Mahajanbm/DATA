package com.democurd.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.*;


public class DbConnection {

	public static Connection  data() throws IOException, SQLException
	{
		File f1=new File("C:\\Users\\Admin\\Documents\\SDAJ55\\database\\src\\main\\java\\db.properties");
		FileInputStream f2=new FileInputStream(f1);
		Properties p1=new Properties();
		p1.load(f2);
		String url=p1.getProperty("url");
		String user=p1.getProperty("user");
		String pass=p1.getProperty("password");


		Connection  connection=DriverManager.getConnection(url,user,pass);
		return connection;


	}
}
