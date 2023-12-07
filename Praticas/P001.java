import java.util.Scanner;

public class CalculadoraConversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            char escolha = scanner.next().charAt(0);

            switch (escolha) {
                case '1':
                    calculadora();
                    break;
                case '2':
                    conversorTemperatura();
                    break;
                case '3':
                    System.out.println("Saindo do programa. Até mais!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Calculadora");
        System.out.println("2. Conversor de Temperatura");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção (1-3): ");
    }

    private static void calculadora() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Escolha uma operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Por favor, insira números válidos.");
        }
    }

    private static void conversorTemperatura() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();

            System.out.print("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
            char unidadeOrigem = scanner.next().charAt(0);

            double resultado;
            String unidadeDestino;

            if (Character.toUpperCase(unidadeOrigem) == 'C') {
                resultado = (temperatura * 9/5) + 32;
                unidadeDestino = "Fahrenheit";
            } else if (Character.toUpperCase(unidadeOrigem) == 'F') {
                resultado = (temperatura - 32) * 5/9;
                unidadeDestino = "Celsius";
            } else {
                System.out.println("Unidade de origem inválida.");
                return;
            }

            System.out.printf("Resultado: %.2f %s%n", resultado, unidadeDestino);

        } catch (Exception e) {
            System.out.println("Por favor, insira uma temperatura válida.");
        }
    }
}
