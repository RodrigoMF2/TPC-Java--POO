public class Main {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 2; i <= 100; i += 2) {
            soma += i;
        }
        System.out.println("A soma de todos os números pares entre 2 e 100 é: " + soma);
        for (int i = 1; i <= 100; i++) {
            soma += (i*i);
        }
        System.out.println("A soma de todos os quadrados entre 1 e 100 é: " + soma);
        int a = 5;
        int b = 20;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                soma += i;
            }
        }
        System.out.println("A soma de todos os números ímpares entre " + a + " e " + b + " é: " + soma);
        int n = 32677;

        while (n > 0) {
            int digito = n % 10;
            if (digito % 2 == 1) {
                soma += digito;
            }
            n /= 10;
        }
        System.out.println("A soma de todos os dígitos ímpares de " + n + " é: " + soma);
    }
}