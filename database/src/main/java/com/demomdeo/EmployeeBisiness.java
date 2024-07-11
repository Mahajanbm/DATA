package com.demomdeo;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeBisiness implements EmployeeService {

	final static String insert="insert into data"
			+ "(name,city,salary) values(?,?,?)";
	final static  String update="update data set "
			+ "name=?,city=?,salary=? where id=?";
	final static String DELETE_STRING ="delete from data where id=?";
	final static String select ="select * from data";

	@Override
	public void add() throws SQLException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement ps=DbConnection.data().prepareStatement(insert);
		Scanner s1=new Scanner(System.in);

		System.out.println("Enter Name of Employee");
		String name=s1.next();
		System.out.println("Enter City of Employee");
		String city=s1.next();
		System.out.println("Enter salary of Employee");
		float salary=s1.nextFloat();
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setFloat(3, salary);

		ps.executeUpdate();
	}

	@Override
	public void display() throws SQLException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement ps=DbConnection.data().prepareStatement(select);
		ResultSet rSet=ps.executeQuery();
		while(rSet.next())
		{
			System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+""
					+ " "+rSet.getString(3)+" "+rSet.getFloat(4));
		}

	}

	@Override
	public void update() throws SQLException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement ps=DbConnection.data().prepareStatement(update);
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Id to Update data");
		int id=s1.nextInt();
		System.out.println("Enter Name of Employee");
		String name=s1.next();
		System.out.println("Enter City of Employee");
		String city=s1.next();
		System.out.println("Enter salary of Employee");
		float salary=s1.nextFloat();
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setFloat(3, salary);
		ps.setInt(4, id);
		ps.executeUpdate();

		System.out.println("Data inseted sucessfully");

	}

	@Override
	public void delete() throws SQLException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement ps=DbConnection.data().prepareStatement(DELETE_STRING);
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Id to Update data");
		int id=s1.nextInt();
		ps.setInt(1, id);
		ps.executeUpdate();
	}

}
