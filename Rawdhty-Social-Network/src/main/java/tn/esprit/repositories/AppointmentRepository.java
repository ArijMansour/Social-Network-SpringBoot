package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Appointment;


@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
