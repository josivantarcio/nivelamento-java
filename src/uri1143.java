import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1143 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			double q = 0;
			System.out.print(i + " ");
			q = Math.pow(i, 2);
			System.out.printf("%.0f", q);
			q = Math.pow(i, 3);
			System.out.printf(" %.0f%n", q);
		}
		
		sc.close();
	}
}
