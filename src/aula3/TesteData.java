package aula3;

public class TesteData {
	public static void main(String[] args) {
		Data hoje = new Data(25, 05, 2016);
		
		int mes = hoje.getMes();
		System.out.println("Mês " + mes);
		System.out.println(hoje.toString());
		
		hoje.setMes(10);
		mes = hoje.getMes();
		System.out.println("Mês " + mes);
		hoje.incrementarAno();
		System.out.println(hoje.toString());
		
		hoje.incrementarAno(3);
		System.out.println(hoje.toString());
	}
}
