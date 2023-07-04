import java.util.Scanner;

public class salarioLiqTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 01 EX 10 - XPTO ***");
        //DECLARAR VARIÁVEIS
        //ints aqui, pois são numeros exatos (?) e double pelas porcentagens
        int codigoDoFuncionario, numeroDeDiasTrabalhados, totalBruto, subAlimentacao;
        double retencaoIrs, retencaoSegSoc, valorLiqAReceber, descontoIrs, descontoSegSocial;
        //DECLARAR CONSTANTES
        final int VENCIMENTO_BASE = 40;
        final int SUBS_ALIMENTACAO = 5;
        final double RETENCAO_IRS = 0.10;
        final double SEG_SOCIAL = 0.35; //34.75% ??
        //ENTRADAS NO CONSOLE
        System.out.println("Introduza o código do funcionário: ");
        codigoDoFuncionario = input.nextInt();
        System.out.println("Numero de Dias Trabalhados: ");
        numeroDeDiasTrabalhados = input.nextInt();

        //valor iliquido (bruto) a receber fruto do vencimento
        totalBruto = numeroDeDiasTrabalhados * VENCIMENTO_BASE;
        System.out.println(totalBruto);
        //total subsidio alimentação
        subAlimentacao = numeroDeDiasTrabalhados * SUBS_ALIMENTACAO;
        System.out.println(subAlimentacao);
        //valor da retencao do IRS
        descontoIrs = totalBruto * RETENCAO_IRS;
        System.out.println(descontoIrs);
        retencaoIrs = totalBruto - descontoIrs;
        System.out.println(retencaoIrs);
        //valor seg. social
        descontoSegSocial = totalBruto * SEG_SOCIAL;
        retencaoSegSoc = totalBruto - descontoSegSocial;
        System.out.println(retencaoSegSoc);
        //valor liquido a receber
        System.out.println("TESTE ESSE E O TOTAL BRUTO: " + totalBruto + " " + subAlimentacao);
        valorLiqAReceber = (totalBruto + subAlimentacao) - (retencaoIrs - retencaoSegSoc);
        System.out.println("Valor Liquido a Receber: " + valorLiqAReceber);



    }
}



//const VENCIMENTO_BASE = 40
//const SUBSIDIO_ALIMENTACAO = 5
//const RETENÇÃO_IRS = 0.1
//const SEG_SOCIAL = 34.75% -> 0.35 ??
/*
corrigir linhas 30+
Introduza o código do funcionário: 
1234
Numero de Dias Trabalhados: 
2
80
10
8.0
72.0
52.0
TESTE ESSE E O TOTAL BRUTO: 80 10
Valor Liquido a Receber: 70.0

Process finished with exit code 0
 */
