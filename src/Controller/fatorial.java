package Controller;

public class fatorial {

    public fatorial() {

        super();

    }


    public int funcFat (int n) {

        // Controle do limite do fatorial
        if(n <= 1) {
            return 1;
        }

        // Multiplicando o valor da iteração com o anterior
        return n * (funcFat(n - 1));

    }
}
