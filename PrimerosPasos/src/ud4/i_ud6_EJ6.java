package ud4;

public class i_ud6_EJ6 {
public static void main(String[] args) {
//	Crea un array de 10 enteros y rellénalo con los números del 10 al 1, en orden
//	descendente
	int valores []=new int [10];
	for(int i =0;i<valores.length;i++) {
		//valores.length= longitud del array 
		valores[i] =valores.length - i;
		System.out.println(valores[i]);
	}
		
	
	
}
}
