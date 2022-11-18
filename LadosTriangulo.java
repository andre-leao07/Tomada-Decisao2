import java.util.Scanner;
public class LadosTriangulo {
	public static void main (String[]args) {
		double a, b, c, h1, h2, h3;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite o valor de um dos lados de um triângulo");
		a=in.nextDouble();
		System.out.println("Digite o valor de outro lado");
		b=in.nextDouble();
		System.out.println("Digite o valor último valor último lado");
		c=in.nextDouble();
		h1=a+b;
		h2=a+c; 
		h3=b+c;
		if (a==b && a==c && b==c) {
			System.out.println("Três lados iguais: Triângulo Equilátero");
		}else if (c>h1 ||  b>h2 || a>h3) {
			System.out.println("Desculpe, mas segungo as leis essas medidas não formam um Triângulo");
		}else if (a!=b && a!=c && b!=c) {
			System.out.println("Três lados diferentes: Triângulo Escaleno");
		}else {
			System.out.println("Dois lados iguais e um lado diferente: Triângulo Isóceles");
		in.close();
		}
		
	}

}
