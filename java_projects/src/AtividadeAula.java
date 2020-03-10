import java.util.Locale;

public class AtividadeAula {

	public static void main(String[] args) {
		double x = 10.3785;
		String nome = "Maria";
		int idade = 94;
		double salario = 5895.59;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros%n", + x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, salario);

	}

}
