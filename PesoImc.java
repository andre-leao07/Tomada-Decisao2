import java.util.Scanner;
public class PesoImc {
	public static void main (String[]args) {
		double p, h, imc;
		Scanner in=new Scanner (System.in);
		
		System.out.println("Digite seu peso:");
		p=in.nextDouble();
		System.out.println("Digite sua altura:");
		h=in.nextDouble();
		imc=p/(h*h);
		System.out.println("Seu imc � igual a: " + imc);
		if (imc<18.5) {
			System.out.println("Voc� tem Excesso de Magreza:");
		}else if ( imc<25) {
			System.out.println("Voc� tem um Peso Normal:");
		}else if ( imc<30) {
			System.out.println("Voc� tem Excesso de Peso:");
		}else if (imc<35) {
			System.out.println("Voc� tem Obesidade (Grau 1)");
		}else if (imc<40) {
			System.out.println("Voc� tem Obesidade (Grau 2)");
		}else {
			System.out.println("Voc� tem Obesidade (Grau 3)");
		in.close();
		}
	}
}
