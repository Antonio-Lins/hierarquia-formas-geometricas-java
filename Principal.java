import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Forma> formas = new ArrayList<>();

        System.out.print("Quantas formas deseja criar? ");
        int quantidadeFormas = scanner.nextInt();

        for (int i = 0; i < quantidadeFormas; i++) {
            System.out.println("\nForma " + (i + 1) + ":");
            System.out.print("Escolha (1) Quadrado, (2) Retângulo, ou (3) Círculo: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tamanho do lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    formas.add(new Quadrado(lado));
                    break;

                case 2:
                    System.out.print("Digite o tamanho da base do retângulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite o tamanho da altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    formas.add(new Retangulo(base, altura));
                    break;

                case 3:
                    System.out.print("Digite o tamanho do raio do círculo: ");
                    double raio = scanner.nextDouble();
                    formas.add(new Circulo(raio));
                    break;

                default:
                    System.out.println("Opção inválida!");
                    i--;
                    break;
            }
        }

        System.out.println("\nFormas criadas:");
        for (Forma forma : formas) {
            System.out.println(forma.toString());
            System.out.printf("Perímetro: %.2f\n", forma.calcularPerimetro());
            System.out.printf("Área: %.2f\n\n", forma.calcularArea());
        }

        scanner.close();
    }
}
