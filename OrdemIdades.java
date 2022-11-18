import java.util.Scanner;
public class OrdemIdades {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		String nome, nomeVelho, nomeNovo;
		int idade, idadeVelha, idadeNova;
		System.out.println("Bem-vindo ao programa que lê o nome e a idade de 5 pessoas e ao final mostra que é mais velho e quem é mais novo,");
		System.out.println("Digite o 1º nome:");
		nome=in.next();
		System.out.println("Digite a 1º idade:");
		idade=in.nextInt();
		nomeVelho=nome;
		nomeNovo=nome;
		idadeVelha=idade;
		idadeNova=idade;
		System.out.println("Digite o 2º nome:");
		nome=in.next();
		System.out.println("Digite a 2º idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;
		}
		
		System.out.println("Digite o 3º nome:");
		nome=in.next();
		System.out.println("Digite a 3º idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;			
		}
		
		System.out.println("Digite o 4º nome:");
		nome=in.next();
		System.out.println("Digite a 4º idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;
		}
		
		System.out.println("Digite o 5º nome:");
		nome=in.next();
		System.out.println("Digite a 5º idade:");
		idade=in.nextInt();
		if (idade>idadeVelha) {
			nomeVelho=nome;
			idadeVelha=idade;
		} else if (idade<idadeNova) {
			nomeNovo=nome;
			idadeNova=idade;
		}
		
		System.out.println("Dentre as pessoas, " + nomeVelho + " é a mais velha com: " + idadeVelha + " anos    e");
		System.out.println("Dentre as pessoas, " + nomeNovo + " é a mais nova com: " + idadeNova + " anos");
		in.close();
	}
}
