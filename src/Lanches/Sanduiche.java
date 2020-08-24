package Lanches;
import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche {
	private List<String> ingredientes = new ArrayList<>();
	private int tempo;
	private double preco = 6.5;
	
	@Override
	public int tempoEntrega (int distancia) {
		return (distancia*10)+15;
	}

	@Override
	public double getPreco() {
		return super.getPreco();
	}
	
	@Override
	public void setPreco(double preco) {
		super.setPreco(this.preco);
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
}
