import java.util.Scanner;
public class EconomiaDoCarro {
	public static void main (String[]args) {
		double km, l, gasto;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite a dist�ncia percorrida pelo carro em km:");
		km=in.nextDouble();
		System.out.println("Digite a capacidade em litros do tanque de gasolina:");
		l=in.nextDouble();
		gasto=km/l;
		System.out.println(gasto + " km/l");
		if (gasto>10){
			System.out.println("Carro Econ�mico :)");
		}else if (gasto<10) {
			System.out.println("Carro N�O Econ�mico");
		in.close();
		}
				
				
	}

}
