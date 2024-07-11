package com.democurd.operation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.demomdeo.EmployeeBisiness;

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
				EmployeeBisiness e1=new EmployeeBisiness();
				e1.add();
				System.out.println("Data inserted ");
				break;
			case 2:
				EmployeeBisiness e2=new EmployeeBisiness();
				e2.delete();


				break;
			case 3:
				EmployeeBusiness e3=new EmployeeBusiness();
				e3.update();


				break;
			case 4:

				EmployeeBisiness e4=new EmployeeBisiness();
				e4.display();

				break;


			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
	}
}
