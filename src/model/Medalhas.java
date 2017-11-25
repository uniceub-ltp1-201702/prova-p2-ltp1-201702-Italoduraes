package model;

public class Medalhas {
	
	// Atributos 
	private String pais;
	private int ouro;
	private int prata;
	private int bronze;
	private int posicao;
	
	
	
	
	
	
	
	
	// metodos construtor
	public Medalhas(String pais, int ouro, int prata, int bronze, int posicao) {
		super();
		this.pais = pais;
		this.ouro = ouro;
		this.prata = prata;
		this.bronze = bronze;
		this.posicao = posicao;
	}
	// metodos get e set
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	public int getPrata() {
		return prata;
	}
	public void setPrata(int prata) {
		this.prata = prata;
	}
	public int getBronze() {
		return bronze;
	}
	public void setBronze(int bronze) {
		this.bronze = bronze;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	
	

}
