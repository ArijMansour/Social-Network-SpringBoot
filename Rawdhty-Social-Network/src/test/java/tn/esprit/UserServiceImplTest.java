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

	//@Test
	//public void testAddUser() throws java.text.ParseException {
	//	User u = new User("email3", "password3", "firstname3", "lastname3", "adress3", "telephone3", "cin3", "date",
		//		Role.PARENT);
	//	us.addUser(u);

//	}

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
