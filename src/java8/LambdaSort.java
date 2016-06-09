package java8;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSort {

	public static void main(String[] args) {
		String[] testeString = {"fa7", "ufc", "uece", "unifor"};
		
		Arrays.sort(testeString, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		} );
		System.out.println(Arrays.toString(testeString));
		
		Arrays.sort(testeString, (o1, o2) -> o1.length() - o2.length());
		
		System.out.println(Arrays.toString(testeString));
	}
}
