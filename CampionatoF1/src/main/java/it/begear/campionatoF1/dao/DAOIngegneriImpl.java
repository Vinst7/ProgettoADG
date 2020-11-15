package it.begear.campionatoF1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Ingegneri;
import it.begear.campionatoF1.repository.TMRepository;

public class DAOIngegneriImpl implements DAOIngegneri {
	private static DAOIngegneriImpl instance=null;

	public DAOIngegneriImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static DAOIngegneriImpl getInstance() {
		if(instance== null) {
			instance= new DAOIngegneriImpl();
		}
		return instance;
	}
	

	@Override
	public void createIngegnere(Ingegneri ing) {
		String sql = "INSERT INTO ingegneri (id,nome,cognome,annoNascita,nazionalita,durataContratto,stipendioAnnuo,idScuderia) VALUES (?,?,?,?,?,?,?,?)";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(sql)) {
			
            stm.setInt(1, ing.getId());
            stm.setString(2, ing.getNome());
            stm.setString(3, ing.getCognome());
            stm.setInt(4, ing.getAnnoNascita());
            stm.setString(5, ing.getNazionalita());
            stm.setInt(6, ing.getDurataContratto());
            stm.setDouble(7, ing.getStipendioAnnuo());
            stm.setInt(8, ing.getIdScuderia());
			stm.execute();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Ingegneri readIngegnere(int id) {
		String sql = "SELECT * FROM ingegneri WHERE id=?";
		Ingegneri i = null;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
	    i = new Ingegneri();
		stm.setInt(1, id);
		ResultSet result = stm.executeQuery();
		
		while(result.next()) {
			i.setId(result.getInt(id));
			i.setNome(result.getString("nome"));
			i.setCognome(result.getString("cognome"));
			i.setAnnoNascita(result.getInt("annoNascita"));
			i.setNazionalita(result.getString("nazionalita"));
			i.setDurataContratto(result.getInt("durataContratto"));
			i.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
			i.setIdScuderia(result.getInt("idScuderia"));
			
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Ingegneri> realdAll() {
		String sql= "SELECT * FROM ingegneri ";
		List<Ingegneri> list=null;
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			ResultSet result= stm.executeQuery();
			list= new ArrayList<Ingegneri>();
			while(result.next()) {
				Ingegneri i = new Ingegneri();
			i.setId(result.getInt("id"));
			i.setNome(result.getString("nome"));
			i.setCognome(result.getString("cognome"));
			i.setAnnoNascita(result.getInt("annoNascita"));
			i.setNazionalita(result.getString("nazionalita"));
			i.setDurataContratto(result.getInt("durataContratto"));
			i.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
			i.setIdScuderia(result.getInt("idScuderia"));	
				
		}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	

	@Override
	public void updateIngegnere(Ingegneri ing) {
		String sql = "UPDATE ingegneri SET nome=?, SET cognome=?, SET annoNascita=?, SET nazioalita=?, SET durataContratto=?, SET stipendioAnnuo=?, SET idScuderia=?, WHERE id=?";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			
	            stm.setString(1, ing.getNome());
	            stm.setString(2, ing.getCognome());
	            stm.setInt(3, ing.getAnnoNascita());
	            stm.setString(4, ing.getNazionalita());
	            stm.setInt(5, ing.getDurataContratto());
	            stm.setDouble(6, ing.getStipendioAnnuo());
	            stm.setInt(7, ing.getIdScuderia());
	            stm.setInt(8, ing.getId());
				stm.execute();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteIngegnere(int id) {
		String sql = "DELETE FROM ingegneri WHERE id=?";
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
	
	public void addList() {
		String Sql="SELECT * FROM ingegneri";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(Sql)) {
           ResultSet result = stm.executeQuery();
			
			while(result.next()) {
				Ingegneri i= new Ingegneri();
				i.setId(result.getInt("id"));
				i.setNome(result.getString("nome"));
				i.setCognome(result.getString("cognome"));
				i.setAnnoNascita(result.getInt("annoNascita"));
				i.setNazionalita(result.getString("nazionalita"));
				i.setDurataContratto(result.getInt("durataContratto"));
				i.setStipendioAnnuo(result.getDouble("stipendioAnnuo"));
				i.setIdScuderia(result.getInt("idScuderia"));
				TMRepository.getListaIngegneri().add(i);
			}
		
		}
			
			catch (Exception e) {
			e.printStackTrace();
		}
	   //System.out.println(TMRepository.getListaIngegneri());
	}
	
	

}
