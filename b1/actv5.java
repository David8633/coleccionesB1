package b1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class actv5 {

	public static void main(String[] args) {
		List<Integer> repetidos = new ArrayList<>();
		repetidos.add(2);
		repetidos.add(2);
		repetidos.add(2);
		repetidos.add(31);
		repetidos.add(2);
		repetidos.add(10);
		repetidos.add(10);
		
		System.out.println(noRepetidos(repetidos));
		
		
	}

	public static Set<Integer> noRepetidos(List<Integer> repetidos) {
		Set<Integer> noRepetidos = new HashSet<>();
		noRepetidos.addAll(repetidos);
		return noRepetidos;
	}
}
