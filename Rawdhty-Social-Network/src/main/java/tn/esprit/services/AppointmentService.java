package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Appointment;




public interface AppointmentService {
	
	List<Appointment>   retrieveAllAppointments();
	Appointment 		   addAppointment(Appointment app);
	void 			   deleteAppointment(String id);
	Appointment 		   updateAppointment(Appointment app);
	Appointment		   retrieveAppointment(String id);

}
