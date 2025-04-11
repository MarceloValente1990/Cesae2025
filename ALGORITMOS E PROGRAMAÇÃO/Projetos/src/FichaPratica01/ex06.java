package FichaPratica01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ler numero1
        System.out.print("introduzir primeiro nº:");
        int valor1 = input.nextInt();
        System.out.println("valor1: " + valor1);
        //ler numero2
        System.out.print("introduzir segundo nº:");
        int valor2 = input.nextInt();
        System.out.println("valor2: " + valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("valor1: " + valor1 + " valor2: " + valor2);




    }
}
