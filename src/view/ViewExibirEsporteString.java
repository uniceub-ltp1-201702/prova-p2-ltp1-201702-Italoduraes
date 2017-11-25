package view;

import javax.swing.JOptionPane;

public class ViewExibirEsporteString {
	
	public ViewExibirEsporteString(String esporte) {

		JOptionPane.showMessageDialog(null, esporte);
		ViewPrincipal vp = new ViewPrincipal();
	}
}
