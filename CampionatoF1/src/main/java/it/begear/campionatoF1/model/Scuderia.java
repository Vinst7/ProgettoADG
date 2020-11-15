package it.begear.campionatoF1.model;

public class Scuderia {
	
	private int idScuderia;
	private String nome;
	
	public Scuderia() {}
	
	public Scuderia(int idScuderia, String nome) {
		this.idScuderia = idScuderia;
		this.nome = nome;
	}

	public Scuderia(String nome) {
		super();
		this.nome = nome;
	}

	public int getIdScuderia() {
		return idScuderia;
	}

	public void setIdScuderia(int idScuderia) {
		this.idScuderia = idScuderia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Scuderia [idScuderia=" + idScuderia + ", nome=" + nome + "]";
	}
	
	

}
