package ud4;

import java.util.Scanner;

public class iv_4C {
//	Pide al usuario un array de 8 enteros. Después, solicita dos posiciones e
//	intercambia los valores que contienen.
//	Original: [1, 2, 3, 4, 5, 6, 7, 8]
//	Posiciones: 1 y 5
//	Resultado: [1, 6, 3, 4, 5, 2, 7, 8]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int aux1 = 0, aux2 = 0, p = 0, u = 0;
		int posi[] = new int[8];
		for (int i = 0; i < posi.length; i++) {

			System.out.println("Valor :");
			posi[i] = sc.nextInt();
		}
		System.out.println("Primera posicion : ");
		aux1 = sc.nextInt();
		System.out.println("Segunda posicion : ");
		aux2 = sc.nextInt();

		p = posi[aux1];
		u = posi[aux2];
		posi[aux1] = u;
		posi[aux2] = p;

		for (int i = 0; i < posi.length; i++) {
			
			System.out.println(posi[i]);
		}
	}
}
