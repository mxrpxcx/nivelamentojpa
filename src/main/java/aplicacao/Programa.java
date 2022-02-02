package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Teste", "T@T.T");
		Pessoa p2 = new Pessoa(2, "Teste2", "T2@T.T");
		Pessoa p3 = new Pessoa(3, "Teste3", "T3@T.T");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
