import java.util.Locale;
import java.util.Scanner;

public class condicional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x < y) {
			System.out.println(y);
		}
		
		else if (y < x) {
			System.out.println(x);
		}
		else {
			System.out.println("Numeros iguais");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
