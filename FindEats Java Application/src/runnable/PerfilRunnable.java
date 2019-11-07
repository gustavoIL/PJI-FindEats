package runnable;
import javax.swing.*;

import runnable.ConsultarReceitaRunnable;
import modelo.Receita;
import modelo.Usuario;
import dao.ReceitaDao;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.EventQueue;

public class PerfilRunnable implements Runnable {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private String nome, sobrenome, email, confEmail,senha,confSenha;
	private int idade;
	private char sexo;
	private CriarReceitaRunnable cRecr = null;
	private Receita receita;
	private ReceitaDao receitaDAO;
	private int i = 0; 
	private DivReceitaConsultada receitasDiv;
	public static JFrame frame;
	

	
	public void addUser(String nome, String senha, String email) {
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		
		
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void run() {
		
	
		 frame = new JFrame("Perfil - Main Page");
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(523, 502);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Eats");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 29));
		lblNewLabel.setBounds(28, 13, 409, 87);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 89, 479, 2);
		panel.add(separator);
		
		JLabel lblSobreMim = new JLabel("Sobre mim:");
		lblSobreMim.setFont(new Font("Microsoft Tai Le", Font.BOLD, 22));
		lblSobreMim.setBounds(28, 259, 194, 29);
		panel.add(lblSobreMim);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(28, 294, 409, 107);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Consultar Receitas");
		btnNewButton.setBounds(173, 422, 154, 25);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
//	        public void actionPerformed(ActionEvent arg0) {
//	        		  
//	        	receitaDAO.selectRecipe();
//	    	       
//	        }
	    });
		
		JButton btnNewButton_1 = new JButton("Criar Receita");
		btnNewButton_1.setBounds(28, 422, 133, 25);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	  
				cRecr = new CriarReceitaRunnable();
				EventQueue.invokeLater(cRecr);
				i++;
		   	}
		});
		
		
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.setBounds(292, 221, 97, 25);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent arg0) {
		        	frame.setVisible(false);
		        	LoginRunnable jfrr = new LoginRunnable();	
		        	EventQueue.invokeLater(jfrr);
		        }
		        	
		});
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setText("<IMAGEM>");
		textPane.setBounds(22, 116, 139, 130); 
		panel.add(textPane);
		
		JLabel lblNome = new JLabel("Nome: " + nome);
		lblNome.setBounds(173, 113, 305, 16);
		panel.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email: " + email);
		lblEmail.setBounds(173, 131, 305, 16);
		panel.add(lblEmail);
		
		JLabel lblReceitas = new JLabel("Receitas: " + i);
		lblReceitas.setBounds(173, 156, 305, 16);
		panel.add(lblReceitas);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(183, 221, 97, 25);
		panel.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PerfilEditRunnable per = new PerfilEditRunnable();
				EventQueue.invokeLater(per);
	        }	
	    });
		
		JLabel lblAvaliao = new JLabel("Avalia\u00E7\u00E3o: ");
		lblAvaliao.setBounds(173, 173, 305, 16);
		panel.add(lblAvaliao);
		
		frame.setVisible(true);
	}
}
