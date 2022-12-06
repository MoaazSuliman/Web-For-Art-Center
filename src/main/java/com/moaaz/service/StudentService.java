package com.moaaz.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.moaaz.database.StudentDatabase;
import com.moaaz.models.Student;

@Service
public class StudentService {

	StudentDatabase studentd = new StudentDatabase();

	public void insertStudent(Student student) {
		try {
			studentd.insertStudent(student);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
