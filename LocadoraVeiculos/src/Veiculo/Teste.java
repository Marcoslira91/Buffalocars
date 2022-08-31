package Veiculo;
import java.util.scanner;
import Marca;
public class Teste {

	public static void main(String[] args) {
	/*	
	Marca auto1 = new Marca("RTI 1C34","Preto",4, "Flex",100.0,"Hatch",5,1.6,"VolksWagen Gol");
	Marca auto2= new Marca("RTO 2F93", "Prata", 4, "Flex", 100.0, "Hatchback", 5,1.0, "Fiat UNO");
	Marca auto3= new Marca("PHL 4O75", "Laranja", 4, "Elétrico", 250.0,"Hatch",5,1.4,"Peugeot e-208 GT");
	Marca auto4= new Marca("BRR 4T66", "Vermelho",4,"Flex", 110.0, "Sedan",5,1.0,"Ford KA");
	Marca auto5= new Marca("EUA 3G08", "Prata", 2,"Diesel",300.0,"Pickup", 2,2.8,"Chevrolet S-10");
	Marca auto6= new Marca("TIE 4A12", "Branco",4,"Alcool",60.0 ,"SUV",5,1.5,"Honda HRV");
	Marca auto7= new Marca("JUI 8P98","Cinza",3,"Flex",200.0,"MiniVan",8,1.8,"Fiat Doblo" );
	Marca auto8= new Marca("TAE 6R33", "Azul", 2,"Gasolina",330.0,"Couper",2,2.0,"BMW Cooper");
	Marca auto9= new Marca("PET 7Y25", "Preto",2,"Flex",150.0,"PickUp",2,1.4,"Chevrolet Montana");
	Marca auto10= new Marca("RYU 8I90","Prata Sand",4,"Flex",85,"Sedan",5,1.6,"Hyundai HB20S");
	*/
	 Scanner input= new Scanner(System.in);
	 Marca auto[]=new Marca[30];
	 
	auto[]= Cadastrar_veiculo(Marca[]);

	}
	public Marca Cadastrar_veiculo(Marca lista[]) {
		
		for(int i =0; i<30;i++) {
		System.out.println("Digite as seguintes a tribuições em ordem para cadastrar um veículo.\nAo término de digitar cada pressione enter.");
		System.out.println("Placa\nCor\n\nNumero de portas\nTipo de combustivel\nValor de localção\nTipo de carro\nQuantas pessoas\nTipo do motor\nNome do modelo");
		
		Marca[i]=input.nextMarca();		
		
		System.out.println("Deseja parar? Pressione S ou s.");
	    char decis= new char();
		decis=input.nextChar();
		
		if(decis== 's' || 'S') {
			break;
			return 0;
		}
	}
		return lista[];
}
		
	}
}
	
