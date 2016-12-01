import java.util.Scanner;
public class TestMatematicas {
	
	public static void main(String args[]){
		System.out.println("Introduce un numero, a ver si es par, o no, divisble por 3 y por 5");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		if(Matematicas.esPar(numero))
			System.out.println("Es par");
		else
			System.out.println("No es par");
			
		if(Matematicas.esDivisiblePorTres(numero))
			System.out.println("Es divisible por tres");
		else
			System.out.println("No es divisible por tres");
		if(Matematicas.esDivisiblePorCinco(numero))
			System.out.println("Es divisible por cinco");
		else
			System.out.println("No es divisible por cinco");
	
	}
}

