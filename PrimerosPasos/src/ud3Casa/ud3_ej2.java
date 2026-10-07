package ud3Casa;

import java.util.Scanner;

public class ud3_ej2 {
	
//	2. Crea un algoritmo que calcule el sueldo medio de un grupo de 6 trabajadores
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double sueldo=0;
		for(int i =0;i<6;i=i+1) {
			
			System.out.println("Dime tu sueldo");
			sueldo=sc.nextDouble();
			sueldo=sueldo+sueldo;
		}
		sueldo=sueldo/3;
		System.out.println("El sueldo medio es "+ sueldo);
			
		
	}
}
