import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota do terceiro bimestre: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a nota do quarto bimestre: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é: " + media);

    }
}