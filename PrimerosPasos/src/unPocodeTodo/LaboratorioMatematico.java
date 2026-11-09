package unPocodeTodo;

import java.util.Scanner;

public class LaboratorioMatematico {
	public static void main(String[] args) {
//		Desarrolla un programa con un menú principal que se repite hasta que el usuario elija
//		salir. Cada opción resuelve uno de los ejercicios siguientes.
//		=== LABORATORIO MATEMÁTICO ===
//		1. Rombo de asteriscos
//		2. Primos gemelos
//		3. Secuencia de Collatz
//		4. Números amigos
//		5. Decimal a binario
//		6. Adivino tu número
//		0. Salir

		// creo el bucle con while para que el menu se repita infinitamente hasta q se
		// pulse 0

		Scanner sc = new Scanner(System.in);
		int menu = 1, rombo = 1;

		while (menu != 0) {
			System.out.println("=== LABORATORIO MATEMÁTICO ===");
			System.out.println("1. Rombo de asteriscos");
			System.out.println("2. Primos gemelos");
			System.out.println("3. Secuencia de Collatz");
			System.out.println("4. Números amigos");
			System.out.println("5. Decimal a binario");
			System.out.println("6. Adivino tu número");
			System.out.println("0. Salir");
			System.out.print("Elija una opción: ");
			menu = sc.nextInt();
			// Para hacer el menu hago un Switch con las opciones disponibles
			switch (menu) {
			case 1:
//				1. Rombo de asteriscos
//				El usuario pasará por teclado un número impar entre 1 y 15 y se deberá dibujar un
//				rombo con esa altura.
//				Ejemplo, para n = 5
				System.out.println("Dime un numero impar entre 1 y 15 para elegir la altura de su rombo");
				rombo = sc.nextInt();

				if (rombo > 15) {
					System.out.println("El numero tiene q estar entre 1 y 15, volviendo al menu...  ");

				} else if (rombo % 2 == 0) {

					System.out.println("El numero tiene que  ser impar, volviendo al menu  ");
				} else if (rombo > 0 && rombo <= 15) {
					for (int i = 1; i <= rombo; i += 2) {
						for(int k=0;k<rombo/2;k++) {
							System.out.print(" ");
						}
						for (int j = 1; j <= i; j++) {
							
							System.out.print("*");
							
						}
						System.out.println();
					}
					for(int i = rombo - 2; i >= 1; i -= 2) {
						for (int j = 1; j <= i; j++) {
							System.out.print("*");
							
						}
						System.out.println();
					}

				}

				break;
			case 2:
				System.out.println("2. Primos gemelos");
				break;
			case 3:
				System.out.println("3. Secuencia de Collatz");
				break;
			case 4:
				System.out.println("4. Números amigos");
				break;
			case 5:
				System.out.println("5. Decimal a binario");
				break;
			case 6:
				System.out.println("6. Adivino tu número");
				break;
			case 0:
				System.out.println("Bye...");
				break;
			}

		}

	}

}
