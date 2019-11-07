package runnable;
import modelo.*;
import javax.swing.*;

import dao.UsuarioDAO;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Panel;

public class CadastroRunnable implements Runnable {
	
	public static final int LARGURA_PADRAO = 500;
	public static final int ALTURA_PADRAO = 500;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtDfsdf;
	private JTextField textField_6;
	public static Usuario user01;
	public static LoginRunnable pr;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void run() {
		JFrame frame = new JFrame("Jframe Test");
		frame.setSize(LARGURA_PADRAO, ALTURA_PADRAO);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocation(500, 500);
		frame.setTitle("Criar Conta");
		frame.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPreenchaOsDados = new JLabel("Preencha os dados abaixo ");
		lblPreenchaOsDados.setBounds(58, 37, 365, 37);
		lblPreenchaOsDados.setFont(new Font("Microsoft Tai Le", Font.BOLD, 29));
		panel_1.add(lblPreenchaOsDados);
		
		JLabel lblParaEfetuarO = new JLabel("Para efetuar o cadastro: ");
		lblParaEfetuarO.setFont(new Font("Microsoft Tai Le", Font.BOLD, 29));
		lblParaEfetuarO.setBounds(58, 76, 384, 37);
		panel_1.add(lblParaEfetuarO);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 139, 482, 12);
		panel_1.add(separator);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(28, 20, 42, 16);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(70, 17, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblIngredientes = new JLabel("Sobrenome: ");
		lblIngredientes.setBounds(198, 20, 75, 16);
		panel.add(lblIngredientes);
		
		textField_1 = new JTextField();
		textField_1.setBounds(272, 17, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Idade: ");
		lblNewLabel.setBounds(28, 52, 56, 16);
		panel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(70, 49, 42, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(28, 81, 56, 16);
		panel.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(70, 81, 238, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblConfirmaoDeEmail = new JLabel("Confirma\u00E7\u00E3o de Email:");
		lblConfirmaoDeEmail.setBounds(28, 110, 137, 28);
		panel.add(lblConfirmaoDeEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(168, 113, 238, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(198, 52, 56, 16);
		panel.add(lblSexo);
		
		Choice choice = new Choice();
		choice.setBounds(272, 49, 42, 22);
		panel.add(choice);
		choice.add("M");
		choice.add("F");
		
	
		Panel panel_2 = new Panel();
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Criar Conta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textField.getText();
				String sobrenome = textField_1.getText();
				int idade = Integer.parseInt(textField_2.getText());
				String email = textField_3.getText();
				String confEmail = textField_4.getText();
				char sexo = 0;
				String senha = txtDfsdf.getText();
				String confSenha = textField_6.getText();
				user01 = new Usuario(nome,sobrenome,email,confEmail,senha,confSenha,idade,sexo); //falta criar variaveis a partir de senha
				
				UsuarioDAO usuario = null;
				usuario.insertUsuario(user01);
				
				pr = new LoginRunnable();
				EventQueue.invokeLater(pr);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(188, 113, 131, 25);
		panel_2.add(btnNewButton);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(36, 31, 56, 16);
		panel_2.add(lblSenha);
		
		txtDfsdf = new JPasswordField();
		txtDfsdf.setBounds(82, 28, 167, 22);
		panel_2.add(txtDfsdf);
		txtDfsdf.setColumns(10);
		
		JLabel lblConfirmaoDeSenha = new JLabel("Confirma\u00E7\u00E3o de Senha:");
		lblConfirmaoDeSenha.setBounds(36, 60, 167, 16);
		panel_2.add(lblConfirmaoDeSenha);
		
		textField_6 = new JPasswordField();
		textField_6.setBounds(176, 57, 167, 22);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 13, 482, 5);
		panel_2.add(separator_1);
		frame.setVisible(true);	
		
	}


	public Usuario getUser01() {
		return user01;
	}


	public void setUser01(Usuario user01) {
		this.user01 = user01;
	}
	
	
}
