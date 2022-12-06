package com.moaaz.database;

import java.sql.SQLException;
import java.util.ArrayList;

import com.moaaz.models.Video;

public class VideoDatabase extends DatabaseConnection {

	public void insertNewVideo(Video v) throws SQLException {
		sql = "INSERT INTO video (url , detail ) VALUES(?,?)";
		connection = createConnection();
		s = connection.prepareStatement(sql);
		s.setString(1, v.getUrl());
		s.setString(2, v.getDetail());
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

	public void deleteVideo(int id) throws SQLException {
		sql = "DELETE FROM video WHERE  id =?";
		connection = createConnection();
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

	public ArrayList<Video> getAllVideos() throws SQLException {
		sql = "SELECT * FROM video";
		connection = createConnection();
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		ArrayList<Video> vs = new ArrayList<>();
		while (result.next())
			vs.add(new Video(result.getInt(1), result.getString(2), result.getString(3)));
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
		return vs;
	}
}
