package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repositories.ChildRepository;
import tn.esprit.services.ChildServiceImpl;
import tn.esprit.entities.Child;

@Service
public class ChildServiceImpl implements ChildService {
	
	@Autowired
	ChildRepository ChildRepository;
	
	private static final Logger L =LogManager.getLogger(ChildServiceImpl.class);

	@Override
	public List<Child> retrieveAllChildren(){
     List<Child> Childs =(List<Child>)ChildRepository.findAll();
     for(Child Child : Childs){
    	 L.info("Child+++:"+ Child);}
     return Childs;}	
	@Override
	public Child addChild(Child Child){
		return ChildRepository.save(Child);
	}
	@Override
	public Child updateChild(Child Child){
		return ChildRepository.save(Child);
		
	}
	@Override
	public void deleteChild(String Child_ID){
		ChildRepository.deleteById(Long.parseLong(Child_ID));
	}
    @Override
    public Child retrieveChild(String Child_ID ){
    	return ChildRepository.findById(Long.parseLong(Child_ID)).get();
    }

}
