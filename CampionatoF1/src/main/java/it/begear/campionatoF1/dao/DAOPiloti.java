package it.begear.campionatoF1.dao;

import java.util.List;

import it.begear.campionatoF1.model.Piloti;

public interface DAOPiloti {
void createPiloti(Piloti p);
	
	Piloti readPiloti(int id);
	
	void updatePiloti(Piloti p);
	
	void deletePiloti(int id);
	
    List<Piloti> readAll();
}
