package modelo;

public class Usuario {
	private String nome,sobrenome,email,confEmail,senha,confSenha;
	private int  idade;
	private char sexo;
	public Usuario(String nome, String sobrenome, String email, String  confEmail, String senha, String confSenha, int idade, char sexo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.confEmail = confEmail;
		this.senha = senha;
		this.confSenha = confSenha;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfEmail() {
		return confEmail;
	}
	public void setConfEmail(String confEmail) {
		this.confEmail = confEmail;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfSenha() {
		return confSenha;
	}
	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
