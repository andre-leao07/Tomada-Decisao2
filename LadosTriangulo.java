import java.util.Scanner;
public class LadosTriangulo {
	public static void main (String[]args) {
		double a, b, c, h1, h2, h3;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite o valor de um dos lados de um tri�ngulo");
		a=in.nextDouble();
		System.out.println("Digite o valor de outro lado");
		b=in.nextDouble();
		System.out.println("Digite o valor �ltimo valor �ltimo lado");
		c=in.nextDouble();
		h1=a+b;
		h2=a+c; 
		h3=b+c;
		if (a==b && a==c && b==c) {
			System.out.println("Tr�s lados iguais: Tri�ngulo Equil�tero");
		}else if (c>h1 ||  b>h2 || a>h3) {
			System.out.println("Desculpe, mas segungo as leis essas medidas n�o formam um Tri�ngulo");
		}else if (a!=b && a!=c && b!=c) {
			System.out.println("Tr�s lados diferentes: Tri�ngulo Escaleno");
		}else {
			System.out.println("Dois lados iguais e um lado diferente: Tri�ngulo Is�celes");
		in.close();
		}
		
	}

}
