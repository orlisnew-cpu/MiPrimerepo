package ud4;

public class iv_5C {
//	5. Todos los elementos avanzan dos posiciones. Los dos últimos pasan al
//	principio.
//	Original: [1, 2, 3, 4, 5, 6]
//	Resultado: [5, 6, 1, 2, 3, 4]
	public static void main(String[] args) {
		int cambio[] = { 1, 2, 3, 4, 5, 6 };
		int temp1 = cambio[cambio.length-2];
		int temp2=cambio[cambio.length-1];
//		temp1=cambio[cambio.length-2];
//		temp2=cambio[cambio.length-1];
		for (int i = cambio.length - 1; i > 1; i--) {
			cambio[i] = cambio[i - 2];

		}
		cambio[0]=temp1;
		cambio[1]=temp2;
		for (int i = 0; i < cambio.length; i++) {
			System.out.println(cambio[i]);
		}

	}
}
