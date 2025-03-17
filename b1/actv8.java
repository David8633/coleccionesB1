package b1;

import java.util.ArrayList;
import java.util.List;

public class actv8 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(5);
		lista.add(9);
		lista.add(1);
		lista.add(4);
		lista.add(7);
		
		System.out.println(mayor(lista));
		System.out.println(menor(lista));
		System.out.println(media(lista));
		System.out.println(mediana(lista));
		System.out.println(varianza(lista));
		System.out.println(rango(lista));
	}

	public static int mayor(List<Integer> lista){
		int mayor =0;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)>mayor) {
				mayor=lista.get(i);
			}
		}
	return mayor; }
	
	public static int menor(List<Integer> lista){
		int menor = mayor(lista);
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)<menor) {
				menor=lista.get(i);
			}
		}
	return menor; }
	
	
	public static int media(List<Integer> lista){
		int suma =0;
		
		for(int i=0;i<lista.size();i++) {
			suma+=lista.get(i);
		}
	
	return suma/lista.size();
}
	
	public static int rango(List<Integer> lista){
	return mayor(lista)-menor(lista);
}
	
	public static int mediana(List<Integer> lista){
		int resultado =0;
		if(lista.size()%2==0) {
			int n1 =lista.get(lista.size()/2);
			int n2 =lista.get((lista.size()/2)+1);
			resultado = (n1 +n2)/2;
		}else {
			resultado=lista.size()/2;
		}
		
		return resultado;}
	
	
	public static double varianza(List<Integer> lista) {
		double media = media(lista);
		double sumaDiferenca = 0;
		for(Integer n:lista) {
			sumaDiferenca+=Math.pow((n-media),2);
		}
	return sumaDiferenca/lista.size();}


}
