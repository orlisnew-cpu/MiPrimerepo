package ud4;

import java.util.Scanner;

public class iv_1C {
	public static void main(String[] args) {
//	1. Crea un array de 5 enteros e introduce valores por teclado. Desplaza todos los
//	elementos una posición a la derecha. El último elemento pasará a la primera
//	posición.
//	Original: [1, 2, 3, 4, 5]
//	Resultado: [5, 1, 2, 3, 4]
		Scanner sc = new Scanner(System.in);
		int valores[] = new int[5];
		int ultimo=0;
		for (int i = 0; i < valores.length; i++) {
			System.out.println("valor?");
			valores[i] = sc.nextInt();
		}
		ultimo=valores[valores.length-1];
		for (int i = 4; i>0; i--) {
			valores[i] = valores[i - 1];
			
		}
		valores[0]=ultimo;
		for(int i=0;i<valores.length;i++) {
			
			System.out.println(valores[i]);
		}
	}
}
