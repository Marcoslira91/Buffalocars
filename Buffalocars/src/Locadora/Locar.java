package Locadora;

import java.util.Scanner;
import Veiculo.*;
import Pessoas.*;

public class Locar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Marca auto[] = new Marca[30];
		Cliente novoCliente = new Cliente();

		System.out.println("Informe o nome: ");
		novoCliente.setNome(input.nextLine());
		// System.out.println(novoCliente.getNome());

		Automovel novoAutomovel = new Automovel(null, null, 0, null, 0, null, null, null);

		System.out.println("Informe a placa: ");
		novoAutomovel.setPlaca(input.nextLine());
		System.out.println(novoAutomovel.getPlaca());
	}
}
