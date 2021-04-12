package tn.esprit.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Course;
import tn.esprit.entities.Course_Type;
import tn.esprit.services.CourseService;

@RestController
public class CourseRestController {

	// =======Oussema Mihoubi=======//

	@Autowired
	CourseService courseService;

	// http://localhost:8083/SpringMVC/servlet/retrieve-all-courses
	@GetMapping("/retrieve-all-courses")
	@ResponseBody
	public List<Course> getCourses() {
		List<Course> list = courseService.retrieveAllCourses();
		return list;
	}

	// http://localhost:8083/SpringMVC/servlet/retrieve-course/{course-id}
	@GetMapping("/retrieve-course/{course-id}")
	@ResponseBody
	public Course retrieveCourse(@PathVariable("course-id") String courseId) {
		return courseService.retrieveCourse(courseId);
	}

	// http://localhost:8083/SpringMVC/servlet/add-course
	@PostMapping("/add-course")
	@ResponseBody
	public Course addCourse(@RequestBody Course c) {
		Course course = courseService.addCourse(c);
		return course;
	}

	// http://localhost:8083/SpringMVC/servlet/remove-course/{course-id}
	@DeleteMapping("/remove-course/{course-id}")
	@ResponseBody
	public void removeCourse(@PathVariable("course-id") String courseId) {
		courseService.deleteCourse(courseId);
	}

	// http://localhost:8083/SpringMVC/servlet/modify-course
	@PutMapping("/modify-course")
	@ResponseBody
	public Course modifyCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	// http://localhost:8083/SpringMVC/servlet/courses-nbr
	@GetMapping("/courses-nbr")
	@ResponseBody
	public String getNbrCourses() {
		return courseService.retrieveNbrCourses();
	}

	// http://localhost:8083/SpringMVC/servlet/courses-nbr-type/{Course_Type}
	@GetMapping("/courses-nbr-type/{Course_Type}")
	@ResponseBody
	public String getNbrCoursesByType(@PathVariable("Course_Type") Course_Type s) {
		return courseService.retrieveNbrCoursesByType(s);
	}

	// http://localhost:8083/SpringMVC/servlet/courses-type/{course-type}
	@GetMapping("/courses-type/{course-type}")
	@ResponseBody
	public List<Course> getCoursesByType(@PathVariable("course-type") Course_Type s) {
		return courseService.retrieveCoursesByType(s);
	}

	// ============================//

}
