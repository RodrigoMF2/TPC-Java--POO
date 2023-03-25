import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        int n = 0;
        int cPar = 0;
        int cImpar = 0;

        do {

            System.out.print("Digite um numero: ");
            n = scanne.nextInt();

            if(n % 2 == 0){
                cPar++;
            }
            else {
                cImpar++;
            }

        } while (n > 0);

        System.out.println("Quantidade de numeros pares: " + cPar);
        System.out.println("Quantidade de numeros impares: " + cImpar);

    }

}
