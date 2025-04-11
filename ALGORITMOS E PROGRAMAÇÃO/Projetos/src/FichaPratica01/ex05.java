package FichaPratica01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ler numero1
        System.out.print("introduzir primeiro nº:");
        double numero1 = input.nextInt();
        //ler numero2
        System.out.print("introduzir segundo nº:");
        double numero2 = input.nextInt();
        //ler numero3
        System.out.print("introduzir terceiro nº:");
        double numero3 = input.nextInt();
        //calcular media aritmética
        double calculo = (numero1+numero2+numero3)/3;
        //apresentar media aritmetica
        System.out.println("média aritmética:" + calculo);
        //calcular media ponderada
        double media = (numero1*0.2)+(numero2*0.3)+(numero3*0.5);
        //apresentar media aritmetica
        System.out.println("média ponderada:" + media);

    }
}
