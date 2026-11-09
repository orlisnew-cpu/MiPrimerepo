package ud4;

import java.util.Scanner;

public class iii_6 {
	public static void main(String[] args) {
//6. Pide 10 enteros y comprueba si el primero y el último son iguales

		Scanner sc = new Scanner(System.in);
		
		
		int num[] = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Dime un numero");
			num[i]=sc.nextInt();
			if(num[0] == num[num.length-1]) {
				System.out.println("El primero  y el ultimo son iguales");
			}
		}
		
	}
}
