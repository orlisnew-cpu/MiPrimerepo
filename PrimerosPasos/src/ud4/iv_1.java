package ud4;

import java.util.Scanner;

public class iv_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX = 20;
		int a = 0, b = 0, c = 0, n = 0, suma = 0, num = 0, cont = 0;
		System.out.println("Dime la primera semilla");
		a = sc.nextInt();
		while (a <= 0) {
			System.out.println("Dime la primera semilla");
			a = sc.nextInt();
		}
		System.out.println("Dime la segunda semilla");
		b = sc.nextInt();
		while (b <= 0) {
			System.out.println("Dime la segunda semilla");
			b = sc.nextInt();
		}
		System.out.println("Dime la tercera semilla");
		c = sc.nextInt();
		while (c <= 0) {
			System.out.println("Dime la tercera semilla");
			c = sc.nextInt();
		}
		System.out.println("Dime el numero de terminos(tiene que estar entre 4 y 20)");
		n = sc.nextInt();
		while (n < 4 || n > MAX) {
			System.out.println("Dime el numero de terminos(tiene que estar entre 4 y 20)");
			n = sc.nextInt();
		}
		int valores[] = new int[n];
		valores[0] = a;
		valores[1] = b;
		valores[2] = c;

//		for (int i = 0; i < valores.length; i++) {
//
//		}
		for (int i = 3; i < valores.length; i++) {
			suma = valores[i - 3] + valores[i - 2] + valores[i - 1];
			valores[i] = suma;

		}

//		for (int i = 4; i < valores.length; i++) {
//
//			valores[i] = suma;
//
//		}
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		System.out.println("Dime un numero y te dire si aparece en el array");
		num = sc.nextInt();
		for (int i = 0; i < valores.length; i++) {
			if (num == valores[i]) {
				System.out.println("El numero " + num + " se encuentra en la posicion " + i);
				cont = 500;
			}

		}
		if (cont != 500) {
			System.out.println("El numero " + num + " no se encuentra en la secuencia");
		}
	}
}
