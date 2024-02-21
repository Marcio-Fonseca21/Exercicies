/*******************************************************************************
* Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

import java.util.Scanner;

/**
 * TrocaVariavel
 */
public class trocaVariavel {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);


        int A,B;

        System.out.println("Digite o primeiro numero");
        A = input.nextInt();
        System.out.println("Digite o primeiro numero");
        B = input.nextInt();
        
        if(A == B){
            System.out.println("Igual");
        }
        if(A != B){
            System.out.println("A diferente de B");
        }
        if(A > B){
            System.out.println("A maior que B");
        }
        input.close();
    }

}