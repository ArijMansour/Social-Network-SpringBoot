package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.entities.Course;
import tn.esprit.entities.Course_Type;

public interface CourseRepository extends CrudRepository<Course, Long> {

	// =======Oussema Mihoubi=======//

	@Query("SELECT count(*) as nbCourses FROM Course")
	int getCoursesNumber();

	@Query("SELECT count(*) as nbCourses FROM Course c WHERE c.crType= :crType")
	int getCoursesNumberByType(@Param("crType") Course_Type s);

	@Query("SELECT c FROM Course c WHERE c.crType = :crType")
	List<Course> getCoursesByType(@Param("crType") Course_Type s);

	@Query("SELECT c FROM Course c WHERE c.Courses_name = :Courses_name")
	List<Course> getCoursesByName(@Param("Courses_name") String s);

	// ============================//

}
