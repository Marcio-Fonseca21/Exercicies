/*****************************************************************************************************************
* 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
* 		V = 3.14159 * R * R * A
* 		Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
*****************************************************************************************************************/

import java.util.Scanner;

/**
 * CacularRaio
 */
public class CalcularRaio {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double V,R,A;

        System.out.printf("Calcular e apresentar o valor do volume de uma lata de óleo\n\n");

        System.out.println("Digite o valor da Altura: ");
        A = entrada.nextDouble();

        System.out.println("Digite o valor do raio: ");
        R = entrada.nextDouble();
        // math.pi e uma constante aproximada de pi = 3.14159
        V = Math.PI * R * R * A;

        System.out.printf("O Valor do volume da lata é : %.2f", V);

        entrada.close();

    }


}