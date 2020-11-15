package it.begear.campionatoF1.dao;

import java.util.List;

import it.begear.campionatoF1.model.Ingegneri;

public interface DAOIngegneri {
	
	void createIngegnere(Ingegneri ing);
	Ingegneri readIngegnere(int id);
	List<Ingegneri> realdAll();
	void updateIngegnere(Ingegneri ing);
	void deleteIngegnere(int id);
    void addList();

}
