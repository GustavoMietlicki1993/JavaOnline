package br.com.abc.javacore.associacao.classes;

public class Local {
	private String rua;
	private String bairro;

	public Local(String rua, String bairro) {

		this.rua = rua;
		this.bairro = bairro;
	}

	public Local() {
	}

	public void print() {
		System.out.println("----------- RELATORIO DE LOCAL -----------");
		System.out.println("Local, rua: " + this.rua+", ");
		System.out.println("bairro: " + this.bairro+". ");
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
