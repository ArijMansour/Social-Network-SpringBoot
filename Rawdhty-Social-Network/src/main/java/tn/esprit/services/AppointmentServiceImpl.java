package tn.esprit.services;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Appointment;
import tn.esprit.repositories.AppointmentRepository;




@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	public static final Logger l = LogManager.getLogger(AppointmentServiceImpl.class);

	@Override
	public List<Appointment> retrieveAllAppointments() {
		List<Appointment> appointments = (List<Appointment>) appointmentRepository.findAll();
		for (Appointment appointment : appointments){
			l.info("appointment +++ : " + appointment);
		}
		return appointments ;
	}

	@Override
	public Appointment addAppointment(Appointment app) {
		return appointmentRepository.save(app);
	}

	@Override
	public void deleteAppointment(String id) {
		appointmentRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public Appointment updateAppointment(Appointment app) {
		return appointmentRepository.save(app);
	}

	@Override
	public Appointment retrieveAppointment(String id) {
		Appointment appoi = appointmentRepository.findById(Long.parseLong(id)).get();
		l.info("appointment returned :" + appoi);
		 return appoi;
	}

	

}
