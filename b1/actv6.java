package b1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class actv6 {

	public static void main(String[] args) {
		List<String>ejemplo = Arrays.asList("Pues ná, ella me dijo que no ni ná");
		System.out.println(valoresRepetidos(ejemplo));
	}
	
	public static Set<String> valoresRepetidos(List<String> cadena){
		Set<String> solucion = new TreeSet<>();
		int numeroVecesRepetidos = 0;
		for(int i=0;i<cadena.size();i++) {
			for(int j=0;j<cadena.size();j++) {
				numeroVecesRepetidos=0;
				if(cadena.get(j)==cadena.get(i)) {
					numeroVecesRepetidos++;
					if(numeroVecesRepetidos>1) {
						solucion.add(cadena.get(i));
				}
				}
			}
		}
	return solucion;}
}
