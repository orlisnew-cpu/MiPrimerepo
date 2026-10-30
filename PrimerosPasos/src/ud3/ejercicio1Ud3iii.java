package ud3;

import java.util.Scanner;

public class ejercicio1Ud3iii {
//	Crea un programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘género’.
//	Si la nota es mayor o igual a 5 y la edad es mayor o igual a 18 mostrará
//	"ACEPTADA" si el género es "F" o "ACEPTADO" si el género es "M", si no se
//	cumplen estas condiciones, se mostrará "NO ACEPTADO/A"
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int edad=0;
		double nota=0;
		char genero;
		System.out.print("dime tu nota: ");
		nota=sc.nextDouble();
		System.out.print("Dime tu edad :");
		edad=sc.nextInt();
		System.out.print("Introduce tu género (M/F): ");
		genero = sc.next().charAt(0);
		if (nota>5 && edad>18) {
			switch	(genero) {
			case 'M'  :
				System.out.println("Aceptado");
				break;
			case 'F':
				System.out.println("Aceptada");
				break;
				
			}
			
			
		}else {
			System.out.println("No aceptado/a");
		}
		
		
	}
}
