package FichaPratica01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ler numero1
        System.out.print("preço produto 1:");
        double numero1 = input.nextInt();
        //ler numero2
        System.out.print("preço produto 2:");
        double numero2 = input.nextInt();
        //ler numero3
        System.out.print("preço produto 3:");
        double numero3 = input.nextInt();
        //calcular preço total
        double calculo = (numero1+numero2+numero3);
        //apresentar preço com desconto
        System.out.println("preço total:" + calculo);
        //calcular preço desconto
        double desconto = (numero1+numero2+numero3)*0.9;
        //apresentar preço com desconto
        System.out.println("preço total com 10% de desconto:" + desconto);
    }
}
