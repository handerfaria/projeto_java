package MaiorValorMenorValor;

import java.util.Scanner;
public class Diferencas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A  = input.nextInt() ;

        System.out.println("Digite o valor de B: ");
        int B = input.nextInt();

        int diferenca;

        if (A > B) {
            diferenca = A - B;
        } else {
            diferenca = B - A;
        }
        System.out.println("A diferença entre o maior e menor é: " + diferenca);

        input.close();

    }

}
