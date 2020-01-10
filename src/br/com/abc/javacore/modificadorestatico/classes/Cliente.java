package br.com.abc.javacore.modificadorestatico.classes;

public class Cliente {
	// 1- Bloco de inicializacao static é executado quando o JVM carregar a classe
	// (é executado apenas uma vez)
	// 2- Alocado espaco na memoria para o objeto que sera criado
	// 3- Cada atributo de classe é criado e incializado com seus valores default ou
	// valores explicitos
	// 4- Bloco de inicializacao e executado
	// 5- O constructor e executado

	private static int[] parcelas;
	static {
		System.out.println("Dentro do bloco de incializacao");
		parcelas = new int[100];
		for (int i = 1; i <= 100; i++) {
			parcelas[i - 1] = i;
		}

	}

	public Cliente() {
		System.out.println("Dentro do constructor");
		for (int parcela : this.parcelas) {
			System.out.print(parcela + " ");
		}
	}

	public static int[] getParcelas() {
		return parcelas;
	}

}
