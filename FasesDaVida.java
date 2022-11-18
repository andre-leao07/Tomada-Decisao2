import java.util.Scanner;
public class FasesDaVida {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int anoA, anoN, idade;
		System.out.println("Digite seu ano de Nascimento:");
		anoN=in.nextInt();
		System.out.println("Digite o ano Atual:");
		anoA=in.nextInt();
		idade=anoA-anoN;
		System.out.println(idade + " anos");
		if (idade<=10) {
			System.out.println("Você ainda é CRIANÇA");
		}else if (idade>=10 & idade<18){
			System.out.println("Você é um ADOLESCENTE");
		}else if (idade>=18  &  idade<60) {
			System.out.println("Você é um ADULTO");
		}else if (idade>=60) {
			System.out.println("Você é um IDOSO");
		in.close();
		
	
			
		}
		
		
		
		
	}
	
	

}
