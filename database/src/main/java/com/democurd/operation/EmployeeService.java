package com.democurd.operation;

import java.io.IOException;
import java.sql.SQLException;

public interface EmployeeService {
	void add() throws SQLException,IOException;
	void display()throws SQLException,IOException;
	void update();
	void delete();

}
