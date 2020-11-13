package it.begear.campionatoF1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Teammanager;

public class DAOTeamManagerImpl implements DAOTeamManager{

	private static DAOTeamManagerImpl instance=null;

	private DAOTeamManagerImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static DAOTeamManagerImpl getInstance() {
		if(instance== null) {
			instance= new DAOTeamManagerImpl();
		}
		return instance;
	}

	@Override
	public void createTeamManager(Teammanager tm) {
		String sql = "INSERT INTO teammanager (id,nome,cognome,annoNascita,nazionalita,durataContratto,stipendioAnnuo,idScuderia) VALUES (?,?,?,?,?,?,?,?)";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(sql)) {
			
            stm.setInt(1, tm.getId());
            stm.setString(2, tm.getNome());
            stm.setString(3, tm.getCognome());
            stm.setInt(4, tm.getAnnoNascita());
            stm.setString(5, tm.getNazionalita());
            stm.setInt(6, tm.getDurataContratto());
            stm.setDouble(7, tm.getStipendioAnnuo());
            stm.setInt(8, tm.getIdScuderia());
			stm.execute();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Teammanager readTeamManager(int id) {
		String sql = "SELECT * FROM teammanager WHERE id=?";
		Teammanager tm = null;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
	    tm = new Teammanager();
		stm.setInt(1, id);
		ResultSet result = stm.executeQuery();
		
		while(result.next()) {
			tm.setId(result.getInt(id));
			tm.setNome(result.getString("nome"));
			tm.setCognome(result.getString("cognome"));
			tm.setAnnoNascita(result.getInt("annoNascita"));
			tm.setNazionalita(result.getString("nazionalita"));
			tm.setDurataContratto(result.getInt("durataContratto"));
			tm.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
			tm.setIdScuderia(result.getInt("idScuderia"));
			
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tm;
	}

	@Override
	public void updateTeamManager(Teammanager tm) {
		String sql = "UPDATE teammanager SET nome=?, SET cognome=?, SET annoNascita=?, SET nazioalita=?, SET durataContratto=?, SET stipendioAnnuo=?, SET idScuderia=?, WHERE id=?";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			
	            stm.setString(1, tm.getNome());
	            stm.setString(2, tm.getCognome());
	            stm.setInt(3, tm.getAnnoNascita());
	            stm.setString(4, tm.getNazionalita());
	            stm.setInt(5, tm.getDurataContratto());
	            stm.setDouble(6, tm.getStipendioAnnuo());
	            stm.setInt(7, tm.getIdScuderia());
	            stm.setInt(8, tm.getId());
				stm.execute();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteTeamManager(int id) {

		String sql = "DELETE FROM teammanager WHERE id=?";
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
	public List<Teammanager> readAll() {
		String sql= "SELECT * FROM teammanager ";
		List<Teammanager> list=null;
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			ResultSet result= stm.executeQuery();
			list= new ArrayList<Teammanager>();
			while(result.next()) {
				Teammanager tm = new Teammanager();
				tm.setId(result.getInt("id"));
				tm.setNome(result.getString("nome"));
				tm.setCognome(result.getString("cognome"));
				tm.setAnnoNascita(result.getInt("annoNascita"));
				tm.setNazionalita(result.getString("nazionalita"));
				tm.setDurataContratto(result.getInt("durataContratto"));
				tm.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
				tm.setIdScuderia(result.getInt("idScuderia"));
				
		}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	
	}

