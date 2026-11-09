package ud4;

import java.util.Scanner;

public class iii_7 {
	public static void main(String[] args) {
//	7. Pide 10 enteros y comprueba si el array es capicúa comparando los elementos
//	de los extremos hacia el centro. Un array es capicúa cuando se lee igual
//	delante a detrás que de detrás a delante, por ejemplo:
		Scanner sc=new Scanner(System.in);
		int num[]=new int [5];
		for(int i=0;i<num.length;i++) {
			System.out.println("Dime un numero");
			num[i]=sc.nextInt();
			for(int  j=0;j<num.length/2;j++)
			if(num[0]== num[num.length-1] )  {
				
			}
		}
		
		
	
	}
}
