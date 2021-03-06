package it.begear.campionatoF1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.campionatoF1.model.Piloti;
import it.begear.campionatoF1.model.Scuderia;
import it.begear.campionatoF1.repository.TMRepository;

public class DAOScuderiaImpl implements DAOScuderia {

	private static DAOScuderiaImpl instance=null;
	
	public DAOScuderiaImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static DAOScuderiaImpl getInstance() {
		if(instance== null) {
			instance= new DAOScuderiaImpl();
		}
		return instance;
	}
	

	@Override
	public void createScuderia(Scuderia scuderia) {
		String sql = "INSERT INTO scuderia(idScuderia,nome) VALUES (?,?)";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(sql)) {
			
			stm.setInt(1, scuderia.getIdScuderia());
			stm.setString(2, scuderia.getNome());
			stm.execute();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}

		
	}

	@Override
	public Scuderia readScuderia(int id) {
		String sql = "SELECT * FROM scuderia WHERE id=?";
		Scuderia scuderia = null;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
	    scuderia = new Scuderia();
		stm.setInt(1, id);
		ResultSet result = stm.executeQuery();
		
		while(result.next()) {
			scuderia.setIdScuderia(result.getInt(id));
			scuderia.setNome(result.getString("nome"));
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return scuderia;
	}

	@Override
	public void updateScuderia(Scuderia scuderia) {
		String sql = "UPDATE scuderia SET nome=?, WHERE idScuderia=?";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			
			stm.setString(1, scuderia.getNome());
			stm.setInt(2, scuderia.getIdScuderia());
			stm.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteScuderia(int id) {
		String sql = "DELETE FROM scuderia WHERE idScuderia=?";
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
	public List<Scuderia> readAll() {
		String sql= "SELECT * FROM scuderia";
		List<Scuderia> list=null;
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			ResultSet result= stm.executeQuery();
			list= new ArrayList<Scuderia>();
			while(result.next()) {
				Scuderia scuderia = new Scuderia();
				scuderia.setIdScuderia(result.getInt("id"));
				scuderia.setNome(result.getString("nome"));	
		}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	
	public void addList() {
		String Sql="SELECT * FROM scuderia";
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(Sql)) {
           ResultSet result = stm.executeQuery();
			
			while(result.next()) {
				Scuderia s= new Scuderia();
				s.setIdScuderia(result.getInt("idScuderia"));
				s.setNome(result.getString("nome"));
				TMRepository.getListScud().add(s);
			}
		
		}
			
			catch (Exception e) {
			e.printStackTrace();
		}
	   //System.out.println(TMRepository.getListScud());
	}

}
