import java.util.Scanner;

public class ConversorDeTemperatura {

	public static void main(String[] args) {
		// Camilly
		// Declaração de Variaveis
		double C, F;
		int opçao;

		// Criação e instancia do objeto de entrada
		Scanner entrada = new Scanner(System.in);

		// Apresentação
		System.out.println("\n\t\t\t --- Conversor de Temperatura --- \n");

		// Gabriel
        
		// Menu
		System.out.println("Escolha a opção:");
		System.out.println("1. Converter de Celsius para Fahrenheit");
		System.out.println("2. Converter de Fahrenheit para Celsius");
		System.out.println("3. Sair");

		opçao = entrada.nextInt();

		// Felipe
		if (opçao == 1) {
			// Entradas
			System.out.print("Informe Celsius: ");
			C = entrada.nextDouble();

			// Processamento
			F = 9 * C / 5 + 32;

			// Saída
			System.out.println("\nFahrenheit= " + F + "\n\n");

			// Leticia
		} else if (opçao == 2) {
			// Entradas
			System.out.print("Informe Fahrenheit: ");
			F = entrada.nextDouble();

			// Processamento
			C = (F - 32) * 5 / 9;

			// Saída
			System.out.println("\nCelsius= " + C + "\n\n");

		} else if (opçao == 3) {
			System.out.println("Tchau, volte sempre!");

		} else {
			System.out.println("Opção " + opçao + " Incorreta!");
		}

	}
}
