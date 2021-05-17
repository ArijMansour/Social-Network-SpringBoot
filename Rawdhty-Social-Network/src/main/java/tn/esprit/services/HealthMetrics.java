package tn.esprit.services;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthMetrics implements HealthIndicator {

	@Override
	public Health health() {
		return checkInternet() == true ? Health.up().withDetail("success code", "Rawdhaty-social-Network is Active on an Internet Connection").build()
				: Health.down().withDetail("error code", "Rawdhaty-social-Network is InActive on an Internet Connection").build();

	}

	private boolean checkInternet() {  //check internet connection 
		boolean flag = false;
		try {
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
}
