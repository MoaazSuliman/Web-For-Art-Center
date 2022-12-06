package com.moaaz.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.moaaz.database.UserDatabase;
import com.moaaz.models.Student;

@Service
public class UserService {
	UserDatabase userd = new UserDatabase();

	public ArrayList<Student> getAllStudetnts() {
		try {
			return userd.getAllStudents();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void deleteStudent(int id) {
		try {
			userd.deleteStudent(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
