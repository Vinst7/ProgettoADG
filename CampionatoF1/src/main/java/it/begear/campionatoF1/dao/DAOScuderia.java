package it.begear.campionatoF1.dao;

import java.util.List;

import it.begear.campionatoF1.model.Scuderia;

public interface DAOScuderia {
void createScuderia(Scuderia scuderia);
	
	Scuderia readScuderia(int id);
	
	void updateScuderia(Scuderia scuderia);
	
	void deleteScuderia(int id);
	
    List<Scuderia> readAll();
    
    void addList();
    }
