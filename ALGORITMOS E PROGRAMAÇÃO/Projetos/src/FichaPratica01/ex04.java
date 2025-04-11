package FichaPratica01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ler raio
        System.out.print("introduzir o raio:");
        double raio = input.nextInt();
        //calcular area circunferencia
        double calculo = 2*3.14*raio;
        //apresentar area
        System.out.println("área circunferência:" + calculo);

    }
}
