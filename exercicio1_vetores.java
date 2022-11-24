package vetores;

import java.util.Scanner;

public class exercicio1_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		
		int a[],b[];
		a = b = new int [10];
		
		for (int i=0;i<10;i=i+1) {
			a[i] = leitura.nextInt();
			b[i] = a[i]*a[i];
			
			if(i==0) {
				System.out.print ("[" + b[i] + ", ");
			}else if (i==9) {
				System.out.println ("]");
			}else {
				System.out.println (b[i]+ "" );
			}
		}
		
		leitura.close();
				
		

	}

}
