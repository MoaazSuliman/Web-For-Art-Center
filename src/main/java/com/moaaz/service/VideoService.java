package com.moaaz.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.moaaz.database.VideoDatabase;
import com.moaaz.models.Video;

@Service
public class VideoService {

	private VideoDatabase videoDatabase = new VideoDatabase();

	public void addVideo(Video v) {
		try {
			videoDatabase.insertNewVideo(v);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void delteVideo(int id) {
		try {
			videoDatabase.deleteVideo(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public ArrayList<Video> getAllVideos() {
		try {
			return videoDatabase.getAllVideos();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
