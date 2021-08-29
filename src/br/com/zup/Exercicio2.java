package br.com.zup;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //criando variaveis
        String tipoDeCombustivel;
        double litrosVendidos;
        double precoLitro = 0;
        double descontoLitro = 0;
        double descontoTotal = 0;
        double precoSemDesconto = 0;
        double precoTotal = 0;



        //recebendo dados do usúario
        System.out.println("Olá, vamos calcular o valor que você terá que pagar!");
        System.out.println("Por favor, digite qual o tipo de combustível que você abasteceu seguindo a tabela: ");
        System.out.println("Dígite A - Alcool");
        System.out.println("Digite G - Gasolina");
        tipoDeCombustivel = leitor.nextLine();
        System.out.println("Agora quantos litros você abasteceu");
        litrosVendidos = leitor.nextDouble();

        //atribuindo desconto
        if (tipoDeCombustivel.equals("A") | tipoDeCombustivel.equals("a")){
            if (litrosVendidos > 0 & litrosVendidos <= 20) {
                descontoLitro = 0.03;
            }
            else if (litrosVendidos > 20){
                descontoLitro = 0.05;
            }
            else{
                System.out.println("Valor dígitado inválido, digite novamente. ");
            }

            precoLitro = 1.9;
            descontoTotal = precoLitro * descontoLitro * litrosVendidos;
            precoSemDesconto = precoLitro * litrosVendidos;
            precoTotal = precoSemDesconto  - descontoTotal;

        }
        else if (tipoDeCombustivel.equals("G") | tipoDeCombustivel.equals("g")){
            if (litrosVendidos > 0 & litrosVendidos <= 20){
                descontoLitro= 0.04;
            }
            else if (litrosVendidos > 20){
                descontoLitro = 0.06;
            }
            else {
                System.out.println("Valor dígitado dos Litros inválido, digite novamente. ");
            }

            precoLitro = 2.5;
            descontoTotal = precoLitro * descontoLitro * litrosVendidos;
            precoSemDesconto = precoLitro * litrosVendidos;
            precoTotal = precoSemDesconto  - descontoTotal;

        }
        else {
            System.out.println("Você digitou um valor inválido para o tipo de combustível, digite novamente de acorto com a tabela.");
        }



        //Imprimindo Resultados
        System.out.println("Você abasteceu " + litrosVendidos + " Litros");
        System.out.println("O valor por litro é R$" + precoLitro);
        System.out.println("O total a pagar sem desconto é de R$ " + precoSemDesconto);
        System.out.println("O total de desconto é de R$ " + descontoTotal);
        System.out.println("O valor final a pagar é de R$ " + precoTotal);
    }

}
