package FichaPratica01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ler minuto1
        System.out.print("Introduza minutos da música 1:");
        int minuto1 = input.nextInt();
        //ler segundos1
        System.out.print("Introduza segundos da música 1:");
        int segundos1 = input.nextInt();
        //ler minuto2
        System.out.print("Introduza minutos da música 2:");
        int minuto2 = input.nextInt();
        //ler segundos2
        System.out.print("Introduza segundos da música 2:");
        int segundos2 = input.nextInt();
        //ler minuto3
        System.out.print("Introduza minutos da música 3:");
        int minuto3 = input.nextInt();
        //ler segundos3
        System.out.print("Introduza segundos da música 3:");
        int segundos3 = input.nextInt();
        //ler minuto4
        System.out.print("Introduza minutos da música 4:");
        int minuto4 = input.nextInt();
        //ler segundos4
        System.out.print("Introduza segundos da música 4:");
        int segundos4 = input.nextInt();
        //ler minuto5
        System.out.print("Introduza minutos da música 5:");
        int minuto5 = input.nextInt();
        //ler segundos5
        System.out.print("Introduza segundos da música 5:");
        int segundos5 = input.nextInt();
        //calcular total minutos e segundos
        int totalMinuto = minuto1+minuto2+minuto3+minuto4+minuto5;
        int totalSegundo = segundos1+segundos2+segundos3+segundos4+segundos5;

        totalMinuto += totalSegundo/60;
        int segundo = totalSegundo % 60;

        int horas = totalMinuto / 60;
        int minutos = totalMinuto % 60;

        //apresentar Total
        System.out.println("Total do Álbum:" + horas + "H  " + minutos + "m  " + segundo + "sec");



    }
}
