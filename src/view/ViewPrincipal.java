package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {


	//atributos
		private String opcao;
		
		//Metodo para exibir a lista de opcoes
		public String getOpcao(){
			
			this.opcao =  JOptionPane.showInputDialog(
					"Escolha uma op��o\n" +
					"1 - Buscar modalidades\n" +
					"2 - Buscar medalhas em rela��o os EUA\n" +
					"3 - Ver a diferen�a da medalha dos dois pa�s\n" +
					"4 - Sair\n");
			
			return this.opcao;
		}
}
