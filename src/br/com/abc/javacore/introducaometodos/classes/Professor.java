package br.com.abc.javacore.introducaometodos.classes;
//Crie os seguintes atributos para essa clase: 
//Nome, matricula, Rg, cpf.
//Em seguida crie uma classe de teste para preencher e imprimir os dados deste professor.

public class Professor {
	public String nome;
	public String matricula;
	public String Rg;
	public String cpf;

	public void imprime() {
		System.out.println(this.cpf);
		System.out.println(this.matricula);
		System.out.println(this.nome);
		System.out.println(this.Rg);
		System.out.println("-----------------------------");
	};
}
