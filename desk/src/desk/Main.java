package desk;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import desk.TelaLogin;

public class Main {
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Instancia a nova Janela
            	TelaLogin hello=  new TelaLogin();
            	// Finaliza o programa quando fechar a janela
            	hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	// Exibe a janela
            	hello.show();
            }
        });
	}

}