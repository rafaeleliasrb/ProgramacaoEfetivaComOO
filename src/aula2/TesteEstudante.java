package aula2;

public class TesteEstudante {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante(2004001, "Maria Silva", 'F');
		Estudante estudante2 = new Estudante();
		Estudante estudante3 = new Estudante("João", 'M');
		
		estudante1.atribuirNota(1, 7.0);
		estudante1.atribuirNota(2, 8.2);
		estudante1.atribuirNota(3, 6.0);
		estudante1.atribuirNota(4, 5.5);
		
		estudante1.exibir();
		
		System.out.println("Notas: ");
		for(int i = 0; i < 4 ; i++) {
			System.out.println("Prova " + (i+1) + " = " + estudante1.lerNota(i+1));
		}
		
		estudante2.atribuirNota(1, 7.0);
		estudante2.atribuirNota(2, 5.0);
		estudante2.atribuirNota(3);
		estudante2.atribuirNota(4, 8.5);
		estudante2.exibir("Dados do estudante");
		
	}
}
