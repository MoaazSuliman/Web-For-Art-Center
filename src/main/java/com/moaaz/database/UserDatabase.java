package com.moaaz.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.moaaz.models.Student;

public class UserDatabase extends DatabaseConnection {

	public ArrayList<Student> getAllStudents() throws SQLException {
		ArrayList<Student> students = new ArrayList<>();
		connection = createConnection();
		sql = "SELECT * FROM student";
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		while (result.next())
			students.add(new Student(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
					result.getString(5), result.getString(6), result.getString(7)));
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
		return students;

	}

	public void deleteStudent(int id) throws SQLException {
		connection = createConnection();
		sql = "DELETE FROM student WHERE id =?";
		s = connection.prepareStatement(sql);
		s.setInt(1, id);
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
}
