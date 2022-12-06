package com.moaaz.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.moaaz.models.Draw;

public class DrawDatabase extends DatabaseConnection {

	// return all draws
	public ArrayList<Draw> getAllDraws() throws SQLException {
		ArrayList<Draw> draws = new ArrayList<>();
		connection = createConnection();
		sql = "SELECT * FROM draws";
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		while (result.next()) {
			draws.add(new Draw(result.getInt(1), result.getString(2)));
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
		return draws;
	}

	// insert new draw
	public void insertDraw(Draw draw) throws SQLException {
		connection = createConnection();
		sql = "INSERT INTO draws (name) VALUES (?)";
		s = connection.prepareStatement(sql);
		s.setString(1, draw.getName());
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

	public void deleteDraw(int id) throws SQLException {
		connection = createConnection();
		sql = "DELETE FROM draws WHERE id =?";
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

	public void updateDraw(Draw draw) throws SQLException {
		connection = createConnection();
		sql = "UPDATE draws SET name =? WHERE id=?";
		s = connection.prepareStatement(sql);
		s.setString(1, draw.getName());
		s.setInt(2, draw.getId());
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
