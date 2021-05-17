package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Course;
import tn.esprit.entities.Course_Type;

public interface CourseService {

	// =======Oussema Mihoubi=======//

	List<Course> retrieveAllCourses();

	Course addCourse(Course c);

	void deleteCourse(String id);

	Course retrieveCourse(String id);

	String retrieveNbrCourses();

	String retrieveNbrCoursesByType(Course_Type s);

	List<Course> retrieveCoursesByType(Course_Type s);

	// ============================//

}
