package View;

import java.util.Scanner;
import Controller.somatoria;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        somatoria som = new somatoria();

        System.out.println("insira um valor para receber o resultado da somatória: ");
        int n = scan.nextInt();

        System.out.println("Resultado: " + som.funcSom(n));




    }

}
