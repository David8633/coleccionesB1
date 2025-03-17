package b1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class atcv1 {
	public static void main(String[] args) {
		System.out.println(rellenarConj());
	
}
	
	public static Set<Integer> rellenarConj() {
		
		Set<Integer> conj = new HashSet<>();
		
		Random r1 = new Random();
		
		for(int i = 0; i<30; i++) {
			conj.add(r1.nextInt(100));
		}
		
	return conj;}
}