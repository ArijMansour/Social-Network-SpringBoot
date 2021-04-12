package tn.esprit;

import static org.junit.Assert.assertTrue;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Appointment;
import tn.esprit.entities.Appointment_Place;
import tn.esprit.entities.Appoitnment_Type;
import tn.esprit.services.AppointmentServiceImpl;





@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentServiceImplTest {
	
	@Autowired
	private AppointmentServiceImpl serviceAppointment;
	
	public static final Logger l = LogManager.getLogger(AppointmentServiceImplTest.class);
	
	@Test
	public void testAddAppointment() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-03-31");
		//Appointment appointment = new Appointment(3, date, "About ", Appointment_Place.ADMINISTRATION_OFFICE,Appoitnment_Type.EDUCATIF);
		Appointment appointment = new Appointment(date, "appoinment_Subject", Appointment_Place.ADMINISTRATION_OFFICE, Appoitnment_Type.EDUCATIF);
		assertTrue(appointment.getAppoitnment_place().equals(Appointment_Place.ADMINISTRATION_OFFICE));
		assertTrue(appointment.getAppoitnment_type().equals(Appoitnment_Type.EDUCATIF));
		serviceAppointment.addAppointment(appointment);
	}
	
	@Test
	public void testRetrieveAppointment(){
		serviceAppointment.retrieveAppointment("1");
	}
	
	@Test
	public void testRetrieveAllAppointments(){
		serviceAppointment.retrieveAllAppointments();
	}
	
	@Test
	public void testDeleteAppointment(){
		serviceAppointment.deleteAppointment("3");
	}
	
	
	@Test
	public void testUpdateUser() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-03-07");
		Appointment appointment = new Appointment(date, "appoinment_Subject", Appointment_Place.ADMINISTRATION_OFFICE, Appoitnment_Type.EDUCATIF);
		serviceAppointment.updateAppointment(appointment);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
