package control;

import java.util.ArrayList;

import model.BD;
import model.Medalhas;
import view.VIewBuscarMedalhasTotal2;
import view.ViewBuscarMedalhasEUA;
import view.ViewBuscarMedalhasTotal;
import view.ViewExibirMedalhaString;

public class ControleExibirDiferencaMedalhasTotal {
	

	// atributos
		 private BD bd;
		
		 
		 public ControleExibirDiferencaMedalhasTotal(BD bd){
			 this.bd = bd;
			 
		 }
		 

			//Metodo para buscar as medalhas
			public void buscarMedalhasTotal(){
				
				// Recupera todas as medalhas
				ArrayList<Medalhas> medalha = this.bd.getMedalhas();
				
				//Criar a view para buscar a medalha
				ViewBuscarMedalhasTotal vbmt = new ViewBuscarMedalhasTotal();
				VIewBuscarMedalhasTotal2 vbmt2 = new VIewBuscarMedalhasTotal2();
				
				//Recuperando as medalhas digitado pelo usuario
				String primeiro = vbmt.getNome1();
				String segundo = vbmt2.getNome2();
				
				//Retornar dados da medalha de acordo com o nome
				String a = "<<< " + primeiro + "---" + segundo + ">>>\n";
				
				for (int i = 0; i < medalha.size(); i++) {
					for (int j = 0; j < medalha.size(); j++)
					if (medalha.get(i).getPais().equals(primeiro)&& medalha.get(j).getPais().equals(segundo)) {
						a += "---Diferença---\n" +
							"Ouro: "	+(medalha.get(i).getOuro() - medalha.get(j).getOuro()) + "\n"+
					        "Prata: " + (medalha.get(i).getPrata() - medalha.get(j).getPrata()) + "\n" +
							"Bronze: " + (medalha.get(i).getBronze() - medalha.get(j).getBronze())	; 
					}
				
					
				}
				
				//Exibir os dados da medalha 
				ViewExibirMedalhaString vee = new ViewExibirMedalhaString(a);
			}


}
