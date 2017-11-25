package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	
	// Atributos
	
	private ArrayList<Esportes> esportes = new ArrayList<Esportes>(); 
    private ArrayList<Medalhas> medalhas = new ArrayList<Medalhas>();
    private String fileNomeE = "esportes.txt";
    private String fileNomeM = "medalhas.txt";
    private DocumentWriter dw;
	private DocumentReader dr;
	
	public BD(){
		//instanciar o ArrayList
		this.esportes = new ArrayList<Esportes>();
        this.medalhas = new ArrayList<Medalhas>();
        
        
        // instanciar o documentReader
        this.dr = new DocumentReader();
        // instanciar o documentWriter
        this.dw = new DocumentWriter();
	}
	
	// Metodo que carrega todos os esporte do arquivo para o ArrayList
	
		public void carregarEsportes(){
			//ler as linhas do arquivo
			ArrayList<String> linhas = this.dr.read(this.fileNomeE);
			
			//Percorer o ArrayList criando os esporte
			
			for (int i = 0; i <linhas.size(); i++) {
				// Separa a linha em um array de String
				String[] linhaEsporte = linhas.get(i).split(";");
				//Cria o esporte com os dados da linha
				Esportes c= new Esportes(linhaEsporte[0], linhaEsporte[1]);
				// Coloca o esporte no ArrayList 
				this.esportes.add(c);
			}
		}
	
		// Metodo que carrega todas as medalhas do arquivo para o ArrayList
		
			public void carregarMedalhas(){
				//ler as linhas do arquivo
				ArrayList<String> linhas = this.dr.read(this.fileNomeM);
				
				//Percorer o ArrayList criando as medalhas
				
				for (int i = 0; i <linhas.size(); i++) {
					// Separa a linha em um array de String
					String[] linhaMedalha = linhas.get(i).split(";");
					//Cria a medalha com os dados da linha
					Medalhas c= new Medalhas(linhaMedalha[0], Integer.parseInt(linhaMedalha[1]),Integer.parseInt(linhaMedalha[2]),
							Integer.parseInt(linhaMedalha[2]), Integer.parseInt(linhaMedalha[2]));
					// Coloca a medalha no ArrayList 
					this.medalhas.add(c);
				}
			}
	
	
// Recuperar o ArrayList de esportes

     public ArrayList<Esportes> getEsportes(){
   return this.esportes;
    }

// Recuperar o ArrayList da medalhas

   public ArrayList<Medalhas> getMedalhas(){
  return this.medalhas;
   } 
	
}
