package br.com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {
	// 1- Alocado espaco na memoria para o objeto que sera criado
	// 2- Cada atributo de classe é criado e incializado com seus valores default ou
	// valores explicitos
	// 3- Bloco de inicializacao e executado
	// 4- O constructor e executado

	private int[] parcelas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
	{
		System.out.println("Dentro do bloco de incializacao");
		parcelas = new int[100];
		for (int i = 1; i <= 100; i++) {
			parcelas[i -1] = i;
		}

	}

	public Cliente() {
		System.out.println("Dentro do constructor");
		for (int parcela : this.parcelas) {
			System.out.print(parcela + " ");
		}
	}

	public int[] getParcelas() {
		return parcelas;
	}

	private void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
}
