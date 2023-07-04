package Lista04;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 04 EX 05 ***");
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


    }
}


/*
refazer com do while e "functions"


 */