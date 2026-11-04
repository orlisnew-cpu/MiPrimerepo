package ud3;

import java.awt.print.Printable;
import java.util.Scanner;

public class ud3_iii_6 {
//	6. Desarrolla un programa en Java que permita realizar diferentes operaciones
//	matemáticas mediante un menú interactivo.
//	El programa deberá mostrar el menú repetidamente hasta que el usuario
//	seleccione la opción 0, momento en el que finalizará su ejecución.
//	El menú deberá contener las siguientes opciones:
//	========= CALCULADORA =========
//	1. Sumar
//	2. Restar
//	3. Multiplicar
//	4. Dividir
//	5. Calcular potencia
//	0. Salir
//	===============================
//	Elige una opción:
//	Opción 1. Sumar
//	Solicitar dos números al usuario, calcular su suma y mostrar el resultado por pan-
//	talla.
//	Opción 2. Restar
//	
//	Solicitar dos números al usuario, comprobar cuál es el mayor, para así hacer la
//	resta correctamente.
//	Opción 3. Multiplicar
//	Solicitar dos números al usuario, calcular su producto y mostrar el resultado.
//	Opción 4. Dividir
//	Solicitar dos números al usuario y dividir el primero entre el segundo. Antes de
//	realizar la operación, se deberá comprobar que el divisor no sea cero. Si lo es, se
//	mostrará un mensaje de error y no se realizará la división.
//	Opción 5. Calcular potencia
//	Solicitar al usuario una base y un exponente entero. El programa deberá calcular
//	la potencia sin utilizar el método Math.pow().
//	Para ello, deberá cumplir las siguientes condiciones:
//	 Si el exponente es positivo, multiplicar la base por sí misma tantas veces
//	como indique el exponente.
//	 Si el exponente es cero, el resultado será 1, excepto cuando la base tam-
//	bién sea cero. En ese caso, se mostrará un mensaje indicando que la ope-
//	ración no está definida.
//	 Si el exponente es negativo, calcular primero la potencia con el exponente
//	positivo y después dividir 1 entre el resultado obtenido.
//	 Si la base es cero y el exponente es negativo, mostrar un mensaje de error,
//	ya que no se puede dividir entre cero.
//	Opción 0. Salir
//	Mostrar un mensaje de despedida y finalizar el programa. El menú no deberá vol-
//	ver a mostrarse después de seleccionar esta opción.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opciones = 1, operaciones=0 ,operaciones2=0 ,potencia=0;
				

//		System.out.println("========= CALCULADORA =========");
//		System.out.println("1. Sumar");
//		System.out.println("2. Restar");
//		System.out.println("3. Multiplicar");
//		System.out.println("4. Dividir");
//		System.out.println("5. Calcular potencia");
//		System.out.println("0. Salir");
//		System.out.println("===============================");
//		System.out.print("Elige una opción:");
//		opciones = sc.nextInt();

//		do {
//			
//
//			switch (opciones) {
//
//			case 1:
//				System.out.println("Has elegido sumar");
//				
//				
//				break;
//			case 2:
//				System.out.println("Has elegido restar");
//				break;
//			case 3:
//				System.out.println("Has elegido multiplicar");
//				break;
//			case 4:
//				System.out.println("Has elegido dividir");
//				break;
//			case 5:
//				System.out.println("Has elegido calcular potencia");
//				break;
//				
//				
//			}
//			System.out.println("========= CALCULADORA =========");
//			System.out.println("1. Sumar");
//			System.out.println("2. Restar");
//			System.out.println("3. Multiplicar");
//			System.out.println("4. Dividir");
//			System.out.println("5. Calcular potencia");
//			System.out.println("0. Salir");
//			System.out.println("===============================");
//			System.out.print("Elige una opción:");
//			opciones = sc.nextInt();
//
//		} while (opciones >0 && opciones <= 5);
		
		
		
		while (opciones > 0 && opciones <= 5) {
			System.out.println("========= CALCULADORA =========");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Calcular potencia");
			System.out.println("0. Salir");
			System.out.println("===============================");
			System.out.print("Elige una opción:");
			opciones = sc.nextInt();
			switch (opciones) {

			case 1:
				System.out.println("Has elegido sumar");
				
				System.out.println("Dime el primer numero");
				operaciones=sc.nextInt();
				System.out.println("Dime el segundo  numero");
				operaciones2=sc.nextInt();
				System.out.println(  "El resultado es : " + ( operaciones+ operaciones2) );
				
				break;
					
			case 2:
				System.out.println("Has elegido restar");
				
				System.out.println("Dime el primer numero");
				operaciones=sc.nextInt();
				System.out.println("Dime el segundo  numero");
				operaciones2=sc.nextInt();
				
				if(operaciones>operaciones2) {
					System.out.println("El resultado es :" +(operaciones- operaciones2));
				}else if (operaciones2>operaciones ) {
					System.out.println("El resultado es :" +(operaciones2 - operaciones));
				}
				
				break;
			case 3:
				System.out.println("Has elegido multiplicar");
				
				System.out.println("Dime el primer numero");
				operaciones=sc.nextInt();
				System.out.println("Dime el segundo  numero");
				operaciones2=sc.nextInt();
				System.out.println(  "El resultado es : " + ( operaciones* operaciones2) );
				
				break;
			case 4:
				System.out.println("Has elegido dividir");
				
				System.out.println("Dime el primer numero");
				operaciones=sc.nextInt();
				System.out.println("Dime el segundo  numero");
				operaciones2=sc.nextInt();
				
				if(operaciones2==0) {
					System.out.println("Error, no se puede dividir entre 0");
				}else {
					System.out.println(  "El resultado es : " + ( operaciones /operaciones2) );
				}
				
				
				break;
			case 5:
				System.out.println("Has elegido calcular potencia");
				
				System.out.println("Dime el primer numero");
				operaciones=sc.nextInt();
				System.out.println("Dime el segundo  numero");
				operaciones2=sc.nextInt();
				
				if(operaciones2>0) {
					 
					
					
				}else if(operaciones2<0) {
					
				}else {
					if(operaciones==0 ) {
						System.out.println("La operacion no esta definida ");
					}else {
						System.out.println("El resultado es 1");
					}
					
				}
				
				break;
			}
		}

	}
}
