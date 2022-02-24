import java.util.Locale;
import java.util.Scanner;

public class condicional2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}

		sc.close();
	}

}
