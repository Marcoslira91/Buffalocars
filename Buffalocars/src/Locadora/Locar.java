package Locadora;

import java.util.Scanner;
import Veiculo.*;
import Pessoas.*;

public class Locar {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cliente novoCliente = new Cliente();
		Automovel novoAutomovel = new Automovel(null, null, 0, null, 0, null, 0, 0, null);
		Marca marca = new Marca();
		Modelo modelo = new Modelo(null, 0, 0);

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

			marca.setNome(leia.nextLine());// Não pode apagar
			System.out.println("Informe o nome da marca do veiculo: ");
			marca.setNome(leia.nextLine());
			System.out.println("Informe o modelo do veiculo: ");
			marca.setDescricao(leia.nextLine());
			novoAutomovel.setMarcaAutomovel(marca);
			System.out.println("Informe a categoria do veiculo: ");
			modelo.setCategoria(leia.nextLine());
			System.out.println("Informe a capacidade do veiculo: ");
			modelo.setCapacidade(leia.nextInt());
			System.out.println("Informe o motor do veiculo: ");
			modelo.setMotor(leia.nextDouble());
			System.out.println("Informe a placa do Veiculo: ");
			novoAutomovel.setPlaca(leia.next());
			System.out.println("Informe a cor do veiculo: ");
			novoAutomovel.setCor(leia.next());
			System.out.println("Informe o numero de portas: ");
			novoAutomovel.setNumPorta(leia.nextInt());
			System.out.println("Informe o valor para locação: ");
			novoAutomovel.setValorLocacao(leia.nextDouble());
			break;

		case 2:
			System.out.println("Informe a placa do veículo a ser atualizado: ");
			novoAutomovel.setPlaca(leia.next());
			System.out.println("Qual informação deseja atualizar: \n1 - Valor da locação.\n2 - Cor do veiculo\n3");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o valor para locação: ");
				novoAutomovel.setValorLocacao(leia.nextDouble());
				break;
			case 2:
				System.out.println("Informe a cor atual do veiculo: ");
				novoAutomovel.setCor(leia.nextLine());
				break;
			}

			break;

		case 3:
			System.out.println("Informe um Id para o Cliente: ");
			novoCliente.setId(leia.nextInt());
			System.out.println("Informe o nome: ");
			novoCliente.setNome(leia.nextLine());
			System.out.println("Idade: ");
			novoCliente.setIdade(leia.nextInt());
			System.out.println("Sexo ");
			novoCliente.setSexo(leia.nextLine());			
			System.out.println("CPF: ");
			novoCliente.setCpf(leia.nextLong());
			System.out.println("CNH: ");
			novoCliente.setCnh(leia.nextLong());
			System.out.println("End.: ");
			novoCliente.setEnd(leia.nextLine());
			System.out.println("Fone: ");
			novoCliente.setFone(leia.nextLong());
			System.out.println("E-mail: ");
			novoCliente.setEmail(leia.nextLine());
			break;

		case 4:
			System.out.println("Informe o ID do cliente: ");
			novoCliente.setId(leia.nextInt());
			System.out.println("Qual informação deseja atualizar?");
			System.out.println("1 - Endereço");
			System.out.println("2 - Telefone");
			System.out.println("3 - E-mail");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o endereço: ");
				novoCliente.setEnd(leia.nextLine());
				break;
			case 2:
				System.out.println("Informe o telefone: ");
				novoCliente.setFone(leia.nextLong());
				break;
			case 3:
				System.out.println("Informe o e-mail: ");
				novoCliente.setEmail(leia.nextLine());
			}
			break;

		default:
			break;
		}
		System.out.println("Escolha uma opção");
		System.out.println("1 - Ver carro");
		System.out.println("2 - Ver cliente");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(marca.getNome());
			System.out.println(marca.getDescricao());
			System.out.println(modelo.getCategoria());
			System.out.println(modelo.getCapacidade());
			System.out.println(modelo.getMotor());
			System.out.println(novoAutomovel.getPlaca());
			System.out.println(novoAutomovel.getCor());
			System.out.println(novoAutomovel.getNumPorta());
			System.out.println(novoAutomovel.getValorLocacao());
			break;
			
		case 2:
			System.out.println(novoCliente.getId());			
			System.out.println(novoCliente.getNome());			
			System.out.println(novoCliente.getIdade());			
			System.out.println(novoCliente.getSexo());						
			System.out.println(novoCliente.getCpf());			
			System.out.println(novoCliente.getCnh());			
			System.out.println(novoCliente.getEnd());			
			System.out.println(novoCliente.getFone());			
			System.out.println(novoCliente.getEmail());			
			break;
		}
	}
}
