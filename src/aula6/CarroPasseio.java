package aula6;

public class CarroPasseio extends Veiculo{

	private String cor;
	private String modelo;
	
	public CarroPasseio() {
		super("", 0L, 0, 0, 0.0, 0.0, 0);
		this.cor = "";
		this.modelo = "";
	}
	
	public CarroPasseio(String cor, String modelo, 
			String placa, Long chassi, int ano, 
			int peso, double velocMax, double preco, int capacidade) {
		super(placa, chassi, ano, peso, velocMax, preco, capacidade);
		this.cor = cor;
		this.modelo = modelo;
	}

	public void exibir() {
		super.exibir();
		System.out.println("cor: " + cor);
		System.out.println("modelo: " + modelo);
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
