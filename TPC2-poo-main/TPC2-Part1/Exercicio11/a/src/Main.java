import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int menor = 0;

        System.out.print("Primeiro numero: ");
        int a = scanner.nextInt();
        System.out.print("Segundo numero: ");
        int b = scanner.nextInt();

        if (a > b) {
            maior = a;
            menor = b;
        }
        else {
            maior = b;
            menor = a;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }

}
