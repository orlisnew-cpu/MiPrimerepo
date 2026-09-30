package casa;

import java.util.Scanner;

public class ej10 {

	/*
	 * Realiza un programa que calcule la potencia de un número, dado este y su
	 * exponente. Pueden ocurrir tres casos:  El exponente sea positivo: imprime
	 * resultado en pantalla.  El exponente sea 0, el resultado es 1.  El
	 * exponente sea negativo, el resultado es 1/potencia con el exponente
	 * 
	 * positivo
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1.definimos variables numero y exponente

		int num, expo, pote;

		// 2.pedimos valores al usuario

		System.out.println("Dime el numero");
		num = sc.nextInt();
		System.out.println("Dime la potencia a la que lo quieres elevar");
		expo = sc.nextInt();
		// calcular potencia,PREGUNTAR PROFE

		// si el exponente>0
		if (expo > 0) {
			System.out.println("el numero elevado es");
			// si el exponente es = 0
		} else if (expo == 0) {
			System.out.println("cualquier numero elevado a 0 da como resultado 1 ");
			// si el exponente es < 0
				} else  (expo < 0); 
			expo = -expo;
		System.out.println("tu numero potenciado es 1/" + num + "^" + expo);
		
	}
}
