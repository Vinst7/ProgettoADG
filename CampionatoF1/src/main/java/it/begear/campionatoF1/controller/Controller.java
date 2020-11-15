package it.begear.campionatoF1.controller;


import it.begear.campionatoF1.dao.DAOIngegneriImpl;
import it.begear.campionatoF1.dao.DAOMeccaniciImpl;
import it.begear.campionatoF1.dao.DAOPilotiImpl;
import it.begear.campionatoF1.dao.DAOScuderiaImpl;
import it.begear.campionatoF1.dao.DAOTeamManagerImpl;
import it.begear.campionatoF1.repository.TMRepository;

public class Controller {

	public static void main(String[] args) {
//		try {
//			String url="jdbc:mysql://localhost:3306/DatabaseF1?useSSL=false&serverTimezone=UTC";
//			String user="root";
//			String pass="root";
//			Connection connection= DriverManager.getConnection(url, user, pass);
//			System.out.println("Stai connesso");
//			
//		} catch (SQLException e) {
//			System.out.println("error");
//		}
		
		DAOIngegneriImpl.getInstance().addList();
		DAOMeccaniciImpl.getInstance().addList();
		DAOPilotiImpl.getInstance().addList();
		DAOScuderiaImpl.getInstance().addList();
		DAOTeamManagerImpl.getInstance().addList();

		
		//TMRepository.ComposizioneTeam();
		TMRepository.lineUpPiloti();
		TMRepository.ScadenzaCont();
//		TMRepository.ComposizioneTeam(p6, s);
		
//		TMRepository.MondTecn();
		

	}

}
