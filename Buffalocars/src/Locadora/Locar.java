package Locadora;

import java.util.Scanner;
import Veiculo.*;
import Pessoas.*;

public class Locar {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cliente novoCliente = new Cliente();
		Automovel novoAutomovel = new Automovel(null, null, 0, null, 0, null, null, null);
		Marca marca = new Marca();
		Modelo modelo = new Modelo(null, 0, 0);
		Scanner sc = new Scanner(System.in);

		// variaveis
		int opcao = 0;

		System.out.println("PROGRAMA LOCADORA");
		System.out.println("Digite o número da opção:");
		System.out.println("1 - Cadastra automovel");
		System.out.println("2 - Atualizar automovel");
		System.out.println("3 - Cadastra cliente");
		System.out.println("4 - Atualizar cliente");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:

			System.out.println("Informe o nome da marca do veiculo: ");
			marca.setNome(leia.nextLine());
			System.out.println("Informe o nome da descricao do veiculo: ");
			marca.setDescricao(leia.nextLine());
			novoAutomovel.setMarcaAutomovel(marca);
			System.out.println("Informe a categoria do veiculo: ");
			modelo.setCategoria(leia.nextLine());
			System.out.println("Informe a capacidade do veiculo: ");
			modelo.setCapacidade(leia.nextInt());
			System.out.println("Informe a motor do veiculo: ");
			modelo.setMotor(leia.nextDouble());
			System.out.println("Informe a Placa do Veiculo: ");
			novoAutomovel.setPlaca(leia.next());
			System.out.println("Informe a cor do veiculo: ");
			novoAutomovel.setCor(leia.next());
			sc.next();
			System.out.println("Informe o numero de portas: ");
			novoAutomovel.setNumPorta(leia.nextInt());
			System.out.println("Informe o valor para locação: ");
			novoAutomovel.setValorLocacao(leia.nextDouble());

			break;

		case 2:
			System.out.println("Informe a placa do veículo a ser atualizado: ");
			novoAutomovel.setPlaca(leia.next());
			System.out.println("Qual informação deseja atualizar: \n1 - Valor da locação.\n2 - Cor do veiculo\n3 - Desativar veiculo.");
			sc.next();
			//novoAutomovel.setPlaca(leia.next());
			switch (opcao) {
			case 1:
				System.out.println("Informe o valor para locação: ");
				novoAutomovel.setValorLocacao(leia.nextDouble());
				break;
			case 2:
				System.out.println("Informe a cor atual do veiculo: ");
				novoAutomovel.setCor(leia.next());
				//sc.next();
				//break;
			}
			break;

		case 3:
			System.out.println("Informe o nome: ");
			novoCliente.setNome(leia.nextLine());
			sc.next();
			System.out.println("Idade: ");
			novoCliente.setIdade(leia.nextInt());
			// System.out.println("Sexo ");
			// novoCliente.setSexo(leia.next());
			System.out.println("CPF ");
			novoCliente.setCpf(leia.nextLong());
			break;

		case 4:
			System.out.println("Informe o CPF do cliente a ser atualizado: ");
			novoCliente.setCpf(leia.nextLong());
			sc.next();
			System.out.println("Idade: ");
			novoCliente.setIdade(leia.nextInt());
			// System.out.println("Sexo ");
			// novoCliente.setSexo(leia.next());
			System.out.println("CPF ");
			novoCliente.setCpf(leia.nextLong());
			break;

		default:
			break;
		}
	}
}
