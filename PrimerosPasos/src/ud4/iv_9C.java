package ud4;

public class iv_9C {
//	9. Invierte el orden de todos los elementos del array sin crear otro array auxiliar.
//	Original: [1, 2, 3, 4, 5]
//	Resultado: [5, 4, 3, 2, 1]
	public static void main(String[] args) {
		int invierte[] = { 1, 2, 3, 4, 5 };
		int suma=0;
		
		for(int i=0;i<invierte.length/2;i++) {
			suma=invierte[i];
			invierte[i]=invierte[invierte.length-1-i];
			invierte[invierte.length-1-i]=suma;
			
		}
		for(int i=0;i<invierte.length;i++) {
			System.out.println(invierte[i]);
		}
	}
}
