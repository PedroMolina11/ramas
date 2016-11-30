import java.util.Scanner;
public class TestMatematicas {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if(Matematicas.esPar(numero))
			System.out.println("Es par");
		else
			System.out.println("No es par");
	
	}
}

