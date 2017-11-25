package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {


	//atributos
		private String opcao;
		
		//Metodo para exibir a lista de opcoes
		public String getOpcao(){
			
			this.opcao =  JOptionPane.showInputDialog(
					"Escolha uma opção\n" +
					"1 - Buscar modalidades\n" +
					"2 - Buscar medalhas em relação os EUA\n" +
					"3 - Ver a diferença da medalha dos dois país\n" +
					"4 - Sair\n");
			
			return this.opcao;
		}
}
