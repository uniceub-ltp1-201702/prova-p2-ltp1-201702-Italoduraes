package view;

import javax.swing.JOptionPane;

public class ViewBuscarMedalhasEUA {
	

	//Atributos
			private String nome;
			
			public ViewBuscarMedalhasEUA(){
				this.nome =
						JOptionPane.showInputDialog("Digite o nome do país:");
			}
			
			
			
			public String getNome() {
				return nome;
			}

}
