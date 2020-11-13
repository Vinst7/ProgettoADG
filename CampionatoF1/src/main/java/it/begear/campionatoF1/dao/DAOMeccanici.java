package it.begear.campionatoF1.dao;

import java.util.List;

import it.begear.campionatoF1.model.Meccanici;


public interface DAOMeccanici {
void createMeccanici(Meccanici m);
	
	Meccanici readMeccanici(int id);
	
	void updateMeccanici(Meccanici m);
	
	void deleteMeccanici(int id);
	
    List<Meccanici> readAll();
}
