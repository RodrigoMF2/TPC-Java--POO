public class Exer1 {
    public static void main(String[] args) {
        int [][] board = new int[8][8];
        int counter = 0;
        for (int i = 0; i < 8; i++ ) {
            for (int j = 0; j < 8; j++) {
                if (counter == 0) {
                    System.out.print(counter + "\t");
                    counter++;
                }
                else {
                    System.out.print(counter + "\t");
                    counter--;
                }
                if (j == 7)
                    System.out.print("\n");

            }
            if( i % 2 == 0)
                counter = 1;
            else
                counter = 0;
        }
    }
}
