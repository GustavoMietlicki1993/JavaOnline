package br.com.abc.introducao;
import java.util.Scanner;
public class ExercicioControleFluxo1 {
	public static void main(String[] args) {
		/*
		Crie uma variavel Salario e imprima seu imposto
		imposto:
		Salario < 1000 5%
		Salario >= 1000 && salario < 2000 10%
		Salario >= 1000 && salario < 4000 15%
		Salario > 5000 20%
		*/
		int salario, comissao;
		salario = 1100;
		
		if(salario< 1000) {
			comissao = ( salario / 100) * 5;
			salario = salario + comissao;
			System.out.println(salario);
			
		}else if(salario>=1000 && salario<2000) {
			comissao = ( salario / 100) * 10;
			salario = salario + comissao;
			System.out.println(salario);
			
		}else if(salario>=2000 && salario<4000) {
			comissao = ( salario / 100) * 15;
			salario = salario + comissao;
			System.out.println(salario);
		}else if(salario>=4000 && salario<5000) {
			comissao = ( salario / 100) * 20;
			salario = salario + comissao;
			System.out.println(salario);
		}else {
			System.out.println(salario);
		};
	};  

}
