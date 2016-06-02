package aula6;

import java.util.List;

public abstract class Veiculo implements Exibivel{
	protected String placa;
	protected Long chassi;
	protected int ano;
	protected int peso;
	protected double velocMax;
	protected double preco;
	protected int capacidade;
	
	private Motor motor;
	private List<Peca> pecas;
	
	public Veiculo() {
		this.placa = "";
		this.chassi = 0L;
		this.ano = 0;
		this.peso = 0;
		this.velocMax = 0;
		this.preco = 0;
		this.capacidade = 0;
	}

	public Veiculo(String placa, Long chassi, int ano, 
			int peso, double velocMax, double preco, int capacidade) {
		this.placa = placa;
		this.chassi = chassi;
		this.ano = ano;
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
		this.capacidade = capacidade;
	}

	@Override
	public void exibir() {
		System.out.println("placa: " + placa);
		System.out.println("chassi: " + chassi);
		System.out.println("ano: " + ano);
		System.out.println("peso: " + peso);
		System.out.println("velocMax: " + velocMax);
		System.out.println("capacidade: " + capacidade);
	}
	
	public void aumentaPreco(double aumento) {
		this.preco += aumento;
	}
	
	public void reduzirPreco(double reduzir) {
		this.preco -= reduzir;
	}
	
	public void incluirPeca(Peca peca) {
		this.pecas.add(peca);
	}
	
	public void removerPeca(Peca peca) {
		this.pecas.remove(peca);
	}
	
	public Peca consultarPeca(int codigo) {
		for(Peca p : pecas) {
			if(p.getCodigo() == codigo) {
				return p;
			}
		}
		
		System.out.println("Código não encontrado");
		return null;
	}
	
	/* GETTERS AND SETTERS */
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Long getChassi() {
		return chassi;
	}

	public void setChassi(Long chassi) {
		this.chassi = chassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(double velocMax) {
		this.velocMax = velocMax;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public List<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	}
}
