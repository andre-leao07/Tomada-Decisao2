import java.util.Scanner;
public class EquacaoSegundoGrau {
	public static void main (String[]args) {
		double a, b, c, d, x, x1, x2;
		Scanner in=new Scanner (System.in);
		
		System.out.println("Digite a valor 'a' de uma Equa��o de 2� Grau:");
		a=in.nextDouble();
		System.out.println("Agora digite o valor 'b':");
		b=in.nextDouble();
		System.out.println("Por fim o valor 'c':");
		c=in.nextDouble();
		d=(b*b)-4*a*c;
		if (d<0) {
			System.out.println("N�o existem ra�zes reais para a equa��o");
		}else if (d==0) {
			x=-b /(2*a);
			System.out.println("A existe uma raiz igual a: " + x);
		}else if (d>0) {
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Existem duas r�zes: x1= "+x1+"  e  x2 igual a= "+x2);			
		in.close();
			
		}
		
		
	}

}
