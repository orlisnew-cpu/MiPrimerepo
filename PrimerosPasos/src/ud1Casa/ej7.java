package ud1Casa;

import java.util.Scanner;

public class ej7 {
	/*Crea un algoritmo que calcule la nota final de un examen tipo test, del cual se
	solicitarán el número de respuestas correctas, incorrectas y en blanco. La
	puntuación se calculará sumando 4 puntos por cada respuesta correcta, restando
	1 punto por cada incorrecta y 0 puntos por las respuestas en blanco*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		//definimos variables
		int correctas, incorrectas, blanco, nota ;
		//pedimos valores al usuario
		System.out.println("Dime  el numero de respuestas correctas");
		correctas=sc.nextInt();
		System.out.println("Dime  el numero de respuestas incorrectas");
		incorrectas=sc.nextInt();
		System.out.println("Dime  el numero de respuestas en blanco");
		blanco=sc.nextInt();
		//hacemos las operaciones matematicas correspondientes
		
		nota= correctas*4-incorrectas;
		//damos el resultado
		System.out.println("tu nota es:" + nota  );
		
		
		
	}
}
