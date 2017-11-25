package view;

import javax.swing.JOptionPane;

public class VIewBuscarMedalhasTotal2 {
	

	//Atributos
			private String nome2;
			
			public VIewBuscarMedalhasTotal2(){
				this.nome2 =
						JOptionPane.showInputDialog("Digite o nome do segundo país:");
			        	
			}
			
			
			
			public String getNome2() {
				return nome2;
			}

}
