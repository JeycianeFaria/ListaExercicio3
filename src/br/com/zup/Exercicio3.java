package br.com.zup;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Recebendo dados
        System.out.println("Olá, eu sou um agente do FBI!");
        System.out.println("Preciso realizar algumas perguntas para você!");
        System.out.println("Por favor, responda para cada uma das perguntas da seguinte forma: ");
        System.out.println("S - SIM ");
        System.out.println("N - NÃO");

        int contadorRespostas = 0;


        System.out.println("Vamos começar!");
        System.out.println("Telefonou para a vítima?");
        String respostas = leitor.nextLine();
        if (respostas.equals("S") || respostas.equals("s")){
            contadorRespostas += 1;
        }

        System.out.println("Esteve no local do crime?");
        respostas = leitor.nextLine();
        if (respostas.equals("S") || respostas.equals("s")){
            contadorRespostas += 1;
        }

        System.out.println("Mora perto da vítima?");
        respostas = leitor.nextLine();
        if (respostas.equals("S") || respostas.equals("s")){
            contadorRespostas += 1;
        }

        System.out.println("Devia para a vítima?");
        respostas = leitor.nextLine();
        if (respostas.equals("S") || respostas.equals("s")){
            contadorRespostas += 1;
        }

        System.out.println("Já trabalhou com a vítima?" );
        respostas = leitor.nextLine();
        if (respostas.equals("S") || respostas.equals("s")){
            contadorRespostas += 1;
        }

        if (contadorRespostas == 2){
            System.out.println("Você é um suspeito do crime, por favor venha comigo!");
        }
        else if (contadorRespostas == 3 || contadorRespostas == 4){
            System.out.println("Você está preso, por ser cúmplice do crime!");
        }
        else if (contadorRespostas == 5){
            System.out.println("Você está preso, por ser o Assassino!");
        }
        else {
            System.out.println("Você é inocente, desculpe ter tomado seu tempo. Obrigado pela colaboração");
        }

    }

}
