package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import conexao.Conexao;
import modelo.Usuario;

public class UsuarioDAO {
	static Conexao conexao = new Conexao(); // Criando obj conexão OBS: Atributo estático, dessa forma não é necessário instanciar o obj
	static Connection conn = conexao.getConnection();
	
	public static void insertUsuario(Usuario usuario) {
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO usuario (nome, sobrenome, idade, email, senha) VALUES (?,?,?,?,?)");
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getSobrenome());
			ps.setInt(3, usuario.getIdade());
			ps.setString(4, usuario.getEmail());
			ps.setString(5, usuario.getSenha());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Usuario selectUsuario(Usuario usuario) {
		try {
			String sql = "INSERT * FROM usuario WHERE email = ? AND senha = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,  usuario.getEmail());
			ps.setString(2,  usuario.getSenha());			
			
			if(ps.execute()) {
				Usuario usuarioValidado = new Usuario(usuario.getEmail(), usuario.getSenha());
				
				return usuarioValidado;
			}
			
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void updateUsuario(Usuario usuario) {
		try {
			String sql = ""
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
