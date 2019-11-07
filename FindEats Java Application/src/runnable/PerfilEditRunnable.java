package runnable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PerfilEditRunnable implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
		
	/**
	 * @wbp.parser.entryPoint
	 */
	
	public void run() {
		JFrame framedit = new JFrame("Editar");
		
		framedit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    framedit.setSize(439, 502);
		
		JPanel paneledit = new JPanel();
		framedit.getContentPane().add(paneledit, BorderLayout.CENTER);
		paneledit.setLayout(null);
		
		JLabel lblAlterarAsConfiguraes = new JLabel("Alterar as Configura\u00E7\u00F5es ");
		lblAlterarAsConfiguraes.setFont(new Font("Microsoft Tai Le", Font.BOLD, 29));
		lblAlterarAsConfiguraes.setBounds(50, 13, 346, 50);
		paneledit.add(lblAlterarAsConfiguraes);
		
		JLabel lblNewLabel = new JLabel("Do Perfil:");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 29));
		lblNewLabel.setBounds(138, 55, 137, 37);
		paneledit.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 103, 481, 2);
		paneledit.add(separator);
		
		JLabel lblNovoNome = new JLabel("Novo nome:");
		lblNovoNome.setBounds(37, 134, 93, 16);
		paneledit.add(lblNovoNome);
		
		JLabel lblNovoEmail = new JLabel("Novo email:");
		lblNovoEmail.setBounds(37, 195, 68, 16);
		paneledit.add(lblNovoEmail);
		
		JLabel lblNovaSenha = new JLabel("Nova senha:");
		lblNovaSenha.setBounds(37, 251, 93, 16);
		paneledit.add(lblNovaSenha);
		
		JLabel lblConfirmeANova = new JLabel("Confirme a nova senha:");
		lblConfirmeANova.setBounds(37, 302, 184, 16);
		paneledit.add(lblConfirmeANova);
		
		JLabel lblSenhaAntiga = new JLabel("Senha antiga:");
		lblSenhaAntiga.setBounds(37, 350, 146, 16);
		paneledit.add(lblSenhaAntiga);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(328, 417, 68, 25);
		paneledit.add(btnOk);
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textField.getText();
				String email = textField_1.getText();
				String senha = textField_2.getText();
				String confSenha = textField_3.getText();
				String senhaAntiga = textField_4.getText();
				
				CadastroRunnable.user01.setNome(nome);
				CadastroRunnable.user01.setNome(email);
				CadastroRunnable.user01.setNome(senha);
				CadastroRunnable.user01.setNome(confSenha);
				CadastroRunnable.user01.setNome(senhaAntiga);
				
				framedit.setVisible(false);
				
				PerfilRunnable.frame.setVisible(false);
				
				
				LoginRunnable2 jfr = new LoginRunnable2();
				jfr.addValidation(nome,senha,email);
				EventQueue.invokeLater(jfr);
				
				
		        }	
		      });
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(219, 417, 97, 25);
		paneledit.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PerfilEditRunnable per = new PerfilEditRunnable();
				framedit.setVisible(false);
		        }	
		      });
		
		textField = new JTextField();
		textField.setBounds(37, 149, 302, 22);
		paneledit.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(37, 209, 301, 22);
		paneledit.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JPasswordField();
		textField_2.setBounds(37, 267, 301, 22);
		paneledit.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JPasswordField();
		textField_3.setBounds(37, 319, 302, 22);
		paneledit.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JPasswordField();
		textField_4.setBounds(37, 365, 302, 22);
		paneledit.add(textField_4);
		textField_4.setColumns(10);
		
		
		
		framedit.setVisible(true);
	
		
	}
}
