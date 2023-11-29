import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            char escolha = scanner.next().charAt(0);

            switch (escolha) {
                case '1':
                    conversorDeMoedas();
                    break;
                case '2':
                    jogoDeAdivinhacao();
                    break;
                case '3':
                    manipulaArray();
                    break;
                case '4':
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
        System.out.println("1. Conversor de Moedas");
        System.out.println("2. Jogo de Adivinhação");
        System.out.println("3. ManipulaArray");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção (1-4): ");
    }

    private static void conversorDeMoedas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        System.out.print("Digite a taxa de câmbio: ");
        double taxaCambio = scanner.nextDouble();

        double valorConvertido = quantidadeDolares * taxaCambio;

        System.out.printf("Valor convertido: %.2f%n", valorConvertido);
    }

    private static void jogoDeAdivinhacao() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinhar = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroAdivinhar) {
                System.out.println("Muito alto. Tente novamente.");
            } else if (palpite < numeroAdivinhar) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }

        } while (palpite != numeroAdivinhar);
    }

    private static void manipulaArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] arrayUsuario = criarArrayUsuario(tamanho);
        int[] arrayAleatorio = criarArrayAleatorio(tamanho);

        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        System.out.println("Soma do array do usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Maior valor do array do usuário: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor do array do usuário: " + encontrarMenorValor(arrayUsuario));
    }

    private static int[] criarArrayUsuario(int tamanho) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    private static int calcularSoma(int[] array) {
        int soma = 0;
        for (int valor : array) {
            soma += valor;
        }
        return soma;
    }

    private static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int valor : array) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    private static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int valor : array) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }
}
