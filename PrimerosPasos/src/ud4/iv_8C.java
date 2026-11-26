package ud4;

import java.util.Scanner;

public class iv_8C {
//	8. Crea un array de 6 enteros. Pide una posición y elimina el elemento que
//	contiene, desplazando los elementos posteriores una posición a la izquierda.
//	Original: [10, 20, 30, 40, 50, 60]
//	Posición: 2
//	Resultado: [10, 20, 40, 50, 60]
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int elimina[]= {1,2,3,4,5,6};
		int posi=0;
		System.out.println("posi?");
		posi=sc.nextInt();
		
		for(int i=posi;i<elimina.length-1;i++) {
			elimina[i]=elimina[i+1];
		}
		elimina[elimina.length-1]=0;
		for(int i =0;i<elimina.length;i++) {
			System.out.println(elimina[i]);
		}
		
	}
}
