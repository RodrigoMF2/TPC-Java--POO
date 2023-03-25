public class FitchFatch {
    private String x = "x";
    private String o = "o";
    private String ini = "";

    String [][] table = new String[3][3];

    public void getP1Input(int i, int j){
        if (table[i][j] == ini)
            table[i][j] = x;
        else
            System.out.println("Nao pode jogar nessa casa , ela ja estava preenchida");

    }

    public void getP2Input(int i, int j) {
        if (table[i][j] == ini)
            table[i][j] = o;
        else
            System.out.println("Nao pode jogar nessa casa , ela ja estava preenchida");
    }
    public FitchFatch(){
        for(int i=0; i<3; i++)
            for (int j = 0; j < 3; j++)
                table[i][j] = ini;
    }
}
