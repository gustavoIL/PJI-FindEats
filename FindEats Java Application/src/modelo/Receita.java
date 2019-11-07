package modelo;

public class Receita {
	
	private String nome, modoPreparo, tipo, ig01, ig02, ig03, ig04;
	public Receita (String nome, String modoPreparo, String tipo, String ig01, String ig02, String ig03, String ig04) {
		this.nome = nome;
		this.modoPreparo = modoPreparo;
		this.tipo = tipo;
		this.ig01 = ig01;
		this.ig02 = ig02;
		this.ig03 = ig03;
		this.ig04 = ig04;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModoPreparo() {
		return modoPreparo;
	}
	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIg01() {
		return ig01;
	}
	public void setIg01(String ig01) {
		this.ig01 = ig01;
	}
	public String getIg02() {
		return ig02;
	}
	public void setIg02(String ig02) {
		this.ig02 = ig02;
	}
	public String getIg03() {
		return ig03;
	}
	public void setIg03(String ig03) {
		this.ig03 = ig03;
	}
	public String getIg04() {
		return ig04;
	}
	public void setIg04(String ig04) {
		this.ig04 = ig04;
	}

}
