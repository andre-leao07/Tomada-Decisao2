import java.util.Scanner;
public class AgenciaViagens {
	public static void main (String[] args) {
		double d, dias, v1, v2, v3, t1, t2, t3;
		Scanner in=new Scanner (System.in);
		System.out.println ("Escolha seu destino: Digite 1 para Ilhabela   ou  2 para Fernando de Noronha");
		d=in.nextDouble();
		System.out.println("Digite a quantidade de dias:");
		dias=in.nextDouble();
		if (d==1) {
			if (dias>=2 && dias<=5) {
				v1=dias*240;
				System.out.println("O total a pagar devido a quantidade de dias é: R$ " + v1);
			}else if (dias>=6 && dias<=10) {
				v2=dias*220+130;
				System.out.println("O total a pagar devido a quantidade de dias é: R$ " + v2);
			}else{
				v3=dias*210+150;
				System.out.println("O total a pagar devido a quantidade de dias é: R$ " + v3);
			} 
			
		}else {
			if (dias>=2 && dias<=5){
				t1=dias*400+100;
				System.out.println("O total a pagar devido a quantidade de dias é: R$ " + t1);
				
			}
			else if (dias>=6 && dias<=10) {
				t2=dias*410+150;
				System.out.println("O total a pagar devido a quantidade de dias é: R$ " + t2);
				
			}
			else {	
				t3=dias*420+200;
				System.out.println("O total a pagar devido a quantidade de dias é: R$ " + t3);
				in.close();
				
			}
			
		}
			
		
	}

}
