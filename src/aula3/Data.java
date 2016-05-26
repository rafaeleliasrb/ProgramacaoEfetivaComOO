package aula3;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void incrementarAno() {
		this.ano++;
	}
	
	public void incrementarAno(int n) {
		this.ano+=n;
	}
	
	public void setMes(int mes) {
		if(mes < 13 && mes > 0) {
			this.mes = mes;
		}
		else {
			System.out.println("Mês inválido.");
		}
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
