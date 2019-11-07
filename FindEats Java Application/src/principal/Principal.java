package principal;
import java.awt.EventQueue;

import runnable.LoginRunnable;
public class Principal {

	public static void main(String[] args) {
		
		LoginRunnable jfr = new LoginRunnable();
		EventQueue.invokeLater(jfr);
		
	}

}
