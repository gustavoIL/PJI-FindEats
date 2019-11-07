
package runnable;
import javax.swing.*;

import dao.UsuarioDAO;
import modelo.Usuario;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;

public class LoginRunnable implements Runnable {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * @wbp.parser.entryPoint
	 */
	
	public void run() {
		final JFrame frame = new JFrame("Efetuar Login");
 
        JButton btnGet = new JButton("Criar Conta");
        btnGet.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
        	CadastroRunnable jfrr = new CadastroRunnable();
    		EventQueue.invokeLater(jfrr);
    		frame.setVisible(false);
        }
        	
        });
 
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Usuario usuario = new Usuario(textField.getText(), textField_1.getText());
        		
        		UsuarioDAO usuarioDAO = null;
        		if(usuarioDAO.selectUsuario(usuario) != null) {
        			PerfilRunnable jfrr = new PerfilRunnable();
        			EventQueue.invokeLater(jfrr);
        			frame.setVisible(false);        			
        		} else {
        			JOptionPane.showMessageDialog(null, "Login inválido");
        		}
        	}
        });
 
        JPanel panel = new JPanel();
        SpringLayout sl_panel = new SpringLayout();
        sl_panel.putConstraint(SpringLayout.SOUTH, btnLogin, -10, SpringLayout.SOUTH, panel);
        sl_panel.putConstraint(SpringLayout.NORTH, btnGet, 0, SpringLayout.NORTH, btnLogin);
        sl_panel.putConstraint(SpringLayout.WEST, btnGet, 6, SpringLayout.EAST, btnLogin);
        panel.setLayout(sl_panel);
        panel.add(btnLogin);
        panel.add(btnGet);
 
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(306, 154);
        frame.getContentPane().add(panel);
        
        JLabel lblLogin = new JLabel("Email:");
        sl_panel.putConstraint(SpringLayout.NORTH, lblLogin, 13, SpringLayout.NORTH, panel);
        sl_panel.putConstraint(SpringLayout.WEST, lblLogin, 10, SpringLayout.WEST, panel);
        lblLogin.setFont(new Font("Microsoft Tai Le", Font.BOLD, 13));
        panel.add(lblLogin);
        
        JLabel lblSenha = new JLabel("Senha:");
        sl_panel.putConstraint(SpringLayout.WEST, lblSenha, 0, SpringLayout.WEST, lblLogin);
        sl_panel.putConstraint(SpringLayout.SOUTH, lblSenha, -49, SpringLayout.SOUTH, panel);
        lblSenha.setFont(new Font("Microsoft Tai Le", Font.BOLD, 13));
        panel.add(lblSenha);
        
        textField = new JTextField();
        sl_panel.putConstraint(SpringLayout.WEST, btnLogin, 0, SpringLayout.WEST, textField);
        sl_panel.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblLogin);
        sl_panel.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblLogin);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JPasswordField();
        sl_panel.putConstraint(SpringLayout.NORTH, textField_1, -3, SpringLayout.NORTH, lblSenha);
        sl_panel.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
        panel.add(textField_1);
        textField_1.setColumns(10);
        frame.setVisible(true);
	}
}
