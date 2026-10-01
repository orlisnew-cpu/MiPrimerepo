package casa;

import java.util.Scanner;

public class ej11 {
		
	
	/* La asociación de vinicultores tiene como política fijar un precio inicial al kilo de
	 uva, la cual se clasifica en tipos (1 y 2), y además en tamaños (500 y 900).
	 Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se
	 requiere determinar cuánto recibirá un productor por la uva que entrega en un
	 embarque considerando lo siguiente:
	  Si es de tipo 1, se le cargan 20 céntimos al precio inicial cuando es de
	 tamaño 500 y 30 céntimos si es de tamaño 900.
	  Si es de tipo 2, se rebajan 30 céntimos cuando es de tamaño 500, y 50
	 céntimos cuando es de tamañoo 900*/
	
public static void main(String[] args) {
			 
	Scanner sc=new Scanner (System.in);
		
	double kilo,precio,  type1, type2, tam11,tam22, tam;
	System.out.println("A cuanto lo quieres vender?");
	precio=sc.nextDouble();
	System.out.println("Cuantos kilos?");
	kilo=sc.nextDouble();
	type1=(precio+0.2)*kilo;
	
	System.out.println("Si es del tipo 1 y de tamaño 500 recibiras  "+type1+"$");
	tam11=(precio-0.3)*kilo;
	
	System.out.println("Si es del tipo 2 y de tamaño 500 recibiras  "+tam11+"$");
	
	type2=(precio+0.3)*kilo;
	System.out.println("Si es del tipo 1 y de tamaño 900 recibiras  "+type2+"$");
	
	tam22=(precio-0.5)*kilo;
	System.out.println("Si es del tipo 2 y de tamaño 900 recibiras  "+tam22+"$");
	
	}
}
