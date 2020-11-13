package it.begear.campionatoF1.dao;

import java.util.List;

import it.begear.campionatoF1.model.Teammanager;

public interface DAOTeamManager {

void createTeamManager(Teammanager tm);
	
	Teammanager readTeamManager(int id);
	
	void updateTeamManager(Teammanager tm);
	
	void deleteTeamManager(int id);
	
    List<Teammanager> readAll();
}
