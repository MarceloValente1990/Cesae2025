package FichaPratica01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //ler numero 1
        System.out.print("introduzir um número:");
         int numero1 = input.nextInt();
    //ler numero 2
        System.out.print("introduzir um número:");
        int numero2 = input.nextInt();
    //calcular soma
         int soma = numero1+numero2;
    //apresentar soma
        System.out.println("soma:" + soma);



    }
}
