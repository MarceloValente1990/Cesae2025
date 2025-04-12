package FichaPratica01;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ler cod funcionario
        System.out.print("Introduza o Código de Funcionário:");
        int codigoFuncinario = input.nextInt();
        //ler dias
        System.out.print("Introduza o nº de dias trabalhados:");
        int diasTrabalhados = input.nextInt();

        //calcular vencimento base
        int vencimentoBase = 40*diasTrabalhados;
        //calcular Sub Alimentação
        int subAlimentacao = 5*diasTrabalhados;
        //calcular retenção IRS
        double IRS = vencimentoBase*0.1;
        //calcular Segurança Social
        double segSocialFun = vencimentoBase*0.11;
        double segSocialPatrao = vencimentoBase*0.2375;
        double segSocial = segSocialFun + segSocialPatrao;
        //calcular valor liquido funcinario
        double valorLiquido = vencimentoBase+subAlimentacao-IRS-segSocialFun;

        //apresentar codigo funcionario
        System.out.println("Código Funcionário: " + codigoFuncinario);
        //apresentar valor iliquido do vencimento
        System.out.println("Valor ilíquido do vencimento: " + vencimentoBase);
        //apresentar valor total subsidio alimentacao
        System.out.println("Valor Total subsídio de alimentação: " + subAlimentacao);
        //apresentar valor retenção IRS
        System.out.println("Valor retenção IRS: " + IRS);
        //apresentar valor retenção SS
        System.out.println("Valor retenção Sec Social: " + segSocial);
        //apresentar valor a receber pelo funcionario
        System.out.println("Valor líquido a receber: " + valorLiquido);




    }
}
