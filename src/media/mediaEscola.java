package media;

import java.util.Scanner;
public class mediaEscola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MEDIA DO ALUNO//

		Scanner ler = new Scanner(System.in);
		
		double  n1, n2, n3, nt, nf;
		// n1 = NOTA 1
		// n2 = NOTA 2
		// n3 = NOTA 3
		// nt = NOTA TRABALHO
		// nf = NOTA FINAL 
		// MEDIA 7 PARA SER APROVADO 
		
		
		//RECEBENDO OS VALORES
		nf = 0;
		System.out.println("Digite o valor da primeira nota: " );
        n1 = ler.nextDouble();
        
		System.out.println("Digite o valor da segunda nota: " );
		
		n2 = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota: " );
		
		n3 = ler.nextDouble();
		System.out.println("Digite o valor da nota do trabalho: " );
		
		nt = ler.nextDouble();
		
		
		nf = (n1+n2+n3+nt)/4;
		System.out.println("a nota final foi: " +nf);
		
		//SE A NOTA FINAL FOR ACIMA DE 7 O ALUNO É APROVADO 
		if(nf >= 7) {
			System.out.println("APROVADO");
		//SE O A NOTA FINAL FOR MENOR QUE 7 O ALUNO É REPROVADO
		}else if (nf < 7) {
			System.out.println("REPROVADO");
			
		}else if (nf == 0.0){
			System.out.println("Nenhuma nota declarada");
			
	    }
		
	}//fim main

}//fim class
