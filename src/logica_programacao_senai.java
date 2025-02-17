import java.util.Scanner;

public class logica_programacao_senai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float media;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) /3;

        System.out.println("A media das notas é: " + media);

        scanner.close();
    }
}