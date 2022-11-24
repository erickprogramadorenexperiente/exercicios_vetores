package vetores;

import java.util.Scanner;

public class exercicio3_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int i, a[],numeroPar = 0;
		final int TAM = 10;
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println (" digite o " +(i+1)+ " número: ");
			a[i] = leitura.nextInt();
		}
		if (i==TAM) {
			for (i=0;i<TAM;i=i+1) {
				if (a[i]%2==0) {
					
				
				System.out.print(a[i]+ " eh par ");
				numeroPar = i+1;
			}
		}
		System.out.println(" ");
		System.out.println (" possui " +numeroPar+ " numeros pares ");
		
	  }
		
		leitura.close();
	}

}











