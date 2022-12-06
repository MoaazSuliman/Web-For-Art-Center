package com.moaaz.database;

public class WordDatabase {

	public CourseDatabase courseDatabase;
	public DrawDatabase drawDatabase;
	public DetailDatabase detailDatabase;
	public TimeDatabase timeDatabase;
	public WordDatabase() {
		this.courseDatabase = new CourseDatabase();
		this.drawDatabase = new DrawDatabase();
		this.detailDatabase = new DetailDatabase();
		this.timeDatabase= new TimeDatabase();
	}
}
