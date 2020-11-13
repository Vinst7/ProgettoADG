package it.begear.campionatoF1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Meccanici;

public class DAOMeccaniciImpl implements DAOMeccanici {
	
	private static DAOMeccaniciImpl instance=null;

	private DAOMeccaniciImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static DAOMeccaniciImpl getInstance() {
		if(instance== null) {
			instance= new DAOMeccaniciImpl();
		}
		return instance;
	}

	@Override
	public void createMeccanici(Meccanici m) {
		String sql = "INSERT INTO meccanici (id,nome,cognome,annoNascita,nazionalita,durataContratto,stipendioAnnuo,idScuderia) VALUES (?,?,?,?,?,?,?,?)";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(sql)) {
			
            stm.setInt(1, m.getId());
            stm.setString(2, m.getNome());
            stm.setString(3, m.getCognome());
            stm.setInt(4, m.getAnnoNascita());
            stm.setString(5, m.getNazionalita());
            stm.setInt(6, m.getDurataContratto());
            stm.setDouble(7, m.getStipendioAnnuo());
            stm.setInt(8, m.getIdScuderia());
			stm.execute();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Meccanici readMeccanici(int id) {
		String sql = "SELECT * FROM meccanici WHERE id=?";
		Meccanici m = null;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
	    m = new Meccanici();
		stm.setInt(1, id);
		ResultSet result = stm.executeQuery();
		
		while(result.next()) {
			m.setId(result.getInt(id));
			m.setNome(result.getString("nome"));
			m.setCognome(result.getString("cognome"));
			m.setAnnoNascita(result.getInt("annoNascita"));
			m.setNazionalita(result.getString("nazionalita"));
			m.setDurataContratto(result.getInt("durataContratto"));
			m.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
			m.setIdScuderia(result.getInt("idScuderia"));
			
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public void updateMeccanici(Meccanici m) {
		String sql = "UPDATE meccanici SET nome=?, SET cognome=?, SET annoNascita=?, SET nazioalita=?, SET durataContratto=?, SET stipendioAnnuo=?, SET idScuderia=?, WHERE id=?";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			
	            stm.setString(1, m.getNome());
	            stm.setString(2, m.getCognome());
	            stm.setInt(3, m.getAnnoNascita());
	            stm.setString(4, m.getNazionalita());
	            stm.setInt(5, m.getDurataContratto());
	            stm.setDouble(6, m.getStipendioAnnuo());
	            stm.setInt(7, m.getIdScuderia());
	            stm.setInt(8, m.getId());
				stm.execute();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteMeccanici(int id) {

		String sql = "DELETE FROM meccanici WHERE id=?";
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
	public List<Meccanici> readAll() {
		String sql= "SELECT * FROM piloti ";
		List<Meccanici> list=null;
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			ResultSet result= stm.executeQuery();
			list= new ArrayList<Meccanici>();
			while(result.next()) {
			Meccanici m = new Meccanici();
			m.setId(result.getInt("id"));
			m.setNome(result.getString("nome"));
			m.setCognome(result.getString("cognome"));
			m.setAnnoNascita(result.getInt("annoNascita"));
			m.setNazionalita(result.getString("nazionalita"));
			m.setDurataContratto(result.getInt("durataContratto"));
			m.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
			m.setIdScuderia(result.getInt("idScuderia"));	
				
		}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	}



