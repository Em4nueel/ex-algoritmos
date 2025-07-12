import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero real: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo numero real: ");
        double segundoNumero = scanner.nextDouble();

        double soma = primeiroNumero + segundoNumero;

        System.out.println("Resultado da soma: " + soma);

        scanner.close();

    }
}