package model;

public class Esportes {
	
	// Atributos 
	
	private String esporte;
	private String modalidade;
	
	
	
	
	
	
	// metodos construtor
	public Esportes(String esporte, String modalidade) {
		super();
		this.esporte = esporte;
		this.modalidade = modalidade;
	}
	
	
	
	// metodos get e set
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	

}
