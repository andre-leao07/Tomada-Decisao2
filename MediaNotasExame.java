import java.util.Scanner;
public class MediaNotasExame {
	public static void main (String[]args) {
		double n1, n2, m, nExame, mExame;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite sua primeira nota:");
		n1=in.nextDouble();
		System.out.println("Digite sua segunda nota:");
		n2=in.nextDouble();
		m=n1+n2/2;
		if (m<3) {
			System.out.println("Reprovado");
		}else if (m>=6) {
			System.out.println("Aprovado");
		}else if (m>=3 & m<6) {
			System.out.println("Você está em exame digite uma nota do seu Exame:");
		}
		nExame=in.nextDouble();
		mExame=m+nExame/2;
		if (mExame>=6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		in.close();
		}
		
		
	}

}
