package ud3;

import java.util.Scanner;

public class numerosprimos {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

		int num = 0, divisores = 0;
		System.out.println("Dime un numero");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {

				divisores++;
			}

		}
		if (divisores <= 2) {
			System.out.println("El numero" + num + " es primo");
		} else {
			System.out.println("El numero" + num + "  no es primo");

		}
}
}
