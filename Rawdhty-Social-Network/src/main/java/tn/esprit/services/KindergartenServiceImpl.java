package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Kindergarten;
import tn.esprit.repositories.KindergartenRepository;

@Service
public class KindergartenServiceImpl  implements KindergartenService
{
	@Autowired
	KindergartenRepository kindergartenRepository;
	private static final Logger L = LogManager.getLogger(KindergartenServiceImpl.class);
	
	@Override
	public List<Kindergarten> retrieveAllKindergartens()
	{
		List<Kindergarten>kindergartens =(List<Kindergarten>)kindergartenRepository.findAll();
		for(Kindergarten kindergarten: kindergartens){
			L.info("kindergarten+++:"+ kindergarten);}
return kindergartens;}

	@Override
	public Kindergarten addkindergarten(Kindergarten Kindergarten){
		return kindergartenRepository.save(Kindergarten);
	}
	
	@Override
	public Kindergarten updatekindergarten(Kindergarten Kindergarten){
		return kindergartenRepository.save(Kindergarten);
	}

	@Override
	public void deleteKindergarten(String Kindergarden_Id){
		 kindergartenRepository.deleteById(Long.parseLong(Kindergarden_Id));
	}

	@Override
	public Kindergarten retrievekindergarten(String Kindergarden_Id ){
		return kindergartenRepository.findById(Long.parseLong(Kindergarden_Id)).get();
	}
}
