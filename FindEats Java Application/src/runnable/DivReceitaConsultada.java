package runnable;

import javax.swing.JLabel;

public class DivReceitaConsultada {
	private String nome;
	private String tipo;
	private String modoPreparo;
	private String ingr01;
	private String ingr02;
	private String ingr03;
	private String ingr04;
	private JLabel lblTipoRec;
	private JLabel lblNomeRec;
	
	public DivReceitaConsultada(String nome, String tipo, String modoPreparo, String ingr01, String ingr02, String ingr03, String ingr04) {
		this.nome = nome;
		this.tipo = tipo;	
		this.modoPreparo = modoPreparo;
		this.ingr01 = ingr01;
		this.ingr02 = ingr02;
		this.ingr03 = ingr03;
		this.ingr04 = ingr04;
		this.lblNomeRec = new JLabel("Nome: " + this.nome);
		this.lblTipoRec = new JLabel("Tipo: " + this.tipo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModoPreparo() {
		return modoPreparo;
	}

	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}

	public String getIngr01() {
		return ingr01;
	}

	public void setIngr01(String ingr01) {
		this.ingr01 = ingr01;
	}

	public String getIngr02() {
		return ingr02;
	}

	public void setIngr02(String ingr02) {
		this.ingr02 = ingr02;
	}

	public String getIngr03() {
		return ingr03;
	}

	public void setIngr03(String ingr03) {
		this.ingr03 = ingr03;
	}

	public String getIngr04() {
		return ingr04;
	}

	public void setIngr04(String ingr04) {
		this.ingr04 = ingr04;
	}
}
