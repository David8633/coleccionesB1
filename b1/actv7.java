package b1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class actv7<E>{

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(1);
		lista1.add(6);
		lista1.add(3);
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(4);
		lista2.add(5);
		lista2.add(3);
		
		System.out.println(union(lista1,lista2));
		System.out.println(iterseccion(lista1,lista2));
		System.out.println(diferencia(lista1,lista2));

	}

	public static <E> Set<E> union(List<E> lista1,List<E> lista2  ){
		Set<E> resultado = new TreeSet<>();
		resultado.addAll(lista1);
		resultado.addAll(lista2);
		return resultado;
	}
	
	public static <E> Set<E> iterseccion(List<E> lista1,List<E> lista2  ){
		List<E> resultado = new ArrayList<>();
		resultado.addAll(lista1);
		for(int i = 0;i<resultado.size()-1;i++) {
			if(!lista2.contains(resultado.get(i))) {
				resultado.remove(resultado.get(i));
			}
		}
		Set<E> resultadofinal = new TreeSet<>();
		resultadofinal.addAll(resultado);
		return resultadofinal;
	}
	
	public static <E> Set<E> diferencia(List<E> lista1,List<E> lista2  ){
		List<E> resultado = new ArrayList<>();
		resultado.addAll(lista1);
		for(int i = 0;i<resultado.size();i++) {
			if(lista2.contains(resultado.get(i))) {
				resultado.remove(resultado.get(i));
			}
		}
		Set<E> resultadofinal = new TreeSet<>();
		resultadofinal.addAll(resultado);
		return resultadofinal;
	}
	
	
}
