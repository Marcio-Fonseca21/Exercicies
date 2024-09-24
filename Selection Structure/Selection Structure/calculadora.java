public class TrocaDeValores {

    public static void main(String[] args) {
       /*******************************************************************************
* Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
* valores de modo que a variável A passe a possuir o valor da variável B, e a
* variável B passe a possuir o valor da variável A. Apresentar os valores
* trocados.
*******************************************************************************/
       
       int [] valorA = {3}; 
       int [] valorB = {6};
       int variavelTemporaria ; 
       variavelTemporaria = valorA[0];//3
       valorA[0] = valorB[0];//A 6
       valorB[0] = variavelTemporaria;// B 3
        System.out.println("A " +valorA[0]);
        System.out.println("B " +valorB[0]);
 
    }
}
