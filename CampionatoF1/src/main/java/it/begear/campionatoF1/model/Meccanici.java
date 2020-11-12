package it.begear.campionatoF1.model;

public class Meccanici {
	
	private int id;
	private String nome;
	private String cognome;
	private int annoNascita;
	private String nazionalita;
	private int durataContratto;
	private double stipendioAnnuo;
	private int idScuderia;
	
	public Meccanici () {}
	
	public Meccanici(int id, String nome, String cognome, int annoNascita, String nazionalita, int durataContratto,
			double stipendioAnnuo, int idScuderia) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
		this.nazionalita = nazionalita;
		this.durataContratto = durataContratto;
		this.stipendioAnnuo = stipendioAnnuo;
		this.idScuderia = idScuderia;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getAnnoNascita() {
		return annoNascita;
	}


	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}


	public String getNazionalita() {
		return nazionalita;
	}


	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}


	public int getDurataContratto() {
		return durataContratto;
	}


	public void setDurataContratto(int durataContratto) {
		this.durataContratto = durataContratto;
	}


	public double getStipendioAnnuo() {
		return stipendioAnnuo;
	}


	public void setStipendioAnnuo(double stipendioAnnuo) {
		this.stipendioAnnuo = stipendioAnnuo;
	}


	public int getIdScuderia() {
		return idScuderia;
	}


	public void setIdScuderia(int idScuderia) {
		this.idScuderia = idScuderia;
	}


	@Override
	public String toString() {
		return "Meccanici [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", annoNascita=" + annoNascita
				+ ", nazionalita=" + nazionalita + ", durataContratto=" + durataContratto + ", stipendioAnnuo="
				+ stipendioAnnuo + ", idScuderia=" + idScuderia + "]";
	}
	
	
	

}
