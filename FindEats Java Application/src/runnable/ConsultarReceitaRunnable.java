package runnable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;

import modelo.Receita;

import javax.swing.JButton;

public class ConsultarReceitaRunnable implements Runnable {

	/**
	 * @wbp.parser.entryPoint
	 */
	private String nome;
	private String tipo;
		
	public ConsultarReceitaRunnable(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	
	
	public void run() {
		
		JFrame frame = new JFrame("Consultar Receitas");
		frame.getContentPane().setLayout(null);
		frame.setSize(447, 409);
		
		JLabel lblSuasReceitas = new JLabel("Suas Receitas:");
		lblSuasReceitas.setFont(new Font("Microsoft Tai Le", Font.BOLD, 29));
		lblSuasReceitas.setBounds(117, 13, 201, 61);
		frame.getContentPane().add(lblSuasReceitas);
		
		JLabel lblNome = new JLabel("Nome: " + nome);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNome.setBounds(25, 95, 395, 16);
		frame.getContentPane().add(lblNome);
		
		JLabel lblTipo = new JLabel("Tipo: " + tipo);
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTipo.setBounds(25, 124, 395, 16);
		frame.getContentPane().add(lblTipo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 72, 408, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 170, 408, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnMais = new JButton("Mais");
		btnMais.setBounds(323, 138, 97, 25);
		frame.getContentPane().add(btnMais);
		
		frame.setVisible(true);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(323, 328, 97, 25);
		frame.getContentPane().add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
    		frame.setVisible(false);
        }
        	
        });
		
	}
	

}
