package ud1Casa;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Crea un algoritmo que permita leer 3 números diferentes entre sí, y
		 * determinar cuál es el mayor de los tres.
		 */

		// definimos variables n1 n2 n3
		int n1, n2, n3;
		// pedimos valor al usuario
		System.out.println("Dime el primer numero");
		n1 = sc.nextInt();
		System.out.println("Dime el segundo numero");
		n2 = sc.nextInt();
		System.out.println("Dime el tercer  numero");
		n3 = sc.nextInt();
		if (n1 > n2 && n1 > n3) {
			System.out.println("el " + n1 + " es el mayor");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("el " + n2 + " es el mayor");

		} else
			System.out.println("el " + n3 + " es el mayor");
	}

}
