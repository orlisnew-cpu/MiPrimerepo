package ud4;

import java.util.Scanner;

public class i_ud4Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores[] = new int[5];
		for( int i=0;i<valores.length;i++) {
			System.out.println("Dame un valor ");
			valores[i]=sc.nextInt()	;
			
			
		}
		for(int i =0;i<valores.length;i++) {
			System.out.println("En la posicion "+i+" se almacena el valor "+valores[i]);
		}
	}
}
