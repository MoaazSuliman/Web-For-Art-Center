package com.moaaz.models;

public class Video {

	private int id;
	private String url;
	private String detail;

	public Video(int id, String url, String detail) {
		super();
		this.id = id;
		this.url = url;
		this.detail = detail;
	}

	public Video(String url, String detail) {
		super();
		this.url = url;
		this.detail = detail;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

}
