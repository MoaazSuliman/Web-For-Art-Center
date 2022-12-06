package com.moaaz.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.moaaz.models.Course;

public class CourseDatabase extends DatabaseConnection {

	// return all courses
	public ArrayList<Course> getAllCourses() throws SQLException {
		ArrayList<Course> courses = new ArrayList<>();
		connection = createConnection();
		sql = "SELECT * FROM courses ";
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		while (result.next()) {
			courses.add(new Course(result.getInt(1), result.getString(2)));
		}
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
		return courses;

	}

	// insert new course
	public void insertCourse(Course course) throws SQLException {
		connection = createConnection();
		sql = "INSERT INTO courses (name) VALUES (?)";
		s = connection.prepareStatement(sql);
		s.setString(1, course.getName());
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

	public void deleteCourse(int id) throws SQLException {
		connection = createConnection();
		sql = "DELETE FROM courses WHERE id =?";
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

	public void updateCourse(Course course) throws SQLException {
		connection = createConnection();
		sql = "UPDATE courses SET name =? WHERE id=?";
		s = connection.prepareStatement(sql);
		s.setString(1, course.getName());
		s.setInt(2, course.getId());
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
