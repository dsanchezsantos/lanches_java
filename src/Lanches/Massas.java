package Lanches;

public class Massas extends Lanche {
	private int tempo;
	private double preco = 8.0;
	private String molho;
	private int massa;

	@Override
	public int tempoEntrega(int distancia) {
		return (distancia*10) + 30;
	}
	
	@Override
	public double getPreco() {
		return super.getPreco();
	}
	
	@Override
	public void setPreco(double preco) {
		super.setPreco(this.preco);
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public int getMassa() {
		return massa;
	}

	public void setMassa(int massa) {
		this.massa = massa;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

}
