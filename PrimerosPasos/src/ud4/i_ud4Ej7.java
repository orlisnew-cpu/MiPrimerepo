package ud4;

public class i_ud4Ej7 {
public static void main(String[] args) {
//	 Recorre un array de 6 enteros y muestra tanto el índice como el valor guardado
//	 en cada posición.
	int valores[]=new int[6];
	
	for(int i =0;i<valores.length;i++) {
		valores[i]=i+2;
		System.out.println("POSICION: "+i+" VALOR: "+valores[i]);
	}
	

}
}
