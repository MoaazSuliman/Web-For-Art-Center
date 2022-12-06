package com.moaaz.models;

public class Student {
	private int id;
	private String name1;
	private String name2;
	private String date;
	private String address;
	private String phone;
	private String comeDate;

	public Student(int id, String name, String name2,String date, String address, String phone, String comeDate ) {
		this.id = id;
		this.name1 = name;
		this.date = date;
		this.address = address;
		this.phone = phone;
		this.comeDate = comeDate;
		this.name2 = name2;
	}

	public Student(String name, String name2, String date, String address, String phone, String comeDate) {
		this.name1 = name;
		this.date = date;
		this.address = address;
		this.phone = phone;
		this.comeDate = comeDate;
		this.name2 = name2;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name1;
	}

	public void setName(String name) {
		this.name1 = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComeDate() {
		return comeDate;
	}

	public void setComeDate(String comeDate) {
		this.comeDate = comeDate;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name1 + ", date=" + date + ", address=" + address + ", phone=" + phone
				+ ", comeDate=" + comeDate + "]";
	}

}
