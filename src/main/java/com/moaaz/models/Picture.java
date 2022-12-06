package com.moaaz.models;

public class Picture {

	private int id;
	private String desc;
	private String url;

	public Picture(int id, String desc, String url) {
		this.id = id;
		this.desc = desc;
		this.url = url;
	}

	public Picture(String desc, String url) {
		this.desc = desc;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
