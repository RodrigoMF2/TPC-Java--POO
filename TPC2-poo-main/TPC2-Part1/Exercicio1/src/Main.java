public class Main {
    public static void main(String[] args) {
        int i =0;
        int n=100;

        while(i*i<n){
            System.out.print(i*i + "\t");
            i++;
        }
        while(i<n){
            if(i%10 ==0 && i>0){
                System.out.print(i + "\t");
            }
            i++;
        }
        while(i<n){
            System.out.print(i + "\t");
            i*=2;
        }

        }

    }
