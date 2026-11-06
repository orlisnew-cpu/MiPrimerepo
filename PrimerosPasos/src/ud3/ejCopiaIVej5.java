package ud3;

import java.util.Scanner;

public class ejCopiaIVej5 {
//	5. Realiza un programa que permita al usuario pasar N números enteros positivos
//	(donde N también es pasado por el usuario).
//	Para cada número pasado, el programa deberá determinar:
//	 Si es primo.
//	 Si es perfecto (la suma de sus divisores propios es igual al número).
//	 Si pertenece a la secuencia de Fibonacci.
//	2
//	Al finalizar el análisis, el programa debe mostrar:
//	 Cuántos números son primos.
//	 Cuántos son perfectos.
//	 Cuántos pertenecen a la serie de Fibonacci.
//	Finalmente, debe permitir al usuario elegir (mediante un menú) si desea:
//	a. Volver a analizar una nueva lista de números.
//	b. Salir del programa.
	/*
	 * Realiza un programa que permita al usuario pasar N números enteros positivos
	 * (donde N también es pasado por el usuario). Para cada número pasado, el
	 * programa deberá determinar: - Si es primo - Cuántos números son primos
	 */

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n, x, contDivisores=0, contPrimos=0 ;
			System.out.println("Dime cuántos números quieres pasar:");
			n=sc.nextInt();
			while(n<=0) {
				System.out.println("Dime cuántos números quieres pasar:");
				n=sc.nextInt();
			}
			//ahora pido y analizo n números que me van a pasar por teclado
			for(int i=0;i<n;i++) {
				contDivisores=0;
				System.out.println("Dame un número");
				x=sc.nextInt();
				//compruebo si ese número es primo
				for(int j=1;j<=x;j++) {
					if(x%j==0) {
						contDivisores++;
					}
				}
				//en este punto ya sé cuántos divisores tiene x, por tanto
				//ya puedo saber si es primo
				if(contDivisores==2) {
					System.out.println("El número "+x+" es primo.");
					contPrimos++;
				}else {
					System.out.println("El número "+x+" no es primo.");
				}
//				contDivisores=0;
			}
			System.out.println("Se han pasado "+contPrimos+" números primos.");
		}
}