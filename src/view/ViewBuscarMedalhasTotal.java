package view;

import javax.swing.JOptionPane;

public class ViewBuscarMedalhasTotal {
	

	//Atributos
			private String nome1;
			
			public ViewBuscarMedalhasTotal(){
				this.nome1 =
						JOptionPane.showInputDialog("Digite o nome do primeiro país:");
			        	
			}
			
			
			
			public String getNome1() {
				return nome1;
			}

}
