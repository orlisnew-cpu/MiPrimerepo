package ud3Casa;

import java.util.Scanner;

public class ud3_ej2 {
	
//	2. Crea un algoritmo que calcule el sueldo medio de un grupo de 6 trabajadores
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double sueldoT=0,sueldoI=0;
		for(int i =0;i<3;i++) {
			
			System.out.println("Dime tu sueldo");
			sueldoI=sc.nextDouble();
			sueldoT=sueldoT+sueldoI;
		}
		sueldoT=sueldoT/3;
		System.out.println(sueldoT);
		
		
			
		
	}
}
