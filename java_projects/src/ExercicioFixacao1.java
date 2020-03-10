
public class ExercicioFixacao1 {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa";
		
		int idade = 38;
		int codigo = 9258;
		int genero = 'M';
		
		double preco1 = 3550.90;
		double preco2 = 235.85;
		double medida = 2.5;
		
		System.out.println("Produtos:");
		System.out.printf("%s, está custando R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, está custando R$ %.2f%n", produto2, preco2);
		System.out.println();
		System.out.printf("Registo de %d anos atrás, código %d e do Genero: %n", idade, codigo, genero);

	}

}
