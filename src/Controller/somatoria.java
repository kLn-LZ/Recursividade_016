package Controller;

import Controller.fatorial;




public class somatoria {

    fatorial fat = new fatorial();

    public somatoria() {
        super();
    }



    public double funcSom (int n ) {

        // Controle do limite da somatória
        if (n == 1) {

            return 1;

        }

        // Regra da somatória
        return (double) 1/(double) fat.funcFat(n) + funcSom(n - 1);
    }


}
