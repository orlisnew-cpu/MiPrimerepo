package unPocodeTodo;

import java.util.Scanner;

public class LaboratorioMatematico {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int menu = 1;

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
		
			switch (menu) {

			case 1:
				int a = 1;


				System.out.println("Dime un numero impar entre 1 y 15 para elegir la altura de su rombo");
				a = sc.nextInt();

				if (a < 1 || a > 15) {
					System.out.println("El numero tiene que estar entre 1 y 15, volviendo al menu...");
				} else if (a % 2 == 0) {
					System.out.println("El numero tiene que ser impar, volviendo al menu...");
				} else {

					for (int i = 1; i <= a; i = i + 2) {
						for (int j = a; j > i; j = j - 2) {
							System.out.print(" ");
						}

						for (int k = 1; k <= i; k++) {
							System.out.print("*");
						}

						System.out.println();
					}

					for (int i = a - 2; i >= 1; i = i - 2) {
						for (int j = a; j > i; j = j - 2) {
							System.out.print(" ");
						}

						for (int k = 1; k <= i; k++) {
							System.out.print("*");
						}

						System.out.println();
					}
				}

				break;
			case 2:
				int n = 0, contdiv = 0, contdiv2 = 0, n2 = 0;

				System.out.println("2. Primos gemelos");
//				
				System.out.println("Dime un numero mayor o iguual que 2");
				n = sc.nextInt();
				while (n < 2) {
					System.out.println("Dime un numero mayor o igual que 2");
					n = sc.nextInt();
				}
				int geme = 0;

				for (int i = 2; i <= n; i++) {

					contdiv = 0;
					contdiv2 = 0;
					n2 = i + 2;

					for (int j = 1; j <= i; j++) {

						if (i % j == 0) {

							contdiv++;

						}

					}

					for (int k = 1; k <= n2; k++) {

						if (n2 % k == 0) {
							contdiv2++;

						}

					}
					if (contdiv2 == 2 && contdiv == 2 && n2 <= n) {
						System.out.println("(" + i + "," + n2 + ")");
						geme++;
					}

				}
				System.out.println("hay " + geme + " parejas de gemelos");

				break;

			case 3:
				int num = 0, cont = 0, m = 0;

				m = 0;
				cont = 0;
				System.out.println("3. Secuencia de Collatz");

				System.out.println("Dime un numero cualquiera");
				num = sc.nextInt();
				while (num != 1) {
					if (m < num) {
						m = num;
					} else {
						m = m;
					}
					if (num % 2 == 0) {
						num = num / 2;
						System.out.print("->" + num);
						cont++;
					} else {

						num = 3 * num + 1;
						System.out.print("->" + num);
						cont++;
					}

				}

				System.out.println();
				System.out.println(" el valor maximo alcanzado   es " + m);
				System.out.println();
				System.out.println(" pasos :" + cont);
				System.out.println();

				break;

			case 4:
				int num2, amigo, suma1, suma2;

				System.out.println("Dime el limite de busqueda ");
				num = sc.nextInt();

				for (int i = 1; i < num; i++) {
					suma1 = 0;

					for (int j = 1; j < i; j++) {
						if (i % j == 0) {
							suma1 = suma1 + j;
						}

					}

					amigo = suma1;
					suma2 = 0;

					for (int j = 1; j < amigo; j++) {
						if (amigo % j == 0) {
							suma2 = suma2 + j;
						}

					}

					if (suma2 == i && i < amigo) {
						System.out.println(i + " y " + amigo + " son amigos");
					}

				}
				break;

			case 5:

				System.out.println("5. Decimal a binario");
				int bin = 0, pote = 1;
				System.out.println("Dime un numero");
				bin = sc.nextInt();

				do {
					pote = pote * 2;
				} while (bin >= pote);
				pote = pote / 2;
				while (pote > 0) {
					if (bin >= pote) {
						System.out.print("1");
						bin = bin - pote;
					} else {
						System.out.print("0");
					}
					pote = pote / 2;
				}
				System.out.println();
				break;
			case 6:
				System.out.println("6. Adivino tu número");

				int nump = 0, max = 1000, min = 1, vuelta = 0;
				String valor = "";

				while (vuelta < 10) {
					nump = (int) (min + Math.random() * (max - min + 1));
					System.out.println("Tu numero es?: " + nump);
					valor = sc.next();
					vuelta++;

					if (valor.equals("si")) {
						System.out.println("Acertaste " + nump + " es mi numero");
						System.out.println("Intentos: " + vuelta);
						vuelta = 10;
					} else if (valor.equals("mayor")) {
						min = nump + 1;
					} else if (valor.equals("menor")) {
						max = nump - 1;
					}
					if (min > max) {
						System.out.println("Has hecho trampa");
						vuelta = 10;
					}
				}

				break;
			case 0:
				System.out.println("Bye...");
				break;
			}

		}

	}

}
