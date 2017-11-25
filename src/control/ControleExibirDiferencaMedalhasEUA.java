package control;

import java.util.ArrayList;

import model.BD;
import model.Medalhas;
import view.ViewBuscarMedalhasEUA;
import view.ViewExibirMedalhaString;

public class ControleExibirDiferencaMedalhasEUA {
	


	// atributos
		 private BD bd;
		
		 
		 public ControleExibirDiferencaMedalhasEUA(BD bd){
			 this.bd = bd;
			 
		 }
		 

			//Metodo para buscar as medalhas
			public void buscarMedalhas(){
				
				// Recupera todas as medalhas
				ArrayList<Medalhas> medalha = this.bd.getMedalhas();
				
				//Criar a view para buscar a medalha
				ViewBuscarMedalhasEUA vbm = new ViewBuscarMedalhasEUA();
				
				//Recuperando as medalhas digitado pelo usuario
				String medalhas = vbm.getNome();
				
				//Retornar dados da medalha de acordo com o nome
				String a = "<<< " + medalhas + ">>>\n";
				for (int i = 0; i < medalha.size(); i++) {
					if (medalha.get(i).getPais().equalsIgnoreCase(medalhas)) {
						a += "-------------------\n" +
					     "Medalhas dos EUA: ouro: 103   prata: 81   bronze: 81" + "\n" +
					"Medalhas dos " + medalhas + ":" + " Ouro: " +medalha.get(i).getOuro() + "  Prata: " + medalha.get(i).getPrata() +"  Broze:" + medalha.get(i).getBronze() +  "\n" +
					     "----Diferenças----\n" +
				      "Ouro: " + ( 103 - medalha.get(i).getOuro() ) + "\n" +
					  "Prata: " + ( 81 - medalha.get(i).getPrata()) + "\n" +
				      "Bronze: " + ( 81 - medalha.get(i).getBronze());
					}
				}
				
				//Exibir os dados da medalha 
				ViewExibirMedalhaString vee = new ViewExibirMedalhaString(a);
			}

}
