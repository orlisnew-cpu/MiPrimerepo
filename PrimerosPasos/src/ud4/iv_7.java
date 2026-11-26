package ud4;

import java.util.Scanner;

public class iv_7 {
//	7. Crea un array de 10 posiciones, pero inicialmente introduce solamente 5
//	números.
//	Pide un número y una posición. Inserta el número en esa posición,
//	desplazando los elementos posteriores una posición a la derecha.
//	Original: [10, 20, 30, 40, 50]
//	Número: 99
//	Posición: 2
//	Resultado: [10, 20, 99, 30, 40, 50]
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int mitad[]=new int [10];
		int num=0,posi=0;
		for(int i=0;i<mitad.length/2;i++) {
			System.out.println();
			mitad[i]=sc.nextInt();
		}
		System.out.println("Dime un numero");
		num=sc.nextInt();
		System.out.println("Dime una posi");
		posi=sc.nextInt();
		for(int i=mitad.length-1;i>posi;i--) {
			mitad[i]=mitad[i-1];
		}
		mitad[posi]=num;
		for(int i=0;i<mitad.length;i++) {
			System.out.println(mitad[i]);
		}
	}

}
