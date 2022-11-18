import java.util.Scanner;
public class OrdemValores {
	public static void main (String[]args) {
		int a, b, c;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite um número inteiro");
		a=in.nextInt();
		System.out.println("Digite outro número");
		b=in.nextInt();
		System.out.println("Digite mais um número");
		c=in.nextInt();
		if (a<b && b<c && a<c) {
			System.out.println("Está é a ordem crescente dos valores: " + a + ", " +  b + ", " + c );
		}else if (b<a && b<c && a<b) {
			System.out.println("Está é a ordem crescente dos valores: " + b + ", " +  a + ", " + c );
		}else if (c<a && c<b && a<b) {
			System.out.println("Está é a ordem crescente dos valores: " + c + ", " +  a + ", " + b );
		}else if (c<a && c<b && b<a) {
			System.out.println("Está é a ordem crescente dos valores: " + c + ", " +  b + ", " + a );
		}else if (b<c && b<a && c<a) {
			System.out.println("Está é a ordem crescente dos valores: " + b + ", " +  c + ", " + a );
		}else if (a<b && a<c && c<b) {
			System.out.println("Está é a ordem crescente dos valores: " + a + ", " +  c + ", " + b );
		in.close();
	
		
		}
	}
	

}
