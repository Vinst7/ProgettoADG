package it.begear.campionatoF1.repository;

import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Ingegneri;
import it.begear.campionatoF1.model.Meccanici;
import it.begear.campionatoF1.model.Piloti;
import it.begear.campionatoF1.model.Scuderia;
import it.begear.campionatoF1.utils.ScannerClass;

public class TMRepository {
	
	private static List<Ingegneri> listaIngegneri = new ArrayList<Ingegneri>();
	private static List<Piloti> listaPiloti = new ArrayList<Piloti>();
	private static List<Meccanici> listaMecc = new ArrayList<Meccanici>();
	
	public static void lineUpPiloti(Scuderia s) {
		System.out.println("LINE UP SCUDERIA "+s.getNome()+"\n");
		List<Piloti> lineup = new ArrayList<Piloti>();
		int i=0;
		while(i<2) {
			try {
				int j= ScannerClass.inserisciIntero();
				lineup.add(listaPiloti.get(j));
				System.out.println(lineup.get(i));			
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERRORE INDICE INESISTENTE!");
				lineUpPiloti(s);
			}catch (Exception exc) {
				exc.printStackTrace();
			}		
		}	
	}

	
	
}
