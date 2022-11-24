package vetores;

import java.util.Scanner;

public class exercicio4_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int i,menor = 99999, maior = 0,vet [];
		final int TAM = 10;
		
		vet = new int [TAM];
		
		
		for (i=0;i<TAM;i=i+1) {
			System.out.println (" digite o valor da posição " +(i+1)+ ":");
			vet[i] = leitura.nextInt();		
		}
		
		for (i=0;i<TAM;i=i+1) {
			System.out.println (vet[i]);
			if(menor>vet[i]) {
				menor = vet[i];
			}if(maior<vet[i]) {
				maior = vet[i];
			}
		}
		
		System.out.println ();
		System.out.println (" O MENOR VALOR SERÁ: " +menor);
		System.out.println ();
		System.out.println (" O MAIOR VALOR SERÁ: " +maior);
		
		leitura.close();

	}

}
