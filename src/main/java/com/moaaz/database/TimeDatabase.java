package com.moaaz.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.moaaz.models.Time;

public class TimeDatabase extends DatabaseConnection {

	public void insertTime(Time time) throws SQLException {
		connection = createConnection();
		sql = "INSERT INTO time (name) VALUES (?)";
		s = connection.prepareStatement(sql);
		s.setString(1, time.getName());
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

	public void deleteTime(int id) throws SQLException {
		connection = createConnection();
		sql = "DELETE FROM time WHERE id=?";
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

	public ArrayList<Time> getAllTimes() throws SQLException {
		ArrayList<Time> times = new ArrayList<>();
		connection = createConnection();
		sql = "SELECT * FROM time ";
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		while (result.next())
			times.add(new Time(result.getInt(1), result.getString(2)));
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
		return times;
	}

	public void updateTime(Time time) throws SQLException {
		connection = createConnection();
		sql = "UPDATE time SET name =? WHERE id=?";
		s = connection.prepareStatement(sql);
		s.setString(1, time.getName());
		s.setInt(2, time.getId());
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
