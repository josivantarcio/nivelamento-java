import java.util.Scanner;

public class uri1067 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (x >= 1 && x <= 1000) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
		}
		
		sc.close();
	}
}
