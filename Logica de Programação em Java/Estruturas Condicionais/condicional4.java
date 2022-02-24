import java.util.Locale;
import java.util.Scanner;

public class condicional4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int soma = 0;

		if (a % 2 == 0) {
			soma = soma + a;
		}
		if (b % 2 == 0) {
			soma = soma + b;
		}
		if (c % 2 == 0) {
			soma = soma + c;
		}
		if (d % 2 == 0) {
			soma = soma + d;
			System.out.println("soma dos pares = " + soma);
		}

		sc.close();
	}

}
