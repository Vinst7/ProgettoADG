package it.begear.campionatoF1.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import it.begear.campionatoF1.dao.DAOIngegneri;
import it.begear.campionatoF1.dao.DAOIngegneriImpl;
import it.begear.campionatoF1.dao.DAOMeccanici;
import it.begear.campionatoF1.dao.DAOMeccaniciImpl;
import it.begear.campionatoF1.dao.DAOPiloti;
import it.begear.campionatoF1.dao.DAOPilotiImpl;
import it.begear.campionatoF1.dao.DAOScuderia;
import it.begear.campionatoF1.dao.DAOScuderiaImpl;
import it.begear.campionatoF1.model.Ingegneri;
import it.begear.campionatoF1.model.Meccanici;
import it.begear.campionatoF1.model.Piloti;
import it.begear.campionatoF1.model.Scuderia;
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

	    Scuderia s = new Scuderia(1,"FERRARI");
		Scuderia s1 = new Scuderia(2,"Maserati");
		
		Piloti p = new Piloti(1,"Andrea", "Iannone", 1999, "ITA", 4, 2000,1 );
		Piloti p2 = new Piloti(2, "pippo", "Lombardi", 1980,"Ita" , 2, 100, 1);
		Piloti p3= new Piloti( 3,"pippo", "Tucu", 1990,"TED" , 1, 100, 1);
		Piloti p4= new Piloti(4, "pippo", "Kegu", 1970,"RUSS" , 7, 100, 2);
		Piloti p5= new Piloti(5, "pippo", "Lopu", 1990,"SUDAFR" , 2, 100, 2);
		Piloti p6 = new Piloti( 6,"pippo", "Fischio", 1990,"ING" , 9, 100, 2);
	    
	    Ingegneri i = new Ingegneri(1,"Adrea", "Filippei",1992, "ITA", 2, 500, 1);
	    Ingegneri i2 = new Ingegneri(2,"Rodrigo", "Mina",1992, "ENG", 4, 900, 1);
	    Ingegneri i3 = new Ingegneri(3,"Pippo", "Baudo",1997, "ESP", 6, 100, 1);
	    Ingegneri i4 = new Ingegneri(4,"Vincenzo", "Cruijf",1996, "NED", 1, 600, 1);
	    Ingegneri i5 = new Ingegneri(5,"Alfredo", "Shaquiri",1994, "SVZ", 12,900, 1);
	    Ingegneri i6 = new Ingegneri(6,"Mattia", "Punzo",1995, "ITA", 5, 200, 1);
	    Ingegneri i7 = new Ingegneri(7,"Fabiano", "Santacroce",1992, "ITA", 2, 500, 2);
	    Ingegneri i8 = new Ingegneri(8,"Lorenzo", "Insigne",1992, "ITA", 8, 500, 2);
	    Ingegneri i9 = new Ingegneri(9,"Roberto", "Insigne",1990, "GER", 4, 400, 2);
	    Ingegneri i10 = new Ingegneri(10,"Amato", "Ciciretti",1998, "ITA", 6, 600, 2);
	    Ingegneri i11 = new Ingegneri(11,"Rodrigo", "Taddei",1990, "ESP", 9, 800, 2);
	    Ingegneri i12 = new Ingegneri(12,"Sebastian", "Gonalons",1991, "ITA", 1, 500, 2);
	    
	    Meccanici m = new Meccanici(1,"Armando", "Izzo", 1990, "ITA", 5, 800, 1);
	    Meccanici m2 = new Meccanici(2,"Armando", "Blasi", 1990, "ITA", 2, 900, 1);
	    Meccanici m3 = new Meccanici(3,"Amin", "Younes", 1992, "GER", 6, 800, 1);
	    Meccanici m4 = new Meccanici(4,"Rocco", "Barocco", 1995, "ITA", 5, 500, 1);
	    Meccanici m5 = new Meccanici(5,"Thiago", "Mendes", 1996, "ESP", 1, 700, 1);
	    Meccanici m6 = new Meccanici(6,"Redi", "Komper", 1997, "NED", 2, 800, 1);
	    Meccanici m7 = new Meccanici(7,"Heugh", "Son", 1998, "KOR", 4, 800, 1);
	    Meccanici m8 = new Meccanici(8,"Claudio", "Moneta", 1992, "ITA", 7, 800, 1);
	    Meccanici m9 = new Meccanici(10,"Giuseppe", "Di palma", 1991, "GIA", 8, 800, 1);
	    Meccanici m10 = new Meccanici(11,"Franco", "Punzo", 1990, "ITA", 9, 800, 1);
	    Meccanici m11 = new Meccanici(12,"Gino", "Lipo", 1990, "ITA", 10, 800, 2);
	    Meccanici m12 = new Meccanici(13,"Sebastiano", "Pillo", 1994, "ITA", 5, 800, 2);
	    Meccanici m13 = new Meccanici(14,"Gennaro", "Esposito", 1995, "ITA", 12, 800, 2);
	    Meccanici m14 = new Meccanici(15,"Reti", "Asamoah", 1992, "GHN", 6, 800, 2);
	    Meccanici m15 = new Meccanici(16,"Diego", "Esposito", 1999, "ITA", 2, 800, 2);
	    Meccanici m16 = new Meccanici(17,"Frito", "Misto", 1991, "ITA", 4, 800, 2);
	    Meccanici m17 = new Meccanici(18,"Diego", "Paolo", 1991, "ITA", 8, 800, 2);
	    Meccanici m18 = new Meccanici(19,"Xin", "Xon", 1990, "CIN", 2, 800, 2);
	    Meccanici m19 = new Meccanici(20,"Lorenzo", "Colera", 1990, "ITA", 5, 800, 2);
	    Meccanici m20 = new Meccanici("Pirlo", "Pirla", 1993, "ITA", 5, 800, 2);
		
		DAOPiloti pil = new DAOPilotiImpl().getInstance();
		DAOScuderia scu = new DAOScuderiaImpl().getInstance();
		DAOIngegneri ing = new DAOIngegneriImpl().getInstance();
		DAOMeccanici mecc = new DAOMeccaniciImpl().getInstance();
		
//		mecc.createMeccanici(m);
//		mecc.createMeccanici(m2);
//		mecc.createMeccanici(m3);
//		mecc.createMeccanici(m4);
//		mecc.createMeccanici(m5);
//		mecc.createMeccanici(m6);
//		mecc.createMeccanici(m7);
//		mecc.createMeccanici(m8);
//		mecc.createMeccanici(m9);
//		mecc.createMeccanici(m10);
//		mecc.createMeccanici(m11);
//		mecc.createMeccanici(m12);
//		mecc.createMeccanici(m13);
//		mecc.createMeccanici(m14);
//		mecc.createMeccanici(m15);
//		mecc.createMeccanici(m16);
//		mecc.createMeccanici(m17);
//		mecc.createMeccanici(m18);
//		mecc.createMeccanici(m19);
//		mecc.createMeccanici(m20);
		
//		ing.createIngegnere(i);
//		ing.createIngegnere(i2);
//		ing.createIngegnere(i3);
//		ing.createIngegnere(i4);
//		ing.createIngegnere(i5);
//		ing.createIngegnere(i6);
//		ing.createIngegnere(i7);
//		ing.createIngegnere(i8);
//		ing.createIngegnere(i9);
//		ing.createIngegnere(i10);
//		ing.createIngegnere(i11);
//		ing.createIngegnere(i12);
		
//		scu.createScuderia(s);
//		scu.createScuderia(s1);
		

		TMRepository.getListaPiloti().add(p);
		TMRepository.getListaPiloti().add(p2);
		TMRepository.getListaPiloti().add(p3);
		TMRepository.getListaPiloti().add(p4);
		TMRepository.getListaPiloti().add(p5);
		TMRepository.getListaPiloti().add(p6);
		
		TMRepository.getListaMecc().add(m);
		TMRepository.getListaMecc().add(m2);
		TMRepository.getListaMecc().add(m3);
		TMRepository.getListaMecc().add(m4);
		TMRepository.getListaMecc().add(m5);
		TMRepository.getListaMecc().add(m6);
		TMRepository.getListaMecc().add(m7);
		TMRepository.getListaMecc().add(m8);
		TMRepository.getListaMecc().add(m9);
		TMRepository.getListaMecc().add(m10);
		TMRepository.getListaMecc().add(m11);
		TMRepository.getListaMecc().add(m12);
		TMRepository.getListaMecc().add(m13);
		TMRepository.getListaMecc().add(m14);
		TMRepository.getListaMecc().add(m15);
		TMRepository.getListaMecc().add(m16);
		TMRepository.getListaMecc().add(m17);
		TMRepository.getListaMecc().add(m18);
		TMRepository.getListaMecc().add(m19);
		TMRepository.getListaMecc().add(m20);
		
		TMRepository.getListaIngegneri().add(i);
		TMRepository.getListaIngegneri().add(i2);
		TMRepository.getListaIngegneri().add(i3);
		TMRepository.getListaIngegneri().add(i4);
		TMRepository.getListaIngegneri().add(i5);
		TMRepository.getListaIngegneri().add(i6);
		TMRepository.getListaIngegneri().add(i7);
		TMRepository.getListaIngegneri().add(i8);
		TMRepository.getListaIngegneri().add(i9);
		TMRepository.getListaIngegneri().add(i10);
		TMRepository.getListaIngegneri().add(i11);
		TMRepository.getListaIngegneri().add(i12);
		
		//System.out.println(TMRepository.getListaPiloti());

//      pil.createPiloti(p);
//		pil.createPiloti(p2);
//		pil.createPiloti(p3);
//		pil.createPiloti(p4);
//		pil.createPiloti(p5);
//		pil.createPiloti(p6);
//		TMRepository.lineUpPiloti(s);
//		TMRepository.ScadenzaCont();
		TMRepository.ComposizioneTeam(p, s1);
		TMRepository.ComposizioneTeam(p6, s);
		
		TMRepository.MondTecn();
		

	}

}
