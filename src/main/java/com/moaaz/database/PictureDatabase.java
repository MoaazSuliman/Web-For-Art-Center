package com.moaaz.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.moaaz.models.Picture;

public class PictureDatabase extends DatabaseConnection {

	public void insertPic(Picture pic) throws SQLException {
		connection = createConnection();
		sql = "INSERT INTO picture (description , url ) VALUES (?,?)";
		s = connection.prepareStatement(sql);
		s.setString(1, pic.getDesc());
		s.setString(2, pic.getUrl());
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

	public void deletePic(int id) throws SQLException {
		connection = createConnection();
		sql = "DELETE FROM picture WHERE id =?";
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

	public ArrayList<Picture> getAllPictures() throws SQLException {
		ArrayList<Picture> pics = new ArrayList<>();
		connection = createConnection();
		sql = "SELECT * FROM picture ";
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		while (result.next())
			pics.add(new Picture(result.getInt(1), result.getString(2), result.getString(3)));
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
		return pics;
	}

}
