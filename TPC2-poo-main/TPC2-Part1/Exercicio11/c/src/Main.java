public class Main {
    public static void main(String[] args) {


            int[] lista = {1, 7, 2, 9};
            int [] soma = new int[lista.length];

            soma[0] = lista[0];
            for (int i = 0; i < lista.length; i++) {
                soma[i+1] = soma[i] + lista[i+1];
                System.out.print(soma[i] + " ");
            }

        }

    }
    
