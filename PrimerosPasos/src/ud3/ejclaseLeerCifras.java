package ud3;

import java.util.Scanner;

public class ejclaseLeerCifras {
	public static void main(String[] args) {
//	dado un numero  que pasara el usuario por teclado, nos diga cuantas cifras tiene, termina al presionar la tecla 0 
		int num = 0, cont = 0, divisor = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero ");
		num = sc.nextInt();

		
		
		while (num != 0) {

			num = num / divisor;
			cont++;

		}
		System.out.println("Tiene " + cont + " cifras");
		//ej4 ,17 y 18,

	}

}
