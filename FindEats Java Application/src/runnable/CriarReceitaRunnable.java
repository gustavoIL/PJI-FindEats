package runnable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import dao.ReceitaDao;
import modelo.Receita;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class CriarReceitaRunnable implements Runnable{
	private JTextField nomeField;
	private JTextField ing1;
	private JTextField ing2;
	private JTextField ing3;
	private JTextField ing4;
	private Receita rec01;

	/**
	 * @wbp.parser.entryPoint
	 */
	
	public void run() {
		JFrame frame = new JFrame("Criar Receita");
		 
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setSize(523, 560);
	    
	    JPanel panel = new JPanel();
	    frame.getContentPane().add(panel, BorderLayout.CENTER);
	    panel.setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("Nova Receita");
	    lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 29));
	    lblNewLabel.setBounds(148, 13, 205, 51);
	    panel.add(lblNewLabel);
	    
	    JLabel lblNomeDaReceita = new JLabel("Nome da receita:");
	    lblNomeDaReceita.setBounds(32, 87, 148, 16);
	    panel.add(lblNomeDaReceita);
	    
	    JLabel lblTipo = new JLabel("Tipo:");
	    lblTipo.setBounds(32, 336, 30, 16);
	    panel.add(lblTipo);
	    
	    TextArea textArea = new TextArea();
	    textArea.setBounds(32, 389, 440, 84);
	    panel.add(textArea);
	    
	    JLabel lblModoDePreparo = new JLabel("Modo de preparo:");
	    lblModoDePreparo.setBounds(32, 367, 128, 16);
	    panel.add(lblModoDePreparo);
	    
	    JSeparator separator = new JSeparator();
	    separator.setBounds(12, 62, 481, 2);
	    panel.add(separator);
	    
	    nomeField = new JTextField();
	    nomeField.setBounds(32, 108, 440, 22);
	    panel.add(nomeField);
	    nomeField.setColumns(10);
	    
	    
	    Choice choice = new Choice();
	    choice.setBounds(68, 336, 95, 22);
	    panel.add(choice);
	    choice.add("Selecione");
	    choice.add("Salgado");
	    choice.add("Doce");
	    choice.add("Amargo");
	    choice.add("Azedo");
	    choice.add("Apimentado");
	    choice.add("Umami");
	    
	    JLabel lblNewLabel_1 = new JLabel("Ingredientes:");
	    lblNewLabel_1.setBounds(32, 161, 117, 16);
	    panel.add(lblNewLabel_1);
	    
	    ing1 = new JTextField();
	    ing1.setBounds(64, 190, 116, 22);
	    panel.add(ing1);
	    ing1.setColumns(10);
	    
	    JLabel label = new JLabel("1-");
	    label.setBounds(39, 193, 23, 16);
	    panel.add(label);
	    
	    JSeparator separator_1 = new JSeparator();
	    separator_1.setBounds(32, 321, 461, 2);
	    panel.add(separator_1);
	    
	    JLabel label_1 = new JLabel("2-");
	    label_1.setBounds(39, 226, 23, 16);
	    panel.add(label_1);
	    
	    JLabel label_2 = new JLabel("3-");
	    label_2.setBounds(39, 255, 23, 16);
	    panel.add(label_2);
	    
	    JLabel label_3 = new JLabel("4-");
	    label_3.setBounds(39, 292, 23, 16);
	    panel.add(label_3);
	    
	    ing2 = new JTextField();
	    ing2.setBounds(64, 223, 116, 22);
	    panel.add(ing2);
	    ing2.setColumns(10);
	    
	    ing3 = new JTextField();
	    ing3.setBounds(64, 255, 116, 22);
	    panel.add(ing3);
	    ing3.setColumns(10);
	    
	    ing4 = new JTextField();
	    ing4.setBounds(64, 286, 116, 22);
	    panel.add(ing4);
	    ing4.setColumns(10);
	    
	    JSeparator separator_2 = new JSeparator();
	    separator_2.setBounds(12, 152, 481, 2);
	    panel.add(separator_2);
	    
	    
	    Button button = new Button("Confirmar Receita");
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	  		String nome, modoPreparo, tipo, ig01, ig02, ig03, ig04;  	
	    	nome = nomeField.getText();
	    	modoPreparo = textArea.getText();
	    	ig01 = ing1.getText();
	    	ig02 = ing2.getText();
	    	ig03 = ing3.getText();
	    	ig04 = ing4.getText();
	    	tipo = choice.getSelectedItem();
	    	rec01 = new Receita(nome, modoPreparo, tipo, ig01, ig02, ig03, ig04);
	    	try {	    		
				ReceitaDao.insertRecipe(rec01);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	frame.setVisible(false);	    		
	    	}
	    });
	    
	    
	    button.setBounds(185, 479, 117, 24);
	    panel.add(button);
	    frame.setVisible(true);
	    
	}
	
	
    public Receita exportadorReceita(){
    	 return rec01;
    }
}
