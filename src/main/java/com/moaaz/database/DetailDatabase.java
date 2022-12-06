package com.moaaz.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.moaaz.models.Detail;

public class DetailDatabase extends DatabaseConnection {

	// return all details
	public ArrayList<Detail> getAllDetails() throws SQLException {
		ArrayList<Detail> details = new ArrayList<>();
		connection = createConnection();
		sql = "SELECT * FROM details ";
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		while (result.next()) {
			details.add(new Detail(result.getInt(1), result.getString(2)));
		}
		connection.close();
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
		return details;

	}

	// insert new detail
	public void insertDetail(Detail detail) throws SQLException {
		connection = createConnection();
		sql = "INSERT INTO details (name) VALUES (?)";
		s = connection.prepareStatement(sql);
		s.setString(1, detail.getName());
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

	public void deleteDetail(int id) throws SQLException {
		connection = createConnection();
		sql = "DELETE FROM details WHERE id =?";
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

	public void updateDetail(Detail detail) throws SQLException {
		connection = createConnection();
		sql = "UPDATE details SET name =? WHERE id=?";
		s = connection.prepareStatement(sql);
		s.setString(1, detail.getName());
		s.setInt(2, detail.getId());
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
