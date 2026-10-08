package ud3Casa;

import java.util.Scanner;

public class ud3_ej3 {

//	Crea un algoritmo que solicite la edad de 4 personas y que muestre cuántos
//	mayores y cuántos menores de edad hay

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad = 0, mayor = 0, menor = 0;
		for (int i = 0; i < 6; i++) {

			System.out.println("Dime tu edad");
			edad = sc.nextInt();
			if (edad < 18) {
				menor++;
			} else {
				mayor++;
			}

		}
		System.out.println("menores de edad hay "+ menor+ " y mayores hay "+mayor);
	}
}
