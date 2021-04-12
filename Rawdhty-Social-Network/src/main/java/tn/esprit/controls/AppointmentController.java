package tn.esprit.controls;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Appointment;
import tn.esprit.services.AppointmentServiceImpl;



@RestController
public class AppointmentController {
	
	@Autowired
	private AppointmentServiceImpl serviceAppointment;
	
	
	//find all Appointments
		// http://localhost:8083/SpringMVC/servlet/get-all-Appointments
		
		
		@GetMapping(value = "/get-all-Appointments")
		@ResponseBody
			public List<Appointment> findAllAppointments(){
				List<Appointment> list = serviceAppointment.retrieveAllAppointments();
				return list;
			}
		
		
		//save an Appointment 
		   // http://localhost:8083/SpringMVC/servlet/addAppointment
		
		@PostMapping(value = "/addAppointment")
		public Appointment addAppointment(@RequestBody Appointment appointment){
			System.out.println("Appointment added in data base .....");
			serviceAppointment.addAppointment(appointment);
			return appointment;
		}
		
		//UpdateAppointments
		// http://localhost:8083/SpringMVC/servlet/addAppointment
		
		
		@PutMapping(value = "/updateAppointment")
		public Appointment updateAppointment(@RequestBody Appointment appointment){
			return serviceAppointment.updateAppointment(appointment);
			
		}
		
		// delete an Appointment
		// http://localhost:8083/SpringMVC/servlet/deleteAppointment

		
		@DeleteMapping("deleteAppointment")
		public String deleteAppointment(@RequestParam String id){
			
			serviceAppointment.deleteAppointment(id);
			return "Appointment Deleted ....";
			
		}
		
		
		// findOneAppointment
		
			@GetMapping(value = "/retrieve-Appointment/{Appointment-id}")
			@ResponseBody
			public Appointment findAppointment(@PathVariable("Appointment-id") String Id){
				return serviceAppointment.retrieveAppointment(Id);
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
