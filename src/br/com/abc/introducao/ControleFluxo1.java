package br.com.abc.introducao;

public class ControleFluxo1 {
	public static void main(String[] args) {
		int idade = 10;
		float salario = 1000;
		boolean c = true;
		if(c == false) {
			System.out.println("Não entrou no If true!!!");
		
		}else if(c == false){
			System.out.println("Entrou no If");
		}else if(idade>18) {
			System.out.println("Idade boa para trabalhar");
			
		}else if(idade<18) {
			System.out.println("Vacilão, fica em casa tomando leite e estudando!!");
		}else if(c== true){
			System.out.println("Aperta o Goku");			
		}else{
			System.out.println(idade);
		};
	};
};
