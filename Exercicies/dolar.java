package Exercicios;
/*************************************************************************
 *    Faça um programa que: 
 *  - Leia a cotação do dólar 
 *  - Leia um valor em dólares
 *  - Converta esse valor para Real 
 *  - Mostre o resultado 
 *************************************************************************/

import java.util.Scanner;

/**
 * dolar
 */
public class dolar {

    
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);

        double cotacao,dolar,convert,soma;
        
        System.out.println("Conversor dolar para real");

        System.out.println("Digite o valor do dolar");
        cotacao = entrada.nextDouble();

        System.out.printf("Digite um valor em Dolar ");
        dolar = entrada.nextDouble();

        soma = cotacao * dolar;
        convert = soma * 1;

        System.out.printf("O valor em real é: %.2f", convert);


        entrada.close();
    }

}
