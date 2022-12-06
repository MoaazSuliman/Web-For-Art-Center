package com.moaaz.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.moaaz.database.WordDatabase;
import com.moaaz.models.Course;
import com.moaaz.models.Detail;
import com.moaaz.models.Draw;
import com.moaaz.models.Time;

@Service
public class WordService {

	WordDatabase wordD = new WordDatabase();

	/* get All */
	public ArrayList<Course> getAllCourses() {
		try {

			return wordD.courseDatabase.getAllCourses();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	public ArrayList<Detail> getAllDetails() {
		try {

			return wordD.detailDatabase.getAllDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	public ArrayList<Draw> getAllDraws() {
		try {

			return wordD.drawDatabase.getAllDraws();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	public ArrayList<Time> getAllTimes() {
		try {
			return wordD.timeDatabase.getAllTimes();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	/* insert all */

	public void insertDraw(Draw draw) {
		try {
			wordD.drawDatabase.insertDraw(draw);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void insertDetail(Detail detail) {
		try {
			wordD.detailDatabase.insertDetail(detail);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void insertCourse(Course course) {
		try {
			wordD.courseDatabase.insertCourse(course);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void insertTime(Time time) {
		try {
			wordD.timeDatabase.insertTime(time);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	/* delete all */
	public void deleteDraw(int id) {
		try {
			wordD.drawDatabase.deleteDraw(id);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void deleteDetail(int id) {
		try {
			wordD.detailDatabase.deleteDetail(id);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void deleteCourse(int id) {
		try {
			wordD.courseDatabase.deleteCourse(id);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void deleteTime(int id) {
		try {
			wordD.timeDatabase.deleteTime(id);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	/* update all */
	public void updateDraw(Draw draw) {
		try {
			wordD.drawDatabase.updateDraw(draw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateDetail(Detail detail) {
		try {
			wordD.detailDatabase.updateDetail(detail);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateTime(Time time) {
		try {
			wordD.timeDatabase.updateTime(time);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateCourse(Course course) {
		try {
			wordD.courseDatabase.updateCourse(course);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
