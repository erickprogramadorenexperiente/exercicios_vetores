package vetores;

import java.util.Scanner;

public class exercicio_da_prova_do_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		double vet[],menor=9999,maior=0,pre�oTotal=0,media;
		int i;
		final int TAM = 5;
		vet = new double [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println (" digite o valor do " +(i+1)+ " produto: ");
			vet [i] = leitura.nextDouble();
			pre�oTotal = vet [i] + pre�oTotal;
		}
		for (i=0;i<TAM;i++) {
			
			if (menor>vet[i]) {
				menor = vet[i];
			}if (maior<vet[i]) {
				maior = vet[i];
			}
		}
		
		
		
		media = pre�oTotal/5;
		System.out.println (" pre�o total: " +pre�oTotal);
		System.out.println ();
		System.out.println (" m�dia: " +media);
		System.out.println ();
		System.out.println (" o pre�o do maior produto: " +maior);
		System.out.println ();
		
		if (pre�oTotal>=150) {
			System.out.println (" PODER� COMPRAR TODOS OS PRODUTOS :) ");
		}else {
			System.out.println (" N�O PODER� COMPRAR TODOS OS PRODUTOS :( ");
		}
		
		leitura.close();


	}

}
