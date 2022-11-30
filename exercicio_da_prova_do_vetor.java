package vetores;

import java.util.Scanner;

public class exercicio_da_prova_do_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		double vet[],menor=9999,maior=0,preçoTotal=0,media;
		int i;
		final int TAM = 5;
		vet = new double [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println (" digite o valor do " +(i+1)+ " produto: ");
			vet [i] = leitura.nextDouble();
			preçoTotal = vet [i] + preçoTotal;
		}
		for (i=0;i<TAM;i++) {
			
			if (menor>vet[i]) {
				menor = vet[i];
			}if (maior<vet[i]) {
				maior = vet[i];
			}
		}
		
		
		
		media = preçoTotal/5;
		System.out.println (" preço total: " +preçoTotal);
		System.out.println ();
		System.out.println (" média: " +media);
		System.out.println ();
		System.out.println (" o preço do maior produto: " +maior);
		System.out.println ();
		
		if (preçoTotal>=150) {
			System.out.println (" PODERÁ COMPRAR TODOS OS PRODUTOS :) ");
		}else {
			System.out.println (" NÃO PODERÁ COMPRAR TODOS OS PRODUTOS :( ");
		}
		
		leitura.close();


	}

}
