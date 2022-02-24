import java.util.Locale;
import java.util.Scanner;

public class condicional5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a = sc.nextInt();
		
		if (a >= 0 ) {
			System.out.printf("raiz quadrada: %.4f%n", Math.sqrt(a) );
		}
		else {
			System.out.println("numero inválido");
		}
		
		
		
	
		sc.close();
	}

}
