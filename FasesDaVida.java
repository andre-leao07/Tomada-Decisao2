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
			System.out.println("Voc� ainda � CRIAN�A");
		}else if (idade>=10 & idade<18){
			System.out.println("Voc� � um ADOLESCENTE");
		}else if (idade>=18  &  idade<60) {
			System.out.println("Voc� � um ADULTO");
		}else if (idade>=60) {
			System.out.println("Voc� � um IDOSO");
		in.close();
		
	
			
		}
		
		
		
		
	}
	
	

}
