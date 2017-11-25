package control;

import java.util.ArrayList;

import model.BD;
import model.Esportes;
import view.ViewBuscarEsporte;
import view.ViewExibirEsporteString;

public class ControleExibirModalidades {
	
	


	// atributos
		 private BD bd;
		
		 
		 public ControleExibirModalidades(BD bd){
			 this.bd = bd;
			 
		 }
		 

			//Metodo para buscar o esporte
			public void buscarEsporte(){
				
				// Recupera todos os esportes
				ArrayList<Esportes> esporte = this.bd.getEsportes();
				
				//Criar a view para buscar o esporte
				ViewBuscarEsporte vbe = new ViewBuscarEsporte();
				
				//Recuperando o esporte digitado pelo usuario
				String esportes = vbe.getNome();
				
				//Retornar dados do esporte de acordo com o nome
				String a = "<<< " + esportes + ">>>\n";
				for (int i = 0; i < esporte.size(); i++) {
					if (esporte.get(i).getEsporte().equalsIgnoreCase(esportes)) {
						a += "-------------------\n" + esporte.get(i).getModalidade() + "\n";
					}
				}
				
				//Exibir os dados do esporte
				ViewExibirEsporteString vee = new ViewExibirEsporteString(a);
			}

}
