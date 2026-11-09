package ud4;

import java.util.Scanner;

public class ii_ud4Ej2 {

	public static void main(String[] args) {
//		Crea un programa que pida diez números reales por teclado, los almacene en
//		un array, y luego muestre la suma de todos los valores.

		Scanner sc = new Scanner(System.in);

		double valores[] = new double[5];
		double suma = 0;
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Dame un valor");
			valores[i] = sc.nextDouble();
			suma+=valores[i];

		}
		System.out.println(suma);
		
		}
	}
