package com.demomdeo;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.democurd.operation.EmployeeBusiness;

public class Test {

	public static void main(String[] args) throws SQLException, IOException {
		Scanner s1=new Scanner(System.in);
		while(true)
		{
			System.out.println("Employee Mgnt Service");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Display Employee");
			System.out.println("Enter Your Choice");
			int x=s1.nextInt();
			switch (x) {
			case 1:
				EmployeeBusiness e1=new EmployeeBusiness();
				e1.add();
				System.out.println("Data inserted ");
				break;
			case 2:
				EmployeeBusiness e2=new EmployeeBusiness();
				e2.delete();


				break;
			case 3:
				EmployeeBusiness e3=new EmployeeBusiness();
				e3.update();


				break;
			case 4:

				EmployeeBusiness e4=new EmployeeBusiness();
				e4.display();

				break;


			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
	}
}
