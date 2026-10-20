package ud3;

import java.util.Scanner;

public class ej12ud3 {
	public static void main(String[] args) {
//		12. Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
//		ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una
//		y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor,
//		menor o igual al número que ha pensado).
		Scanner sc = new Scanner(System.in);

		int num = 0, nump = 0, max = 20, min = 0;
		String valor = "";
		System.out.println("Dime el numero en el que estas pensando");
		nump = sc.nextInt();
		valor = sc.nextLine();
		do {
			num = (int) (Math.random() * (max - min + 1) + min);
			System.out.println("Tu numero es " + num + "?");
			if (num == nump) {
				System.out.println("si, mi  numero es " + num);
			} else if (num != nump) {
				System.out.println("No mi numero no es " + num);
				System.out.println("Es mayor o menor?");
				valor = sc.nextLine();
				if (valor.equals("mayor")) {
					min = num + 1;

				} else if (valor.equals("menor")) {

					max = num - 1;

				}

			}

		} while (num != nump);

	}

}
