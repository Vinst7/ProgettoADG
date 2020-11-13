package it.begear.campionatoF1.repository;

import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Ingegneri;
import it.begear.campionatoF1.model.Meccanici;
import it.begear.campionatoF1.model.Piloti;
import it.begear.campionatoF1.model.Scuderia;

public class TMRepository {
	private static List<Ingegneri> listaIngegneri = new ArrayList<Ingegneri>();
	private static List<Piloti> listaPiloti = new ArrayList<Piloti>();
	private static List<Meccanici> listaMecc = new ArrayList<Meccanici>();
	
	 public void ComposizioneTeam(Piloti p,Scuderia s) {
		 System.out.println("TEAM DELLA SCUDERIA: " + s.getNome() + "DEL PILOTA : " + p.getCognome()+"\n" );
		 List<Ingegneri> listIngCorsa = new ArrayList<Ingegneri>();
		 List<Meccanici> listMeccCorsa= new ArrayList<Meccanici>();
		 int random =(int) (Math.random()*20);
		 System.out.println("INGEGNERI:");
		 for (int i = 0; i < 3; i++) {
			 listIngCorsa.add(listaIngegneri.get(random));	
			 System.out.println(listIngCorsa.get(i));
		}
		 System.out.println("MECCANICI:");
		 for (int i = 0; i < 5; i++) {
			 listMeccCorsa.add(listaMecc.get(random));
			 System.out.println(listMeccCorsa.get(i));
		}
		 
		 
	 }
	
	
	
	
	
	
	public void addList() {
		String PersSql="SELECT * FROM Personaggio";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(PersSql)) {
           ResultSet result = stm.executeQuery();
			
			while(result.next()) {
				Personaggio p= new Personaggio();
				p.setIDPers(result.getInt("IDPers"));
				p.setNome(result.getString("nome"));
				p.setHP(result.getInt("HP"));
				p.setVelocita(result.getInt("velocita"));
				MarioRPGRepository.getListp().add(p);
			}
		
		}
			
			catch (Exception e) {
			e.printStackTrace();
		}
	   //System.out.println(MarioRPGRepository.getListp());
	}
	

}
