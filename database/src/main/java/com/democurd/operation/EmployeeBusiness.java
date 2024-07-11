package com.democurd.operation;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeBusiness implements EmployeeService {

	String insert="insert into tblEmployee values(102,'joe',98549)";
	@Override
	public void add() throws SQLException, IOException {
		Statement statement=DbConnection.data().createStatement();
		statement.executeUpdate(insert);
	}

	@Override
	public void display() throws SQLException, IOException {
		// TODO Auto-generated method stub
		Statement statement=DbConnection.data().createStatement();
		ResultSet rSet=statement.executeQuery("Select * from tblEmployee");
		while(rSet.next())
		{
			System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+"  "+rSet.getString(3));

		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
