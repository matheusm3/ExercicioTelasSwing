package PainelInterativo;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import desk.TelaLogin;

public class Main {
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Instancia a nova Janela
            	PainelInterativo pi=  new PainelInterativo();
            	// Finaliza o programa quando fechar a janela
            	pi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	// Exibe a janela
            	pi.show();
            }
        });
	}

}