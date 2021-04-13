package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Path;

public interface PathService {
	List<Path> retrieveAllPaths();
	Path addPath(Path Path);
	Path updatePath(Path Path);
	Path retrievePath(String Path_Id);
	void deletePath(String Path_Id);

}
