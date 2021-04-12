package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Path;
import tn.esprit.repositories.PathRepository;
@Service
public class PathServiceImpl implements PathService
{
@Autowired
PathRepository pathRepository ;
private static final Logger L = LogManager .getLogger(PathServiceImpl.class);

@Override
public List<Path> retrieveAllPaths(){
	List<Path>Paths=(List<Path>)pathRepository.findAll();
	for(Path Path : Paths){
		L.info("Path+++:"+ Path);}
	return Paths;
	}

@Override
public Path addPath(Path Path){
	return pathRepository.save(Path);
}
@Override
public Path updatePath(Path Path){
	return pathRepository.save(Path);
}

@Override
public Path retrievePath(String Path_Id){
	return pathRepository.findById(Long.parseLong(Path_Id)).get();
}

@Override
public void deletePath(String Path_Id) {
	 pathRepository.deleteById(Long.parseLong(Path_Id));
}
}