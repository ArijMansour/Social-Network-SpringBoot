package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Course;
import tn.esprit.entities.Course_Type;
import tn.esprit.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	// =======Oussema Mihoubi=======//

	@Autowired
	CourseRepository courseRepository;

	private static final Logger L = LogManager.getLogger(CourseServiceImpl.class);

	@Override
	public List<Course> retrieveAllCourses() {
		List<Course> courses = (List<Course>) courseRepository.findAll();
		for (Course course : courses) {
			L.info("course +++ : " + course);
		}
		return courses;
	}

	@Override
	public Course addCourse(Course c) {
		return courseRepository.save(c);
	}

	@Override
	public void deleteCourse(String id) {
		courseRepository.deleteById(Long.parseLong(id));
	}

	@Override
	public Course retrieveCourse(String id) {
		return courseRepository.findById(Long.parseLong(id)).get();
	}

	@Override
	public String retrieveNbrCourses() {
		Long nbCourses = Long.valueOf(courseRepository.getCoursesNumber());
		if ( nbCourses > 1) {
			return "The number of courses is: " + nbCourses + " Courses";
		}
		else
			return "The number of courses is: " + nbCourses + " Course";
	}

	@Override
	public String retrieveNbrCoursesByType(Course_Type s) {
		Long nbCourses = Long.valueOf(courseRepository.getCoursesNumberByType(s));
		if ( nbCourses > 1) {
			return "The number of desired courses is: " + nbCourses + " " + s + " Courses";
		}
		else
			return "The number of desired courses is: " + nbCourses + " " + s + " Course";
	}

	@Override
	public List<Course> retrieveCoursesByType(Course_Type s) {

		return courseRepository.getCoursesByType(s);
	}

	// ============================//

}
