public class Exer7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};

        //a)
        int total = 0;
        for(int i = 0; i < 10; i++){
            total = total + a[i];
        }
        System.out.println(total);

        //b)
        /*total = 0;
        for(int i = 10; i < 10; i = i + 2){
            total = total + a[i];*//*
        }Erro nao funciona*/
        System.out.println(total);

        //c)
        total = 0;
        for(int i = 1; i < 10; i = i + 2){
            total = total + a[i];
        }
        System.out.println(total);

        /*//d)
        total = 0;
        for(int i = 2; i <= 10; i++){
            total = total + a[i];
        }
        System.out.println(total);

        Erro Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        */

        //e)
        total = 0;
        for(int i = 1; i < 10; i = 2 * i){
            total = total + a[i];
        }
        System.out.println(total);

        //f)
        total = 0;
        for(int i = 9; i >= 0; i--){
            total = total + a[i];
        }
        System.out.println(total);

        //g)
        total = 0;
        for(int i = 9; i >= 0; i = i -2){
            total = total + a[i];
        }
        System.out.println(total);

        //h)
        total = 0;
        for(int i = 0; i < 10; i++){
            total = a[i] - total;
        }
        System.out.println(total);
    }
}
