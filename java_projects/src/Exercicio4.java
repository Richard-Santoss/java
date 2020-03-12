import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, horasTrabalhadas;
		double valorHora, salario;
		
		codigo = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("Numero = " + codigo);
		System.out.printf("Salario = R$ %.2f%n", salario);
		
		sc.close();

	}

}
