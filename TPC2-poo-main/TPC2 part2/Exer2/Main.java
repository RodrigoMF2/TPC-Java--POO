import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        FitchFatch tabela = new FitchFatch();
        while(true){
            System.out.println("Player 1 selecione a posicao que deseja jogar: ");
            i = input.nextInt();
            j = input.nextInt();
            tabela.getP1Input(i, j);

            System.out.println("Player 1 selecione a posicao que deseja jogar: ");
            i = input.nextInt();
            j = input.nextInt();
            tabela.getP2Input(i, j);
        }

    }
}
