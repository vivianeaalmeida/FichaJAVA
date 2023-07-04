package PL02;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 18 ***");
        double valorIliquido, subsidioAlimentacao, retencaoIrs, segSocial, valorLiq;
        int codFuncionario, diasTrabalhados;
        String cargo;
        //SOLICITAÇÃO DE DADOS AO FUNCIONÁRIO
        System.out.println("Insira o seu código de funcionário: ");
        codFuncionario = input.nextInt();

        System.out.println("Insira o número de dias trabalhados: ");
        diasTrabalhados = input.nextInt();

        System.out.println("Cargo? E-empregado | C-chefe | A-Administrador: ");
        cargo = input.next(); //não validou o uppercase, ver depois
        if(!cargo.equals("e") && !cargo.equals("c") && !cargo.equals("a")){
            System.out.println("Cargo Inválido");
        }
        //VALORES FIXOS
        final int REFEICAO_EMPREGADOS = 5;
        final double REFEICAO_ADM_CHEFE = 7.5;
        final int SALARIO_EMPREGADO = 40;
        final int SALARIO_CHEFE = 60;
        final int SALARIO_ADMINISTRADOR = 80;
        //CALCULO SALARIOS
        if(cargo.equals("e")){
            valorIliquido = SALARIO_EMPREGADO * diasTrabalhados;
            subsidioAlimentacao = REFEICAO_EMPREGADOS * diasTrabalhados;
            segSocial = valorIliquido * 0.35;
            //retencaoIrs - fazer function depois
            if(valorIliquido < 1000){
                retencaoIrs = valorIliquido * 0.1;
            } else {
                retencaoIrs = valorIliquido * 0.2;
            }
            valorLiq = (valorIliquido - segSocial - retencaoIrs) + subsidioAlimentacao;
            System.out.println(valorLiq);
            //fazer function qdo permitido

        } else if (cargo.equals("c")) {
            valorIliquido = SALARIO_CHEFE * diasTrabalhados;
            subsidioAlimentacao = REFEICAO_ADM_CHEFE * diasTrabalhados;
            segSocial = valorIliquido * 0.3;
            //retencaoIrs - fazer function depois
            if(valorIliquido < 1000){
                retencaoIrs = valorIliquido * 0.1;
            } else {
                retencaoIrs = valorIliquido * 0.2;
            }
            valorLiq = (valorIliquido - segSocial - retencaoIrs) + subsidioAlimentacao;
            System.out.println(valorLiq);

        } else {
            valorIliquido = SALARIO_ADMINISTRADOR * diasTrabalhados;
            subsidioAlimentacao = REFEICAO_ADM_CHEFE * diasTrabalhados;
            segSocial = valorIliquido * 0.3;
            //retencaoIrs - fazer function depois
            if(valorIliquido < 1000){
                retencaoIrs = valorIliquido * 0.1;
            } else {
                retencaoIrs = valorIliquido * 0.2;
            }
            valorLiq = (valorIliquido - segSocial - retencaoIrs) + subsidioAlimentacao;
            System.out.println(valorLiq);
        }
    }
}
