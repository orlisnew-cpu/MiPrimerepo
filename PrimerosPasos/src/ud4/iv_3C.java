package ud4;

import java.util.Scanner;

public class iv_3C {
//	3. Crea un array de 6 enteros e intercambia el primer elemento con el último.
//	Original: [10, 20, 30, 40, 50, 60]
//	Resultado: [60, 20, 30, 40, 50, 10]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int primero = 0, ultimo = 0;
		
		int inter[] = new int[6];
		
		for(int i=0;i<inter.length;i++) {
			System.out.println("Valores? :");
			inter[i]=sc.nextInt();
		
		}
		primero=inter[0];
		ultimo=inter[5];
		
				
		for(int i=0;i<inter.length;i++) {
			inter[0]=ultimo;
			inter[5]=primero;
			System.out.print(inter[i]);
		}

	}
}
