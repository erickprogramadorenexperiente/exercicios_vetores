package vetores;

import java.util.Scanner;

public class exercicio2_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		final int TAM = 5;
		int i,in,a[],b[];
		
		a = new int [TAM];
		b = new int [TAM];
		in = 4;
		
		for(i=0;i<TAM;i=i+1) {
			System.out.println (" digite o " +i+ " elemento do vetor: ");
			a[i] = leitura.nextInt();
			b[in] = a[i];
			in--;
		}
		System.out.println ("\nVetor A [ ");
		
		for(i=0;i<TAM;i=i+1) {
			System.out.print (a[i] + " ");
		}
		System.out.print(" ] ");
		System.out.print("\nVetor B [ ");
		
		for(i=0;i<TAM;i=i+1) {
			System.out.print(b[i] + " ");
		}
		System.out.print (" ] ");
		
		leitura.close();
		
		
		

	}

}
