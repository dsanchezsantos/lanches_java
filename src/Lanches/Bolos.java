package Lanches;

public class Bolos extends Lanche {
	private int tempo;
	String massa;
	String recheio;
	String cobertura;
	private double preco = 2.5;
	
	@Override
	public int tempoEntrega(int distancia) {
		return (distancia*10) + 10;
	}
	
	@Override
	public double getPreco() {
		return super.getPreco();
	}
	
	@Override
	public void setPreco(double preco) {
		super.setPreco(this.preco);
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

}
