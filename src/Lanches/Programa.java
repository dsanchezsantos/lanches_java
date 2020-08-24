package Lanches;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Escolha entre as opções: [1]Sanduiche [2]Massas [3]Bolos");
		int numeroPedido = p.nextInt();

		if (numeroPedido == 1) {
			menuSanduiche();
		} else if (numeroPedido == 2) {
			menuMassas();
		} else if (numeroPedido == 3) {
			menuBolos();
		}
		
	}
	
	public static void menuSanduiche () {
		Scanner x = new Scanner(System.in);
		
		Sanduiche sanduiche = new Sanduiche();
		List<String> ingredientes = new ArrayList<>();
		
		System.out.println("Escolha os ingredientes (digite e pressione Enter para confirmar cada ingrediente) [0 -> SAIR]");
		String pedido = x.next();
		
		while (!pedido.equals("0")) {
			ingredientes.add(pedido);
			pedido = x.next();		
		}
		
		sanduiche.setIngredientes(ingredientes);
		
		System.out.println("Qual a sua distância do seu restaurante ?");
		int km = x.nextInt();
		sanduiche.setTempo(sanduiche.tempoEntrega(km));
		sanduiche.setPreco(0);
		
		System.out.println("[Preco : " + sanduiche.getPreco() + ", Tempo de Chegada : " + sanduiche.getTempo() + "min]");
	}
	
	public static void menuMassas () {
		Scanner x = new Scanner(System.in);
		Massas massa = new Massas();
		
		System.out.println("Escolha o molho :");
		massa.setMolho(x.next());
		x.nextLine();
		
		System.out.println("Escolha o tipo de massa : [1]Macarrão [2]Pizza [3]Lasanha");
		massa.setMassa(x.nextInt());
		x.nextLine();
		
		massa.setPreco(0);
		
		System.out.println("Qual a sua distância do restaurante ?");
		massa.setTempo(massa.tempoEntrega(x.nextInt()));
		
		System.out.println("[Preco :" + massa.getPreco() + ", Tempo de Chegada : " + massa.getTempo() + "min]");
		
	}
	
	public static void menuBolos () {
		Scanner x = new Scanner(System.in);
		Bolos bolo = new Bolos();
		
		System.out.println("Sabor de Massa : ");
		bolo.setMassa(x.next());
		x.nextLine();
		System.out.println("Sabor do Recheio : ");
		bolo.setRecheio(x.next());
		x.nextLine();
		System.out.println("Sabor da Cobertura : ");
		bolo.setCobertura(x.next());
		x.nextLine();
		
		
		System.out.println("Qual sua distância do restaurante ?");
		bolo.setTempo(bolo.tempoEntrega(x.nextInt()));
		
		bolo.setPreco(0);
		
		System.out.println("[Preco : " + bolo.getPreco() + ", Tempo de Chegada : " + bolo.getTempo() + "min]");
		
	}
}
