package ud3;

import java.util.Scanner;

public class ej1claseC {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int num = 0, divisores = 0;
	System.out.println("Dime un numero");
	num = sc.nextInt();
	for (int i = 1; i <= num; i++) {
		if (num % i == 0) {

			System.out.println(i + " Es divisor de " + num);
			divisores++;
		}

	}
	System.out.println("hay " + divisores + " Divisores");
}
}
