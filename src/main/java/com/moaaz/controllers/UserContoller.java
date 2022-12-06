package com.moaaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moaaz.models.Course;
import com.moaaz.models.Detail;
import com.moaaz.models.Draw;
import com.moaaz.models.Picture;
import com.moaaz.models.Time;
import com.moaaz.models.Video;
import com.moaaz.service.PictureService;
import com.moaaz.service.UserService;
import com.moaaz.service.VideoService;
import com.moaaz.service.WordService;

@Controller
public class UserContoller {

	@Autowired
	UserService userService;
	@Autowired
	WordService wordService;
	@Autowired
	PictureService picService;
	@Autowired
	VideoService videoService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String goToUserDashboard(ModelMap model) {
		model.put("students", userService.getAllStudetnts());
		model.put("draws", wordService.getAllDraws());
		model.put("courses", wordService.getAllCourses());
		model.put("details", wordService.getAllDetails());
		model.put("times", wordService.getAllTimes());
		model.put("pics", picService.getAllPic());
		model.put("videos", videoService.getAllVideos());
		
		return "table";
	}

	/* Student */
	@RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.GET)
	public String deleteStudent(@PathVariable int id) {
		userService.deleteStudent(id);
		return "redirect:/admin";
	}

	/****************** end of students************************* */

	/* Draw */
	@RequestMapping(value = "/addDraw", method = RequestMethod.POST)
	public String insertDraw(@RequestParam String name) {
		wordService.insertDraw(new Draw(0, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/updateDraw", method = RequestMethod.POST)
	public String updateDraw(@RequestParam int id, @RequestParam String name) {
		wordService.updateDraw(new Draw(id, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/deleteDraw/{id}", method = RequestMethod.GET)
	public String delteDraw(@PathVariable int id) {
		wordService.deleteDraw(id);
		return "redirect:/admin";
	}

	/****************** end of draw ************************* */

	/* Course */
	@RequestMapping(value = "/addCourse", method = RequestMethod.POST)
	public String insertCourse(@RequestParam String name) {
		wordService.insertCourse(new Course(0, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/updateCourse", method = RequestMethod.POST)
	public String updateCourse(@RequestParam int id, @RequestParam String name) {
		wordService.updateCourse(new Course(id, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/deleteCourse/{id}", method = RequestMethod.GET)
	public String delteCourse(@PathVariable int id) {
		wordService.deleteCourse(id);
		return "redirect:/admin";
	}

	/****************** end of detail ************************* */

	/* Detail */
	@RequestMapping(value = "/addDetail", method = RequestMethod.POST)
	public String insertDetail(@RequestParam String name) {
		wordService.insertDetail(new Detail(0, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/updateDetail", method = RequestMethod.POST)
	public String updateDetail(@RequestParam int id, @RequestParam String name) {
		wordService.updateDetail(new Detail(id, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/deleteDetail/{id}", method = RequestMethod.GET)
	public String delteDetail(@PathVariable int id) {
		wordService.deleteDetail(id);
		return "redirect:/admin";
	}

	/****************** end of detail ************************* */

	/* Time */
	@RequestMapping(value = "/addTime", method = RequestMethod.POST)
	public String insertTime(@RequestParam String name) {
		wordService.insertTime(new Time(0, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/updateTime", method = RequestMethod.POST)
	public String updateTime(@RequestParam int id, @RequestParam String name) {
		wordService.updateTime(new Time(id, name));
		return "redirect:/admin";
	}

	@RequestMapping(value = "/deleteTime/{id}", method = RequestMethod.GET)
	public String deleteTime(@PathVariable int id) {
		wordService.deleteTime(id);
		return "redirect:/admin";
	}

	/****************** end of detail ************************* */

	/* Pictures */
	@RequestMapping(value = "/addPicture", method = RequestMethod.POST)
	public String addPicture(@RequestParam String desc, @RequestParam String url) {
		Picture pic = new Picture(desc, url);
		picService.insertPic(pic);
		return "redirect:/admin";
	}

	@RequestMapping(value = "/deletePicture/{id}", method = RequestMethod.GET)
	public String addPicture(@PathVariable int id) {
		picService.deletePic(id);
		return "redirect:/admin";
	}

	/*********** Videos ***********/
	@RequestMapping(value = "/addVideo", method = RequestMethod.POST)
	public String addVideo(@RequestParam String url, @RequestParam String detail) {
		Video v = new Video(url, detail);
		videoService.addVideo(v);
		return "redirect:/admin";
	}

	@RequestMapping(value = "/deleteVideo/{id}", method = RequestMethod.GET)
	public String deleteVideo(@PathVariable int id) {
		videoService.delteVideo(id);
		return "redirect:/admin";
	}

}