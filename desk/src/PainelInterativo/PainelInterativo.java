package PainelInterativo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PainelInterativo extends JFrame{

	public PainelInterativo() {
		// titulo da janela
		setTitle("Login");
		// tamanho da janela
		setSize(300, 300); 
		// fica imutável
		setResizable(false);
		
		setLayout();
    }
	
	private void setLayout () {
		
		JPanel panel = new JPanel(new GridLayout(1,2));
		
		// instancia-se os paineis
		JPanel checkboxes = new JPanel();
		JPanel interact = new JPanel();

		// atribui-se cor, texto e ação à variável
		JPanel norte = painelColorido(Color.blue,"Norte");
        JPanel leste = painelColorido(Color.yellow,"Leste");
        JPanel oeste = painelColorido(Color.orange,"Oeste");
        JPanel sul = painelColorido(Color.red,"Sul");
        JPanel centro = painelColorido(Color.white,"Centro");
		
        // checkboxes e suas dimensões no frame
		JCheckBox azul = checkBoxAction(norte, "Norte");
		azul.setPreferredSize(new Dimension(100,30));
		
		JCheckBox  laranja = checkBoxAction(oeste, "Oeste");
		laranja.setPreferredSize(new Dimension(100,30));

		JCheckBox  marrom = checkBoxAction(leste, "Leste");
		marrom.setPreferredSize(new Dimension(100,30));
		
		JCheckBox  vermelho = checkBoxAction(sul, "Sul");
		vermelho.setPreferredSize(new Dimension(100,30));
		
		// adiciona os checkboxes no primeiro painel
		checkboxes.add(azul);
		checkboxes.add(laranja);
		checkboxes.add(marrom);
		checkboxes.add(vermelho);

		// adiciona as cores interativas no segundo painel
		interact.add(norte);
		interact.add(sul);
		interact.add(leste);
		interact.add(oeste);
		interact.add(centro);
		
		// adiciona os paineis no grande painel
		panel.add(checkboxes);
		panel.add(interact);
		
		// adiciona o grande painel no frame
		add(panel);
	}

	// constroi a cor do painel interativo, de acordo com o parâmetro
	private static JPanel painelColorido( Color cor, String texto ) {
		
    	JPanel painelcolorido = new JPanel();
    	
    	// insere cor
    	painelcolorido.setBackground(cor);
    	// insere texto
    	painelcolorido.add(new JLabel(texto));
    	
    	return painelcolorido;
    }

	// ação do checkbox, associando 
	private static JCheckBox checkBoxAction( JPanel painel, String texto ) {
		
		JCheckBox checado = new JCheckBox();

		// checkbox inicia checado
		checado.setSelected(true);
		// insere texto
		checado.setText(texto);
		
		// adiciona a ação
		checado.addActionListener(new ActionListener() {	
			// quando selecionado...
			public void actionPerformed(ActionEvent i) {
				// ... painel fica visivel
				painel.setVisible(checado.isSelected());
			
			}
			
		});
		
		return checado;
	}
}
