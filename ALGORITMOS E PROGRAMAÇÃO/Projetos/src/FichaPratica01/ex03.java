package FichaPratica01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ler largura
        System.out.print("introduzir a largura:");
        int largura = input.nextInt();
        //ler comprimento
        System.out.print("introduzir o comprimento:");
        int comprimento = input.nextInt();
        //calcular area
        int calculo = largura*comprimento;
        //apresentar area
        System.out.println("área retângulo:" + calculo);
        //calcular perimetro
        int perimetro = (2*largura)+(2*comprimento);
        //apresentar perimetro
        System.out.println("perímetro:" + perimetro);
    }
}
