package com.moaaz.database;

import java.sql.SQLException;

import com.moaaz.models.Student;

public class StudentDatabase extends DatabaseConnection {

	public void insertStudent(Student student) throws SQLException {
		connection = createConnection();
		sql = "INSERT INTO student (name1 ,name2, date , address, phone , comeDate) VALUES(?,?,?,?,?,?)";
		s = connection.prepareStatement(sql);
		s.setString(1, student.getName());
		s.setString(2, student.getName2());
		s.setString(3, new com.moaaz.service.Method().getDate());
		s.setString(4, student.getAddress());
		s.setString(5, student.getPhone());
		s.setString(6, student.getComeDate());
		s.execute();
		try {
			if (result != null)
				result.close();
		} catch (Exception e) {
		}
		;
		try {
			if (s != null)
				s.close();
		} catch (Exception e) {
		}
		;
		try {
			if (connection != null)
				connection.close();
		} catch (Exception e) {
		}
		;
	}

//	public boolean checkIfStudentWasHere(Student student) throws SQLException {
//		connection = createConnection();
//		sql = "SELECT * FROM student WHERE  name = ? , address=? , phone =? ";
//		s = connection.prepareStatement(sql);
//		result = s.executeQuery();
//		if (result.next())
//			return true;
//		return false;
//	}
}
