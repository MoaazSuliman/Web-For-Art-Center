package com.moaaz.validation;

public class StudentValidation {

	public String validStudent(String name, String name2, String phone, String address) {
		if (!validName(name))
			return "ادخل الاسم";
		if (!validName(name2))
			return "ادخل اسم العائلة";
		if (!validPhone(phone))
			return "تاكد من صحة رقم الهاتف";
		if (address.equals(""))
			return "ادخل العنوان";
		return "";
	}

	private boolean validName(String string) {
		return (string.equals("")) ? false : true;
	}

	// valid phone for palestene
	private boolean validPhone(String string) {
		int len = string.length();
		System.out.println(string);
		if (string.charAt(0) == '0' && string.charAt(1) == '0' && len == 14)
			return true;
		if (string.charAt(0) == '+' && len == 13)
			return true;
		if (string.charAt(0) == '0' && string.charAt(1) == '5' && len == 10)
			return true;
		return false;
	}
}
