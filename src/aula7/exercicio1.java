package aula7;

import java.util.Arrays;

public class exercicio1 {

	public static void main(String[] args) {
		String[] animais = {"cachorro", "gato", "passaro", "ema", "peixe", "ornitorrinco", "egua"};
		
		//item (a)
		Arrays.sort(animais, (o1, o2) -> o1.length() - o2.length());
		System.out.println("Item (a)");
		System.out.println(Arrays.toString(animais));
		
		//item (b)
		Arrays.sort(animais, (o1, o2) -> o2.length() - o1.length());
		System.out.println("Item (b)");
		System.out.println(Arrays.toString(animais));
		
		//item (c)
		Arrays.sort(animais, (o1, o2) -> o1.toLowerCase().charAt(0) - o2.toLowerCase().charAt(0));
		System.out.println("Item (c)");
		System.out.println(Arrays.toString(animais));
		
		//item (d)
		Arrays.sort(animais, (o1, o2) -> {
			if(o1.toLowerCase().contains("e")) {
				return -1;
			}
			return 0;
		});
		System.out.println("Item (d)");
		System.out.println(Arrays.toString(animais));
		
		//item (e)
		Arrays.sort(animais, (o1, o2) -> contemE(o1, o2));
		System.out.println("Item (e)");
		System.out.println(Arrays.toString(animais));
	}
	
	public static int contemE(String o1, String o2) {
		if(o1.toLowerCase().contains("e")) {
			return -1;
		}
		return 0;
	}
}
