package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Recebendo dados do Leitor
        System.out.println("Digite o valor que você recebe por hora trabalhada: ");
        double valorHora = leitor.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double qtdHorasTrabalhadas = leitor.nextDouble();

        //Variaveis
        double salarioBruto = valorHora * qtdHorasTrabalhadas;
        double valorImpostoRenda = 0;
        double valorInss = 0.1;
        double valorFgts = 0.11;
        double descontoInss = salarioBruto * valorInss;
        double valorCalculadoFgts = salarioBruto * valorFgts;
        double descontoImpostoRenda;
        double salarioLiquido;
        double totalDescontos;
        double valorIRPorcentagem;
        double valorInssPorcentagem = valorInss * 100;
        double valorFgtsPorcentagem = valorFgts * 100;


        //calcular valor do desconto do Imposto de Renda
        if (salarioBruto > 0 & salarioBruto <= 900) {
            valorImpostoRenda = 0;
        } else if (salarioBruto > 900 & salarioBruto <= 1500) {
            valorImpostoRenda = 0.05;
        } else if (salarioBruto > 1500 & salarioBruto <= 2500) {
            valorImpostoRenda = 0.1;
        } else if (salarioBruto > 2500) {
            valorImpostoRenda = 0.2;
        }

        //calculos
        descontoImpostoRenda = salarioBruto * valorImpostoRenda;
        totalDescontos = descontoImpostoRenda + descontoInss;
        salarioLiquido = salarioBruto - totalDescontos;
        valorIRPorcentagem = valorImpostoRenda * 100;


        //imprimir com o printf

        System.out.print("Salário Bruto : (" + valorHora + " * " + qtdHorasTrabalhadas + ")");
        System.out.printf("\t\t\t : R$%10.2f %n", salarioBruto);
        System.out.print("(-) IR (" + valorIRPorcentagem + "%)");
        System.out.printf("\t\t\t\t\t\t\t : R$%10.2f %n", descontoImpostoRenda);
        System.out.print("(-) INSS (" + valorInssPorcentagem + "%)");
        System.out.printf("\t\t\t\t\t\t : R$%10.2f %n", descontoInss);
        System.out.print("FGTS (" + valorFgtsPorcentagem + "%)");
        System.out.printf("\t\t\t\t\t\t\t : R$%10.2f %n", valorCalculadoFgts);
        System.out.print("Total de descontos ");
        System.out.printf("\t\t\t\t\t\t : R$%10.2f %n", totalDescontos);
        System.out.print("Salário Líquido");
        System.out.printf("\t\t\t\t\t\t\t : R$%10.2f ", salarioLiquido);

    }

}
