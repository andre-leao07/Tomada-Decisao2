import java.util.Scanner;
public class OrdemIdades {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		String nome, nomeVelho, nomeNovo;
		int idade, idadeVelha, idadeNova;
		System.out.println("Bem-vindo ao programa que l� o nome e a idade de 5 pessoas e ao final mostra que � mais velho e quem � mais novo,");
		System.out.println("Digite o 1� nome:");
		nome=in.next();
		System.out.println("Digite a 1� idade:");
		idade=in.nextInt();
		nomeVelho=nome;
		nomeNovo=nome;
		idadeVelha=idade;
		idadeNova=idade;
		System.out.println("Digite o 2� nome:");
		nome=in.next();
		System.out.println("Digite a 2� idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;
		}
		
		System.out.println("Digite o 3� nome:");
		nome=in.next();
		System.out.println("Digite a 3� idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;			
		}
		
		System.out.println("Digite o 4� nome:");
		nome=in.next();
		System.out.println("Digite a 4� idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;
		}
		
		System.out.println("Digite o 5� nome:");
		nome=in.next();
		System.out.println("Digite a 5� idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;
		}
		
		System.out.println("Dentre as pessoas, " + nomeVelho + " � a mais velha com: " + idadeVelha + " anos    e");
		System.out.println("Dentre as pessoas, " + nomeNovo + " � a mais nova com: " + idadeNova + " anos");
		in.close();
	}
}
