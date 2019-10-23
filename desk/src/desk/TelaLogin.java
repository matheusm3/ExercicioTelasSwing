package desk;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaLogin extends JFrame{

	public TelaLogin() {
		// titulo da janela
		setTitle("Login");
		// tamanho da janela
		setSize(300, 300); 
		// fica imutável
		setResizable(false);
		
		setLayout();
    }

	private void setLayout () {
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Adiciona bordas
		panel.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com titulo
			   ,BorderFactory.createTitledBorder("Login")));

		JTextField usucampo = new JTextField(10);
		usucampo.setBounds(140, 42, 100, 25);
		
		JPasswordField passcampo = new JPasswordField();
		passcampo.setBounds(140, 91, 100, 25);
		
		JLabel usu = new JLabel("Usuário");
		usu.setForeground(Color.black);
		usu.setBounds(70, 40, 80, 30);

		JLabel pass = new JLabel("Senha");
		pass.setForeground(Color.black);
		pass.setBounds(70, 90, 80, 30);
		
		JButton button = new JButton("Acessar");
		button.setBounds(140, 130, 100, 30);
		
		JRadioButton rb = new JRadioButton();

		JCheckBox manter = new JCheckBox("Manter acessado");
		manter.setBounds(140, 165, 130, 30);
		
		JLabel esqueciSenha = new JLabel();
		esqueciSenha.setText("Esqueci a senha");
		esqueciSenha.setBounds(140, 190, 100, 30);

		
		panel.add(usu);
		panel.add(usucampo);

		panel.add(pass);
		panel.add(passcampo);
		
		panel.add(button);
		panel.add(esqueciSenha);
		panel.add(manter);
		add(panel);
		

		/*
		JLabel label = new JLabel("Login");
		label.setBounds(140, 50, 100, 30);
		// cor do texto
		label.setForeground(Color.RED);
		JTextField txt = new JTextField(10);
		txt.setBounds(140, 50, 100, 30);

		JButton button = new JButton("clica");
		button.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent e) {

				String texto = txt.getText();
				label.setText(texto);
				
			}
		});
		//adiciona o label ao frame
		panel.add(txt);
		panel.add(label);
		panel.add(button);
		// adiciona o painel no frame
		add(panel);
		*/
	}
}