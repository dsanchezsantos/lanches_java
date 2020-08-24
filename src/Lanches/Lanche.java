package Lanches;

public abstract class Lanche {
	private double preco;
	
	public abstract int tempoEntrega (int distancia);

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
