package tn.esprit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Role;
import tn.esprit.entities.User;
import tn.esprit.repositories.UserRepository;
import tn.esprit.services.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	// =======Oussema Mihoubi=======//

	private static final Logger l = LogManager.getLogger(UserServiceImplTest.class);

	@Autowired
	UserServiceImpl us;

	@Autowired
	UserRepository userRepository;

	@Test
	public void testretrieveAllUsers() {
		us.retrieveAllUsers();
	}

	@Test
	public void testAddUser() throws java.text.ParseException {
		User u1 = new User("email5", "password5", "firstname5", "lastname5", "adress5", "telephone5", "cin5", "date",
				Role.DOCTOR);
		User u2 = new User("email5", "password5", "firstname5", "lastname5", "adress5", "telephone5", "cin5", "date",
				Role.DOCTOR);
		User u3 = new User("email5", "password5", "firstname5", "lastname5", "adress5", "telephone5", "cin5", "date",
				Role.DOCTOR);
		User u4 = new User("email5", "password5", "firstname5", "lastname5", "adress5", "telephone5", "cin5", "date",
				Role.DOCTOR);
		User u5 = new User("email5", "password5", "firstname5", "lastname5", "adress5", "telephone5", "cin5", "date",
				Role.EDUCATOR);
		User u7 = new User("email7", "password7", "firstname7", "lastname7", "adress7", "telephone7", "cin7", "date",
				Role.EDUCATOR);
		us.addUser(u7);

	}

	@Test
	public void testdeleteUser() {
		us.deleteUser("1");
	}

	@Test
	public void testupdateUser() {
		User u = userRepository.findById(Long.parseLong("2")).get();
		u.setRole(Role.DOCTOR);
		us.addUser(u);
	}

	@Test
	public void testretrieveUser() {
		User u = userRepository.findById(Long.parseLong("1")).get();
		us.retrieveUser("1").getClass();
		System.out.println(u);
	}

	// ============================//

}
