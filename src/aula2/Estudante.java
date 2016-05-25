package aula2;

public class Estudante {

	public int matricula;
	public String nome;
	public char sexo;
	public double[] notas;

	public Estudante() {
		//chama o outro construtor
		this(2000001, "Maria", 'F');
		this.notas = new double[4];
	}
	
	public Estudante(int matricula, String nome, char sexo) {
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.notas = new double[4];
	}
	
	public Estudante(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
		this.notas = new double[4];
	}
	
	public void exibir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Sexo: " + this.sexo);
	}
	
	public void exibir(String titulo) {
		System.out.println(titulo);
		exibir();
	}
	
	public void atribuirNota(int numProva, double nota) {
		if(numProva > 4 || numProva < 1) {
			System.out.println("Número de prova inválido.");
		}
		else {
			notas[numProva-1] = nota;
		}
	}
	
	//SOBRECARGA( alteração da assinatura do método nomeDoMetodo(paramentros) )
	public void atribuirNota(int indice) {
		if(indice > 4 || indice < 1) {
			System.out.println("Número de prova inválido.");
		}
		else {
			notas[indice-1] = 0.0;
		}
	}
	
	public Double lerNota(int numProva) {
		if(numProva > 4 || numProva < 1) {
			System.out.println("Número de prova inválido.");
			return null;
		}
		else {
			return notas[numProva-1];
		}
	}
}
