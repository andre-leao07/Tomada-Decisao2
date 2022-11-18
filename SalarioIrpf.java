import java.util.Scanner;
public class SalarioIrpf {
	public static void main (String[]args) {
		double s, irpf1, irpf2, irpf3, irpf4;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite seu sálário:");
		s=in.nextDouble();
		if (s<=1434.59) {
			System.out.println("Não é possível fazer desconto para esse salário:");			
		}else if (s>=1434.60 & s<2150.00) {
			irpf1=s*7.5/100-107.60;
			System.out.println("O desconto o IRPF é igual a: " + "R$" + irpf1);
		}else if (s>=2150.01 & s<=2866.70) {
			irpf2=s*15.0/100-268.84;
			System.out.println("O desconto o IRPF é igual a: " + "R$" + irpf2);
		}else if (s>=2866.71 & s<=3582.00) {
			irpf3=s*22.5/100-483.84;
			System.out.println("O desconto o IRPF é igual a: " + "R$" + irpf3);
		}else if (s>3582.00) {
			irpf4=s*27.5/100-662.94;
			System.out.println("O desconto o IRPF é igual a: " + "R$" + irpf4);
		in.close();
					
		}
	}

}
