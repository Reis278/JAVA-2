import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.soap.Text;

public class Janela extends JFrame {
	
	private JLabel lblNome;
	private JLabel lblSobrenome;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JButton btnSalvar;
	
	public Janela() {
		//instancias
		this.lblNome = new JLabel("Nome:");
		this.lblSobrenome = new JLabel("Sobrenome");
		this.txtNome = new JTextField(10);
		this.txtSobrenome = new JTextField(10);
		this.btnSalvar = new JButton("Salvar");
		this.btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtNome.getText() + " " + txtSobrenome.getText());
				new Janela();
				
			}
		});
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints coordenada = new GridBagConstraints();
		
		//setando posições
		this.setLayout(layout);
		
		coordenada.gridx = 0;
		coordenada.gridy = 0;
		layout.setConstraints(lblNome, coordenada);
		this.getContentPane().add(lblNome);
		
		coordenada.gridx = 0;
		coordenada.gridy = 1;
		layout.setConstraints(lblSobrenome, coordenada);
		this.getContentPane().add(lblSobrenome);
		
		coordenada.gridx = 1;
		coordenada.gridy = 0;
		layout.setConstraints(txtNome, coordenada);
		this.getContentPane().add(txtNome);
		
		coordenada.gridx = 1;
		coordenada.gridy = 1;
		layout.setConstraints(txtSobrenome, coordenada);
		this.getContentPane().add(txtSobrenome);
		
		coordenada.gridx = 0;
		coordenada.gridy = 2;
		coordenada.gridwidth = 2;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		layout.setConstraints(btnSalvar, coordenada);
		this.getContentPane().add(btnSalvar);
		
		this.pack();
		this.setVisible(true);
		
	}
	
}
