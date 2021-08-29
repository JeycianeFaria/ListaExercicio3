package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Recebendo dados do Leitor
        System.out.println("Digite o valor que você receb por hora trabalhada: ");
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
        double valorIRPorcentagem = valorImpostoRenda * 100;
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


        //Imprimindo resultados
        System.out.println("Salário Bruto : (" + valorHora + " * " + qtdHorasTrabalhadas + ") : " + salarioBruto);
        System.out.println("(-) IR (" + valorIRPorcentagem + "%) : " + descontoImpostoRenda);
        System.out.println("(-) INSS (" + valorInssPorcentagem + "%) : " + descontoInss);
        System.out.println("FGTS (" + valorFgtsPorcentagem + "%) : " + valorCalculadoFgts);
        System.out.println("Total de descontos  :" + totalDescontos);
        System.out.println("Salário Líquido : " + salarioLiquido);


        //Está faltando só estruturar o que vai imprimir com o printf

    }

}
