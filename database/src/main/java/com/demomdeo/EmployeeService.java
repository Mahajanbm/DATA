package com.demomdeo;

import java.io.IOException;
import java.sql.SQLException;

public interface EmployeeService {
	void add() throws SQLException,IOException;
	void display()throws SQLException,IOException;
	void update()throws SQLException,IOException;
	void delete() throws SQLException,IOException;

}
