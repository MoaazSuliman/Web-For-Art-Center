package com.moaaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.moaaz.models.Student;
import com.moaaz.service.PictureService;
import com.moaaz.service.StudentService;
import com.moaaz.service.VideoService;
import com.moaaz.service.WordService;
import com.moaaz.validation.StudentValidation;
//import com.moaaz.validations.StudentValidation;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	@Autowired
	WordService wordService;

	StudentValidation validation = new StudentValidation();

	@Autowired
	PictureService picService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "redirect:/rawanCenter";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public String addStudentForm(ModelMap model) {
		model.put("times", wordService.getAllTimes());
//		model.put("errorMsg", "احجز مكانك الان معنا!.");
		return "studentForm";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@RequestParam String name1, @RequestParam String name2, @RequestParam String address,
			@RequestParam String phone, @RequestParam String comeDate, ModelMap model) {
		String string = validation.validStudent(name1, name2, phone, address);
		if (string.equals("")) {
			System.out.println("true Student");
			Student student = new Student(name1, name2, "", address, phone, comeDate);
			studentService.insertStudent(student);
			return "redirect:/rawanCenter";
		}
		model.put("name1", name1);
		model.put("name2", name2);
		model.put("address", address);
		model.put("phone", phone);
		model.put("errorMsg", string);
		model.put("check", 5);
		model.put("times", wordService.getAllTimes());

		return "studentForm";
	}

	@RequestMapping(value = "/rawanCenter", method = RequestMethod.GET)
	public String indexPage(ModelMap model) {
		model.put("draws", wordService.getAllDraws());
		model.put("details", wordService.getAllDetails());
		model.put("courses", wordService.getAllCourses());
		model.put("pics", picService.getAllPic());
		model.put("vLen", new VideoService().getAllVideos().size());
		model.put("videos", new VideoService().getAllVideos());
		return "main";
	}

}
