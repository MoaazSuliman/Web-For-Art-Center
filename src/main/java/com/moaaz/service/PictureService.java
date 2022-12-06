package com.moaaz.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;

import org.springframework.stereotype.Service;

import com.moaaz.database.PictureDatabase;
import com.moaaz.models.Picture;

@Service
public class PictureService {

	PictureDatabase picDatabase = new PictureDatabase();

	public void deletePic(int id) {
		try {
			picDatabase.deletePic(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insertPic(Picture pic) {
		try {
			picDatabase.insertPic(pic);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Picture> getAllPic() {
		try {
			return picDatabase.getAllPictures();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}



}
