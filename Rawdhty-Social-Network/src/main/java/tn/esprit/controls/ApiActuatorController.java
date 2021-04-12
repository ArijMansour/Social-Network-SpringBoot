package tn.esprit.controls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot-actuator")
public class ApiActuatorController {

	@GetMapping("/test")
	public String testEndPoint() {
		return "PiDev-Social Network  actuator example";
	}
}