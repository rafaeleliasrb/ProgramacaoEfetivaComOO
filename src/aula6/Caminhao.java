package aula6;

public class Caminhao extends Veiculo{

	private double toneladas;
	private double alturaMax;
	private double comprimento;

	public Caminhao() {
		super("", 0L, 0, 0, 0.0, 0.0, 0);
		this.toneladas = 0.0;
		this.alturaMax = 0.0;
		this.comprimento = 0.0;
	}
	
	public Caminhao(double toneladas, double alturaMax, double comprimento,
			String placa, Long chassi, int ano, 
			int peso, double velocMax, double preco, int capacidade) {
		super(placa, chassi, ano, peso, velocMax, preco, capacidade);
		this.toneladas = toneladas;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}

	public void exibir() {
		super.exibir();
		System.out.println("toneladas: " + toneladas);
		System.out.println("alturaMax: " + alturaMax);
		System.out.println("comprimento: " + comprimento);
	}

	public double getToneladas() {
		return toneladas;
	}
	public void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}
	public double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
}
