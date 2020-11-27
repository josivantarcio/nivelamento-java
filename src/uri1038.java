import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		float preco = 0;
		double total;
		if (codigo == 1) 
			preco = 4.0f;
		else if (codigo == 2)	
			preco = 4.5f;
		else if (codigo == 3)
			preco = 5.0f;
		else if (codigo == 4)	
			preco = 2.0f;
		else if(codigo == 5)
			preco = 1.5f;
		total = preco * quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
