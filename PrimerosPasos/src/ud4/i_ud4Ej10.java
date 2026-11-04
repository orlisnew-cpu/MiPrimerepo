package ud4;

public class i_ud4Ej10 {
public static void main(String[] args) {
//	Dado un array ya inicializado, muestra sus elementos en orden normal y
//	después en orden inverso.
	int valores[]= {10,22,33,44,55};
	
	for(int i =0;i<valores.length;i++) {
		
		System.out.println(valores[i]);
		
	}
//	utilizo valores.length para q el programa sea mucho mas escalable  
	for(int i =valores.length-1;i>=0;i--) {
		
		System.out.println(valores[i]);
		}
}
}