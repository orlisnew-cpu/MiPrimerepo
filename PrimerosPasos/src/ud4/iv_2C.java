package ud4;

import java.util.Scanner;

public class iv_2C {
//	Crea un array de 5 enteros y desplaza todos sus elementos una posición a la
//	izquierda. El primer elemento pasará a la última posición.
//	Original: [1, 2, 3, 4, 5]
//	Resultado: [2, 3, 4, 5, 1]
//			

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int izquierda[] = {1,2,3,4,5};
		 int primero=0;
//		 for(int i=0;i<izquierda.length;i++) {
//			 System.out.println("Valor? :");
//			 izquierda[i]=sc.nextInt();
//		 }
		 primero=izquierda[0];
		 
		 for(int i=0;i<izquierda.length-1;i++) {
			 izquierda[i]=izquierda[i+1];
		 }
		 izquierda[izquierda.length-1]=primero;
		for(int i =0;i<izquierda.length;i++) {
			System.out.println(izquierda[i]);
		}
	}
}
