import java.util.Locale;
import java.util.Scanner;

public class condicional3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a);
		}
		if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

		sc.close();
	}

}
