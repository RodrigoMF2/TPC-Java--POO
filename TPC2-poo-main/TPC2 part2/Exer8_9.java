import java.util.Random;

public class Exer8_9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int counter=0;
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = gerador.nextInt(101);
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i <= 9; i++)
            System.out.println(array[i] * array[i+1] + "\t");

        for (int i = 0; i <= 9; i++)
            if(array[i] < 0)
                counter++;
        System.out.println(counter);
    }
}
