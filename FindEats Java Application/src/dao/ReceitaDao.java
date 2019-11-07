package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;
import com.mysql.jdbc.Statement;

import conexao.Conexao;
import modelo.Receita;
import runnable.ConsultarReceitaRunnable;

import runnable.DivReceitaConsultada;


public class ReceitaDao {
	private DivReceitaConsultada divReceita;
	private ConsultarReceitaRunnable telaConsultarReceitas;
	
	static Conexao conexao = new Conexao(); // Criando obj conexão OBS: Atributo estático, dessa forma não é necessário instanciar o obj
	static Connection conn = conexao.getConnection(); //Fazendo a conexão com o bdd OBS: Atributo estático, dessa forma não é necessário instanciar o obj
	
	public static void insertRecipe(Receita rec) throws SQLException { // Método estático, dessa forma não é necessario instanciar o obj
		PreparedStatement ps = conn.prepareStatement("INSERT INTO receita (nomeRec,modoPreparo,tipo,ingr01,ingr02,ingr03,ingr04) VALUES(?,?,?,?,?,?,?)");
		ps.setString(1,rec.getNome());
		ps.setString(2,rec.getModoPreparo());
		ps.setString(3,rec.getTipo());
		ps.setString(4,rec.getIg01());
		ps.setString(5,rec.getIg02());
		ps.setString(6,rec.getIg03());
		ps.setString(7,rec.getIg04());
		ps.execute();
		
	}
	
//	public void selectRecipe() {
//		try {
//			
//			PreparedStatement ps = conn.prepareStatement("SELECT * FROM receita");
//			ResultSet rs = ps.executeQuery();					
//			
//			while(rs.next()) {
//				
//				String nomeRec = rs.getString("nomeRec");
//				String modoPreparo = rs.getString("modoPreparo");
//				String tipo = rs.getString("tipo");
//				String ingr01 = rs.getString("ingr01");
//				String ingr02 = rs.getString("ingr02");
//				String ingr03 = rs.getString("ingr03");
//				String ingr04 = rs.getString("ingr04");							
//				
//				ConsultarReceitaRunnable receitasConsultadasView = new ConsultarReceitaRunnable(nomeRec, tipo);
//			}			
//		} catch(Exception e) {
//			System.out.println("Erro!! Mensagem: " + e.getMessage());			
//		}				
//	}
}
