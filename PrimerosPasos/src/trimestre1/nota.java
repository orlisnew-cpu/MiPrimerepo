package trimestre1;

import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double teorico=0, practicas=0, media=0;
		System.out.println("Dime tu nota de el examen teórico");
		teorico=sc.nextDouble();
		if(teorico<5) {
			media=teorico;
			System.out.println("Estas suspenso con "+ media);
		}else
			System.out.println("Dime tu nota de las practicas");
		practicas=sc.nextDouble();
		media=teorico*0.6+practicas*0.4;
		if(media>=5) {
			System.out.println("estas aprobado con un "+ media);
		}else
			System.out.println("estas suspenso con un "+ media);
	}

}
