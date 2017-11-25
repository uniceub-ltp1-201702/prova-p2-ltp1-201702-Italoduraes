package control;

import javax.swing.JOptionPane;

import model.BD;
import view.ViewPrincipal;

public class ControlePrincipal {
	
	// Atributos
	
	private BD bd;
	private ViewPrincipal vp;
	private ControleExibirModalidades cem;
	private ControleExibirDiferencaMedalhasEUA cedm;
	private ControleExibirDiferencaMedalhasTotal cedmt;
	
	
	//metodo construtor
	
	public ControlePrincipal(){
		// instanciar o objeto BD
		this.bd = new BD();
		
		// Instanciar a ViewPrincipal
		this.vp = new ViewPrincipal();
		
		// Carregar os esportes do arquivo para jogar no ControleExibirModalidades	
					bd.carregarEsportes();
					
      	// Carregar as medalhas do arquivo 	
					bd.carregarMedalhas();
					
					
		// Criar controles
			this.cem = new ControleExibirModalidades(bd);	
			this.cedm = new ControleExibirDiferencaMedalhasEUA(bd);
			this.cedmt = new ControleExibirDiferencaMedalhasTotal(bd);
			
			
         //Exibir a janela de opçoes pela primeira vez 
			
			tratarOpcao(this.vp.getOpcao());
	}
	

	// Metodo para tratar a opçao do esporte
	
	public void tratarOpcao ( String opcao){
		while (true) {
			switch (opcao) {
			case "1": this.cem.buscarEsporte();
				break;
				
			case "2": this.cedm.buscarMedalhas();	
				break;
				
			case "3": this.cedmt.buscarMedalhasTotal();	
				break;
				
			case "4": JOptionPane.showMessageDialog(null, "Até breve!" );	
				return;
				
			default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido! ");
				break;
			}
			
			// Exibir a janela de opçoes 
			
			opcao = this.vp.getOpcao();
			
			
			
		}
	}
	

}
