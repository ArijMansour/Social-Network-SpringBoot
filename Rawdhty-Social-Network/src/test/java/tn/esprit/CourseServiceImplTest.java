package tn.esprit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Course;
import tn.esprit.entities.Course_Type;
import tn.esprit.repositories.CourseRepository;
import tn.esprit.services.CourseServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {

	// =======Oussema Mihoubi=======//

	private static final Logger l = LogManager.getLogger(CourseServiceImplTest.class);

	@Autowired
	CourseServiceImpl cs;

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void testretrieveAllCourses() {
		cs.retrieveAllCourses();
	}

	@Test
	public void testAddCourse() throws java.text.ParseException {
		Course cr = new Course("testCourseName5", "testCourseDetails5", Course_Type.Math);
		cs.addCourse(cr);

	}

	@Test
	public void testdeleteCourse() {
		cs.deleteCourse("1");
	}

	@Test
	public void testupdateCourse() {
		Course cr = courseRepository.findById(Long.parseLong("1")).get();
		cr.setCourses_name("NewCourseName");
		cs.addCourse(cr);
	}

	@Test
	public void testretrieveCourse() {
		Course cr = courseRepository.findById(Long.parseLong("1")).get();
		cs.retrieveCourse("1").getClass();
		System.out.println(cr);
	}

	// ============================//

}
