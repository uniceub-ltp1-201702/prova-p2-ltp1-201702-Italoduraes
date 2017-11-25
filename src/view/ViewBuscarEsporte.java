package view;

import javax.swing.JOptionPane;

public class ViewBuscarEsporte {
	
	

	//Atributos
		private String nome;
		
		public ViewBuscarEsporte(){
			this.nome =
					JOptionPane.showInputDialog("Digite o nome do esporte:");
		}
		
		
		
		public String getNome() {
			return nome;
		}
}
