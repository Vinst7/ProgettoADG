package it.begear.campionatoF1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Piloti;

public class DAOPilotiImpl implements DAOPiloti {

	private static DAOPilotiImpl instance=null;

	private DAOPilotiImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static DAOPilotiImpl getInstance() {
		if(instance== null) {
			instance= new DAOPilotiImpl();
		}
		return instance;
	}

	@Override
	public void createPiloti(Piloti p) {
		String sql = "INSERT INTO piloti (id,nome,cognome,annoNascita,nazionalita,durataContratto,stipendioAnnuo,idScuderia) VALUES (?,?,?,?,?,?,?,?)";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(sql)) {
			
            stm.setInt(1, p.getId());
            stm.setString(2, p.getNome());
            stm.setString(3, p.getCognome());
            stm.setInt(4, p.getAnnoNascita());
            stm.setString(5, p.getNazionalita());
            stm.setInt(6, p.getDurataContratto());
            stm.setDouble(7, p.getStipendioAnnuo());
            stm.setInt(8, p.getIdScuderia());
			stm.execute();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Piloti readPiloti(int id) {
		String sql = "SELECT * FROM piloti WHERE id=?";
		Piloti p = null;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
	    p = new Piloti();
		stm.setInt(1, id);
		ResultSet result = stm.executeQuery();
		
		while(result.next()) {
			p.setId(result.getInt(id));
			p.setNome(result.getString("nome"));
			p.setCognome(result.getString("cognome"));
			p.setAnnoNascita(result.getInt("annoNascita"));
			p.setNazionalita(result.getString("nazionalita"));
			p.setDurataContratto(result.getInt("durataContratto"));
			p.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
			p.setIdScuderia(result.getInt("idScuderia"));
			
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void updatePiloti(Piloti p) {
		String sql = "UPDATE piloti SET nome=?, SET cognome=?, SET annoNascita=?, SET nazioalita=?, SET durataContratto=?, SET stipendioAnnuo=?, SET idScuderia=?, WHERE id=?";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			
	            stm.setString(1, p.getNome());
	            stm.setString(2, p.getCognome());
	            stm.setInt(3, p.getAnnoNascita());
	            stm.setString(4, p.getNazionalita());
	            stm.setInt(5, p.getDurataContratto());
	            stm.setDouble(6, p.getStipendioAnnuo());
	            stm.setInt(7, p.getIdScuderia());
	            stm.setInt(8, p.getId());
				stm.execute();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletePiloti(int id) {

		String sql = "DELETE FROM piloti WHERE id=?";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			
			stm.setInt(1, id);
			stm.execute();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Piloti> readAll() {
		String sql= "SELECT * FROM piloti ";
		List<Piloti> list=null;
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			ResultSet result= stm.executeQuery();
			list= new ArrayList<Piloti>();
			while(result.next()) {
			Piloti p  = new Piloti();
			p.setId(result.getInt("id"));
			p.setNome(result.getString("nome"));
			p.setCognome(result.getString("cognome"));
			p.setAnnoNascita(result.getInt("annoNascita"));
			p.setNazionalita(result.getString("nazionalita"));
			p.setDurataContratto(result.getInt("durataContratto"));
			p.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
			p.setIdScuderia(result.getInt("idScuderia"));	
				
		}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	}
}
